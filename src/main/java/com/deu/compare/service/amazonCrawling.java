package com.deu.compare.service;

import java.util.List;

import com.deu.compare.util.PubMap;

public interface amazonCrawling {
	public void crawling(String str);
	
	public List<PubMap> getData();
}
