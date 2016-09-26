package com.senso.boot.controller;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senso.boot.entity.Employees;
import com.senso.boot.mapper.EmployeesMapper;
import com.senso.boot.serviceImpl.EmployeeServiceImpl;
import com.senso.boot.util.MyBatisUtil;

@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class HelloController {
	
	@Value("${com.senso.custom.title}")
	private String CustomTitle;
	
	@RequestMapping("/")
	public String index() {
		return "Hello from boot";
	}
	
	@RequestMapping("/customString")
	public String customString() {
		return CustomTitle;
	}
	
	@RequestMapping("/insert")
	public String insert() {
		try {
			Employees employees = new Employees(5, new Date(), "Test20", "Last20", "F", new Date());
			EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
			int insert = employeeServiceImpl.add(employees);
			return "Insert " + insert + " items.";
		} catch (Exception e) {
			e.printStackTrace();
			return "Insert failed";
		}
	}
	
	@RequestMapping("/select")
	public String select() {
		
		SqlSession session = MyBatisUtil.getFactory().openSession();
		EmployeesMapper employeesMapper = session.getMapper(EmployeesMapper.class);
		
		Employees employee = employeesMapper.selectByPrimaryKey(3);

		session.commit();
	  session.close();
	  return employee.getFirst_name();
	}
	
	@RequestMapping("/transaction")
	public String transaction() {
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		Employees employees = new Employees(25, new Date(), "Test20", "Last20", "F", new Date());
		employeeServiceImpl.add(employees);
		
		Employees employees2 = new Employees(26, new Date(), "Failed22", "Last22", "F", new Date());
		employeeServiceImpl.addFailed(employees2);
		
		return "Go check database";
	}
}


