package cn.sxt.staticproxy;

public class Client {

	public static void main(String[] args) {
		Landlord landlord = new Landlord();
		Proxy proxy = new Proxy(landlord);
		proxy.rent();
	}
}

/**
 * 静态代理：
 * 
 * 优点：
 * 公共的业务由代理完成，实现了分工，使真实角色的业务更纯粹
 * 一旦公共业务发生改变，只需在proxy里修改即可
 * 
 * 缺点：
 * 类变多了，工作量增大，开发效率降低了
 * 
 * 于是我们需要------动态代理
 * 动态代理和静态代理的角色是一样的，但代理类是自动生成的
 * 
 * 现在用javasist来生成代理
 */