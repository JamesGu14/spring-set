package cn.sxt.bean;

public class Hello {
	private String name;
	
	public Hello() {
		System.out.println("Hello is created");
	}

	public void show() {
		System.out.println("Hello " + name );
	}

	public void setName(String name) {
		this.name = name;
	}
}
