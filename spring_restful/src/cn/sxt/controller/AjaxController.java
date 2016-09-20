package cn.sxt.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sxt.vo.User;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
	
	@GetMapping("/user")
	public void User(HttpServletResponse res) {
		User user = new User();
		user.setId(1);
		user.setFirstName("James");
		user.setLastName("Gu");
	}
}
