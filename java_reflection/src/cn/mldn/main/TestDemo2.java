package cn.mldn.main;

class Book {
	public Book() {
		System.out.println("*********无参构造方法*********");
	}
	
	@Override
	public String toString() {
		return "这是一本书";
	}
}


public class TestDemo2 {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("cn.mldn.main.Book");
		Book book = (Book) cls.newInstance();
		System.out.println(book);
	}
}
