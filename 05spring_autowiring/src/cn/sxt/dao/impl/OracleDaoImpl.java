package cn.sxt.dao.impl;

import cn.sxt.dao.UserDao;

public class OracleDaoImpl implements UserDao {

	@Override
	public void getUser() {

		System.out.println("Oracle: -> Obtain user data");
	}
	
}
