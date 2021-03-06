package com.senso.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("/")
	public String index(ModelMap map) {
		
		map.addAttribute("host", "http://www.google.com");
		
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
