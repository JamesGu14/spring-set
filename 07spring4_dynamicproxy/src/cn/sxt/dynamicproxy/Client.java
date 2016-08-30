package cn.sxt.dynamicproxy;

import cn.sxt.service.UserService;
import cn.sxt.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
//		Landlord landlord = new Landlord();
//		ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
//		proxyInvocationHandler.setRent(landlord);
//		Rent proxy = (Rent) proxyInvocationHandler.getProxy();
//		proxy.rent();
		
		UserService userService = new UserServiceImpl();
		ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
		proxyInvocationHandler.setTarget(userService);
		UserService proxy = (UserService) proxyInvocationHandler.getProxy();
		proxy.search();
	}
}

