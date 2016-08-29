package cn.sxt.service.impl;

import cn.sxt.dao.UserDao;
import cn.sxt.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao = null;
	@Override
	public void setUserDao(UserDao userDaoImpl) {
		this.userDao = userDaoImpl;
	}
	
	@Override
	public void getUser() {
		userDao.getUser();
	}
}
