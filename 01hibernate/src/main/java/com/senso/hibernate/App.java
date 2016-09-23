package com.senso.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.senso.pojo.*;

/**
 * Hello world!
 *
 */
public class App {
	
	/**
	 * 1. 新建Configuration对象
	 * 2. 通过Configuration创建SessionFactory对象
	 * 3. 通过SessionFactory得到Session
	 * 4. 通过session对象得到Transaction对象
	 * 5. 保存数据
	 * 6. 提交事务
	 * 7. 关闭Session
	 */
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		SystemUser systemUser = new SystemUser();
//		systemUser.setEmailaddress("test@gmail.com");
//		systemUser.setFirstname("James");
//		systemUser.setLastname("Gu");
//		systemUser.setPassword("123");
//		systemUser.setUsername("james3299");
//		systemUser.setUserrole(1);
//		session.save(systemUser);
		
		Employee employee = new Employee();
		employee.setEmp_no(1);
		employee.setBirth_date(new Date());
		employee.setFirst_name("First");
		employee.setGender('M');
		employee.setHire_date(new Date());
		employee.setLast_name("Last");
		session.save(employee);
		
		transaction.commit();
		session.close();
	}
}
