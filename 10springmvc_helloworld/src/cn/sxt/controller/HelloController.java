package cn.sxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Hello");
		mv.setViewName("hello");
		return mv;
	}
}
