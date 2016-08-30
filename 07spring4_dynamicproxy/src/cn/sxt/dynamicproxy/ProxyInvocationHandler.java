package cn.sxt.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

	private Object target;
	public void setTarget(Object target) {
		this.target = target;
	}
	
	/**
	 * 生成代理类
	 */
	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	/**
	 * Proxy 是代理类
	 * method 是代理类的调用处理程序的方法对象
	 */
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		inspect();
		Object result = method.invoke(target, args);
		chargeFee();
		return result;
	}

	// Inspect
	private void inspect() {
		System.out.println("Lead clients inspecting property");
	}

	// Charge client
	private void chargeFee() {
		System.out.println("Charging fee");
	}

}
