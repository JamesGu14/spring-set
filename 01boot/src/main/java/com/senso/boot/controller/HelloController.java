package com.senso.boot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senso.boot.entity.Employees;
import com.senso.boot.mapper.EmployeesMapper;

@RestController
@EnableAutoConfiguration
public class HelloController {
	
	@Autowired
	private EmployeesMapper employeesMapper;
	
	@RequestMapping("/")
	public String index() {
		return "Hello from boot";
	}
	
	@RequestMapping("/insert")
	public String insert() {
		try {
			Employees employee = new Employees();
			employee.setBirth_date(new Date());
			employee.setEmp_no(3);
			employee.setFirst_name("MyFirst");;
			employee.setGender("F");
			employee.setHire_date(new Date());
			employee.setLast_name("MyLast");
			int insert = employeesMapper.insert(employee);
			return "Insert " + insert + " items.";
		} catch (Exception e) {
			e.printStackTrace();
			return "Insert failed";
		}
		
	}
	
	@RequestMapping("/select")
	public String select() {
		
		Employees employee = employeesMapper.selectByPrimaryKey(3);
		return employee.getFirst_name();
	}
}


