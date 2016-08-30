package cn.sxt.service;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("Adding User");
	}

	@Override
	public void update() {
		System.out.println("Updating User");
	}

	@Override
	public void delete() {
		System.out.println("Deleting User");
	}

	@Override
	public void search() {
		System.out.println("Searching User");
	}
}
