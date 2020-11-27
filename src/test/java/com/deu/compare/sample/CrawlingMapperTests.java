package com.deu.compare.sample;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.deu.compare.dao.CrawlingMapper;
import com.deu.compare.domain.CrawlingVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CrawlingMapperTests {
	@Setter(onMethod_ = @Autowired)
	private CrawlingMapper mapper;
	
	@Test
	public void insert() {
		CrawlingVO cra = new CrawlingVO();
		cra.setPName("iphone");
		cra.setPrice("50");
		cra.setUrl("www.naver.com");
		cra.setInsrtUserId("shin");
		mapper.insert(cra);
		log.info(cra);
	}
}
