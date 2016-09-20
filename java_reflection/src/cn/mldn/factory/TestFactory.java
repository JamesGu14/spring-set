package cn.mldn.factory;

interface Fruit {
	public void eat();
}
class Apple implements Fruit {
	@Override
	public void eat() {
		System.out.println("Eat Apple");
	}
}
class Orange implements Fruit {
	@Override
	public void eat() {
		System.out.println("Eat Orange");
	}
}
class Factory {
	public static Fruit getInstance(String className) {
		
		Fruit fruit = null;
		
		try {
			fruit = (Fruit) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fruit;
	}
}

public class TestFactory {
	public static void main(String[] args) throws Exception {
		Fruit fruit = Factory.getInstance("cn.mldn.factory.Orange");
		Fruit fruit2 = Factory.getInstance("cn.mldn.factory.Apple");
		
		fruit.eat();
		fruit2 .eat();
	}
}
