package cn.sxt.dao.impl;

import cn.sxt.dao.UserDao;

public class MySqlDaoImpl implements UserDao {

	@Override
	public void getUser() {
		
		System.out.println("MySQL: -> Obtain user data");
	}
}
