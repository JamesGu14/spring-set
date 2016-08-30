package cn.sxt.service.impl;

import cn.sxt.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("======Adding User");
	}

	@Override
	public int delete() {
		System.out.println("======Deleting User");
		return 1;
	}
}
