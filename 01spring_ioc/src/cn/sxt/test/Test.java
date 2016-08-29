package cn.sxt.test;

import cn.sxt.dao.impl.UserDaoImpl;
import cn.sxt.service.UserService;
import cn.sxt.service.impl.UserServiceImpl;

public class Test {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		userService.setUserDao(new UserDaoImpl());
		userService.getUser();
	}
}
