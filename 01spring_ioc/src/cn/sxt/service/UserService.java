package cn.sxt.service;

import cn.sxt.dao.impl.UserDaoImpl;

public interface UserService {
	public void setUserDao(UserDaoImpl userDaoImpl);
	public void getUser();
}
