package com.senso.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws IOException {

		InputStream inputStream = App.class.getClassLoader().getResourceAsStream("mybatis-config.xml");

		// InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();
		Todo todo = (Todo) session.selectOne("com.senso.mybatis.todoMapper.selectTodo", 5);
		session.close();

		System.out.println(todo);
	}
}
