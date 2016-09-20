package cn.sxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String Home(String name, ModelMap model) {
		System.out.println("=====" + name);
		model.addAttribute("msg", "Hello, " + name);
		return "index";
	}
	
	@RequestMapping(path="/{id}/delete", method=RequestMethod.POST)
	public String Home(@PathVariable int id) {
		System.out.println("id: " + id);
		return "index";
	}
}
