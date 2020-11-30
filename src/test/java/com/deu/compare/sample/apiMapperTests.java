package com.deu.compare.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.deu.compare.dao.exchangeMapper;
import com.deu.compare.domain.apiVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class apiMapperTests {
	@Setter(onMethod_ = @Autowired)
	private exchangeMapper mapper;
	
	@Test
	public void insert() {
		apiVO cra = new apiVO();
		cra.setCur_unit("usd");
		cra.setKrw("2000");
		mapper.apiInsert(cra);
		log.info(cra);
	}
}

