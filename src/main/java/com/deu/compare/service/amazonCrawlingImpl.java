package com.deu.compare.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.deu.compare.dao.CrawlingMapper;
import com.deu.compare.domain.CrawlingVO;
import com.deu.compare.util.PubMap;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
@Log4j
@Service
@AllArgsConstructor
@Primary
public class amazonCrawlingImpl implements amazonCrawling {
	@Setter(onMethod_ = @Autowired)
	private CrawlingMapper mapper;
	//public static void main(String[] args) {
	@Override
	public void crawling(String str) {
		mapper.delete();
		CrawlingVO vo = new CrawlingVO();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> price = new ArrayList<String>();
		ArrayList<String> strUrl = new ArrayList<String>();
		ArrayList<String> strImg = new ArrayList<String>();

		String amazonURL = "https://www.amazon.com/s?k="+str+"&ref=nb_sb_noss"; //<-(samsung)검색어를 넣으면 검색가능
		// -> String keyword = "사용자에게 받은 값  ex) iphone";
		//String amazonURL = "https://www.amazon.com/s?k="+ keyword" + &ref=nb_sb_noss";
	    //String url = "https://amazon.com/";

		try {
			Document amazon = Jsoup.connect(amazonURL).get();
			Elements amazonItems = amazon.getElementsByClass("a-size-medium a-color-base a-text-normal");
			Elements amazonPrice = amazon.getElementsByClass("a-price-whole");
	        Elements amazonUrl = amazon.getElementsByClass("a-link-normal a-text-normal");
	        Elements amazonImg = amazon.getElementsByClass("a-section aok-relative s-image-fixed-height");

			for(Element product : amazonItems) {
				name.add(product.text());
			}
			
			for(Element product : amazonPrice) {
				price.add(product.text());
			}
			
			for(Element product : amazonUrl) {
				strUrl.add(product.absUrl("href"));
			}
			
	         for(Element product : amazonImg) {
	        	 Elements tmp = product.select("img");
	        	 strImg.add(tmp.attr("src"));
	         }
	        
	       for(int i = 0; i<5;i++) {
	        	vo.setPName(name.get(i));
	        	vo.setPrice(price.get(i));
	        	vo.setUrl(strUrl.get(i));
	        	vo.setImage(strImg.get(i));
				mapper.insert(vo);
	        }
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	@Override
	public List<PubMap> getData() {
		return mapper.selectData();
		
	}
}

