package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.vo.User;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User) context.getBean("user");
		user.show();
		
		User user1 = (User) context.getBean("user1");
		user1.show();
		
		// 工厂
		User user2 = (User) context.getBean("myuser");
		user2.show();
		
	}
}
