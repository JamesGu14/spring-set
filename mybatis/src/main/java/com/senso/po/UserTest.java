package com.senso.po;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.senso.mapper.interfaces.UserMapper;
import com.senso.util.MyBatisUtil;

public class UserTest {
	
	@Test
	public void testAdd() {
		SqlSessionFactory sqlSessionFactory = MyBatisUtil.GetFactory();
		// 默认是手动提交
		// SqlSession session = sqlSessionFactory.openSession();
		SqlSession session = sqlSessionFactory.openSession();
		User user = new User();
		user.setAge(26);
		user.setName("James");
		int insert = session.insert("com.senso.mybatis.userMapper.addUser", user);
		
		session.commit();
		System.out.println(insert);
		session.close();
	}
	
	@Test
	public void testUpdate() {
		SqlSessionFactory sqlSessionFactory = MyBatisUtil.GetFactory();
		SqlSession session = sqlSessionFactory.openSession(true);
		User user = new User();
		user.setId(2);
		user.setAge(30);
		user.setName("John");
		int update = session.update("com.senso.mybatis.userMapper.updateUser", user);
		System.out.println("Update: " + update);
		session.close();
	}
	
	@Test
	public void testDelete() {
		SqlSessionFactory sqlSessionFactory = MyBatisUtil.GetFactory();
		SqlSession session = sqlSessionFactory.openSession(true);
		
		int delete = session.delete("com.senso.mybatis.userMapper.deleteUser", 4);
		System.out.println("Delete: " + delete);
		session.close();
	}
	
	@Test
	public void testGetUser() {
		SqlSessionFactory sqlSessionFactory = MyBatisUtil.GetFactory();
		SqlSession session = sqlSessionFactory.openSession(true);
		
		User user = session.selectOne("com.senso.mybatis.userMapper.getUser", 3);
		System.out.println(user);
		session.close();
	}
	
	@Test
	public void testGetAllUsers() {
		SqlSessionFactory sqlSessionFactory = MyBatisUtil.GetFactory();
		SqlSession session = sqlSessionFactory.openSession(true);
		
		List<User> userList = session.selectList("com.senso.mybatis.userMapper.getAllUsers");
		System.out.println(userList);
		session.close();
	}
	
	/**
	 * 使用Annotation 和 Interface 配置mapper
	 */
	
	@Test
	public void testAdd2() {
		SqlSessionFactory sqlSessionFactory = MyBatisUtil.GetFactory();
		SqlSession session = sqlSessionFactory.openSession(true);
		
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		User user = new User();
		user.setAge(29);
		user.setName("Bruno");
		int add = userMapper.add(user);
		
		session.close();
	}
}
