package com.senso.boot.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.senso.boot.entity.Employees;

@Transactional
public interface EmployeeService {
	
	int add(Employees employees);
	
	int addFailed(Employees employees);
	
	int delete(int emp_no);
	
	int update(Employees employees);
	
	List<Employees> getAll();
}
