package com.deu.compare.service;


import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {
   public static void main(String[] args) {
      String amazonURL = "https://www.amazon.com/s?k=samsung&ref=nb_sb_noss"; //<-(samsung)�˻�� ������ �˻�����
      String url = "https://amazon.com/";
      // -> String keyword = "����ڿ��� ���� ��  ex) iphone";
      //String amazonURL = "https://www.amazon.com/s?k="+ keyword" + &ref=nb_sb_noss";
      try {
         Document amazon = Jsoup.connect(amazonURL).get();
         Elements amazonPrice = amazon.getElementsByClass("a-price-whole");        
         for(Element product : amazonPrice) {
            //TODO �� ���� �����ͺ��̽��� insert���Ѽ� ������ ����
            System.out.println(amazonPrice.text());
         }

      } catch (IOException e) {
         e.printStackTrace();
      }
      
   }
}