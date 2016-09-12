package cn.sxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.sxt.entity.User;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello(String name) {
		
		System.out.println("Param name: " + name);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Hello");
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("/user")
	public ModelAndView user(User user) {
		System.out.println(user.toString());
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Hello");
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("/map")
	public String map(@RequestParam("uname")String name, ModelMap model) {
		model.addAttribute("name", name);
		System.out.println("===" + name);
		return "hello";
	}
	
}
