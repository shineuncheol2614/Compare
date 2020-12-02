package com.deu.compare.service;


import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {
   public static void main(String[] args) {
      String amazonURL = "https://www.amazon.com/s?k=gtx&ref=nb_sb_noss_2"; //<-(samsung)검색어를 넣으면 검색가능
      String url = "https://amazon.com/";
      // -> String keyword = "사용자에게 받은 값  ex) iphone";
      //String amazonURL = "https://www.amazon.com/s?k="+ keyword" + &ref=nb_sb_noss";
      try {
         Document amazon = Jsoup.connect(amazonURL).get();
	     Elements amazonImg = amazon.getElementsByClass("a-section aok-relative s-image-fixed-height");
	     System.out.println(amazon);

         for(Element product : amazonImg) {
        	 Elements tmp = product.select("img");
        	 String img = tmp.attr("src");
            System.out.println(img);
         }

      } catch (IOException e) {
         e.printStackTrace();
      }
      
   }
}