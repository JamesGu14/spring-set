package cn.sxt.service;

import cn.sxt.dao.UserDao;

public interface UserService {
	public void setUserDao(UserDao userDaoImpl);
	public void getUser();
}
