package com.deu.compare.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deu.compare.service.amazonCrawling;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@Log4j
@AllArgsConstructor
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private amazonCrawling service;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/main")
	public String home() {
		service.crawling();
		log.info("excute");
		
		return "main";
	}
	
}
