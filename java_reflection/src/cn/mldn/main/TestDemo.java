package cn.mldn.main;

import java.util.Date;

public class TestDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 第一种方法
		Date date = new Date();
		Class<?> cls1 = date.getClass();
		System.out.println(cls1);

		// 第二种方法 -- Mybatis会用
		Class<?> cls2 = Date.class;
		System.out.println(cls2);

		// 第三种 - 调用forName 初期这个用的比较多
		Class<?> cls3 = Class.forName("java.util.Date");
		System.out.println(cls3);
	}
}
