package cn.mldn.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.lang.model.element.VariableElement;

class Book {
	private String	title;
	private double	price;

	public Book() {
		System.out.println("*********无参构造方法*********");
	}

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "图书名称：" + this.title + "; 价格：" + this.price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void testMethod(String prefix, int a, int b, int c, int d) {
		int x = a + b + c + d;
		System.out.println(prefix + " " + x);
	}
}

public class TestDemo2 {

	public static String initcap(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("cn.mldn.main.Book");
		// Constructor<?> con = cls.getConstructor(String.class, double.class);
		// Book book = (Book) con.newInstance("Blah Book", 29.80);
		// System.out.println(book);

		// Invoke methods
		String fieldName = "title";
		Book book2 = (Book) cls.newInstance();
		Method setTitle = cls.getMethod("set" + initcap(fieldName), String.class);
		Method getTitle = cls.getMethod("get" + initcap(fieldName));

		Method testMethod = cls.getMethod("testMethod", String.class, int.class, int.class, int.class, int.class);

		setTitle.invoke(book2, "测试书记");
		System.out.println(getTitle.invoke(book2));
		testMethod.invoke(book2, "和是：", 1, 2, 3, 4);
	}
}
