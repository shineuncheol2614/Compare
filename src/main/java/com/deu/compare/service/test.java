package com.deu.compare.service;


import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {
   public static void main(String[] args) {
      String amazonURL = "https://www.amazon.com/s?k=samsung&ref=nb_sb_noss"; //<-(samsung)검색어를 넣으면 검색가능
      String url = "https://amazon.com/";
      // -> String keyword = "사용자에게 받은 값  ex) iphone";
      //String amazonURL = "https://www.amazon.com/s?k="+ keyword" + &ref=nb_sb_noss";
      try {
         Document amazon = Jsoup.connect(amazonURL).get();
         Elements amazonPrice = amazon.getElementsByClass("a-price-whole");        
         for(Element product : amazonPrice) {
            //TODO 각 줄을 데이터베이스에 insert시켜서 데이터 저장
            System.out.println(amazonPrice.text());
         }

      } catch (IOException e) {
         e.printStackTrace();
      }
      
   }
}