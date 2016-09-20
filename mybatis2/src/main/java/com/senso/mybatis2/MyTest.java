package com.senso.mybatis2;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senso.model.Teacher;
import com.senso.util.MyBatisUtil;

public class MyTest {
	
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession session;
	
	@Before
	public void initialWork() {
		sqlSessionFactory = MyBatisUtil.GetFactory();
		session = sqlSessionFactory.openSession(true);
	}
	
	@After
	public void afterWork() {
		session.close();
	}
	
	@Test
	public void testAddTeacher() {
		Teacher teacher = new Teacher();
		teacher.setName("James Gu");
		int insert = session.insert("com.senso.dao.TeacherMapper.insert", teacher);
		System.out.println("Insert: " + insert);
	}
	
	@Test
	public void testDeleteTeacher() {
		int delete = session.delete("com.senso.dao.TeacherMapper.deleteById", 2);
		System.out.println("Deleted: " + delete);
	}
	
	@Test
	public void testUpdateTeacher() {
		
	}
	
	@Test
	public void testFindTeacherById() {
		
	}
	
	@Test
	public void testFindAllTeachers() {
		
	}
	
	@Test
	public void testAddClass() {
		
	}
	
	@Test
	public void testDeleteClass() {
		
	}
	
	@Test
	public void testUpdateClass() {
		
	}
	
	@Test
	public void testFindClassById() {
		
	}
	
	@Test
	public void testFindAllClasses() {
		
	}
	
}
