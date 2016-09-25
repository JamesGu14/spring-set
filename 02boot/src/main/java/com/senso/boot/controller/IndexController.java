package com.senso.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class IndexController {
	
	protected Logger logger;
	
	public IndexController() {
	  logger = LoggerFactory.getLogger(getClass());
  }
	
	@RequestMapping("/")
	public String index(ModelMap map) {
		logger.info("==========Index Controller");
		map.addAttribute("host", "http://bing.com");
		
		return "index";
	}
	 
	@RequestMapping("/home")
	public String home(ModelMap map) {
		return "home";
	}
	
	@RequestMapping("/exception")
	public String exception() throws Exception {
		throw new Exception("what");
	}
	
}
