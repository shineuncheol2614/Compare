package com.deu.compare.dao;

import java.util.List;

import com.deu.compare.domain.apiVO;
import com.deu.compare.util.PubMap;

public interface exchangeMapper {
	public void apiInsert(apiVO vo);
	public List<PubMap> apiSelect();
	public void deleteData();
}
