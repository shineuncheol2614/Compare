package com.deu.compare.dao;

import java.util.List;

import com.deu.compare.domain.CrawlingVO;
import com.deu.compare.util.PubMap;

public interface CrawlingMapper {
	public void insert(CrawlingVO cra);
	public List<PubMap> selectData();
	public void delete();
}
