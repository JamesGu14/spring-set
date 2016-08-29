package cn.sxt.service.impl;

import cn.sxt.dao.UserDao;
import cn.sxt.dao.impl.UserDaoImpl;
import cn.sxt.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao = null;
	@Override
	public void setUserDao(UserDaoImpl userDaoImpl) {
		this.userDao = userDaoImpl;
	}
	
	@Override
	public void getUser() {
		userDao.getUser();
	}
}
