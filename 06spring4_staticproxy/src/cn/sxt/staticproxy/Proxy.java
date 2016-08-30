package cn.sxt.staticproxy;

public class Proxy {
	
	private Landlord landlord;
	
	public void rent() {
		landlord.rent();
	}
}
