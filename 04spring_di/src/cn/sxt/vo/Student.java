package cn.sxt.vo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	// 各种类型参数的注入
	private String name;
	private Address address;
	private String[] books;
	private List<String> hobbies;
	private Map<String, String> cards;
	private Set<String> games;
	private String wife;
	private Properties info;

	public Properties getInfo() {
		return info;
	}

	public void setInfo(Properties info) {
		this.info = info;
	}

	public String getWife() {
		return wife;
	}

	public void setWife(String wife) {
		this.wife = wife;
	}

	public Set<String> getGames() {
		return games;
	}

	public void setGames(Set<String> games) {
		this.games = games;
	}

	public Map<String, String> getCards() {
		return cards;
	}

	public void setCards(Map<String, String> card) {
		this.cards = card;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String[] getBooks() {
		return books;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void show() {
		System.out.println("Student Name is: " + name + "; Address is: " + address.getAddress());
		for(String i : books) {
			System.out.println("He has read: " + i + "; ");
		}
		System.out.println("Hobbies: " + hobbies.toString());
		System.out.println("Cards: " + cards);
		System.out.println("Games: " + games);
		System.out.println("Wife: " + wife);
		System.out.println("Info: " + info);
	}
	
}
