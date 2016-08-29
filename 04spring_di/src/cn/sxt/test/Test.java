package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.vo.Student;
import cn.sxt.vo.User;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student) context.getBean("student");
		student.show();
		
		User user = (User) context.getBean("user");
		user.show();
		
		User user1 = (User) context.getBean("user1");
		user1.show();
				
	}
}
