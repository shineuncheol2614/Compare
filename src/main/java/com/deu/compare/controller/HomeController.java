package com.deu.compare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		
		service.crawling("samsung");
		api.setAPI();
		
		model.addAttribute("krw",api.getAPI());
		model.addAttribute("amazon",service.getData());
		log.info("excute");
		
		return "main";
	}
	
	@GetMapping("/apple")
	//@RequestMapping(value = "/main")
	public String Apple(Model model) {
		
		service.crawling("iphone");
		api.setAPI();
		
		model.addAttribute("krw",api.getAPI());
		model.addAttribute("amazon",service.getData());
		log.info("excute");
		
		return "apple";
	}
	
	@GetMapping("/nokia")
	//@RequestMapping(value = "/main")
	public String LG(Model model) {
		
		service.crawling("nokia");
		api.setAPI();
		
		model.addAttribute("krw",api.getAPI());
		model.addAttribute("amazon",service.getData());
		log.info("excute");
		
		return "main";
	}

	// @PostMapping("/exchange")
	@RequestMapping(value = "/exchange", method = { RequestMethod.GET, RequestMethod.POST })
	public String Exchange(Model model) {
		log.info("excute");

		model.addAttribute("krw",api.getAPI());
		return "exchange";

	}

	@GetMapping("/bookmark")
	// @RequestMapping(value = "/main")
	public String Bookmark(Model model) {
		log.info("excute");

		model.addAttribute("krw",api.getAPI());
		return "bookmark";
	}

}
