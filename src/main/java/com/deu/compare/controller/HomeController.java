package com.deu.compare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.deu.compare.service.amazonCrawling;
import com.deu.compare.service.openapiService;

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
	private openapiService api;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@GetMapping("/main")
	//@RequestMapping(value = "/main")
	public String main(Model model) {
		
		service.crawling();
		//api.setAPI();
		
		model.addAttribute("krw",api.getAPI());
		model.addAttribute("amazon",service.getData());
		log.info("excute");
		
		return "main";
	}
	
}
