package com.senso.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.senso.mybatis.App;

public class MyBatisUtil {
	
	public static SqlSessionFactory GetFactory() {
		InputStream inputStream = MyBatisUtil.class.getClassLoader().getResourceAsStream("mybatis-config.xml");

		// InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
}
