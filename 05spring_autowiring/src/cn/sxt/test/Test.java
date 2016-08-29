package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.service.UserService;
import cn.sxt.service.impl.UserServiceImpl;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserServiceImpl) context.getBean("service");
		userService.getUser();
	}
}
