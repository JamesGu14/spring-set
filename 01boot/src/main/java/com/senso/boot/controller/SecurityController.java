package com.senso.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/security")
public class SecurityController {
	
	@RequestMapping("/index")
	public String index() {
		return "security/index";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "security/hello";
	}
}
