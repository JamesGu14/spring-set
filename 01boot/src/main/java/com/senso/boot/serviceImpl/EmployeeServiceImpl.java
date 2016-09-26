package com.senso.boot.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.senso.boot.entity.Employees;
import com.senso.boot.mapper.EmployeesMapper;
import com.senso.boot.service.EmployeeService;
import com.senso.boot.util.MyBatisUtil;

@EnableAutoConfiguration
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	@Transactional
	public int add(Employees employees) {

		SqlSession session = MyBatisUtil.getFactory().openSession();
		EmployeesMapper employeesMapper = session.getMapper(EmployeesMapper.class);
		int insert = employeesMapper.insert(employees);
		
		session.commit();
	  session.close();
		return insert;
	}

	@Override
	@Transactional
	public int addFailed(Employees employees) {

		SqlSession session = MyBatisUtil.getFactory().openSession();
		EmployeesMapper employeesMapper = session.getMapper(EmployeesMapper.class);
		
		int insert = employeesMapper.insert(employees);
		int i = 1 / 0;
		session.commit();
	  session.close();
		
		return insert;
	}

	@Override
	public int delete(int emp_no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Employees employees) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employees> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
