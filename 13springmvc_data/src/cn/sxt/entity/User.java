package cn.sxt.entity;

public class User {
	private int			id;
	private String	firstName;
	private String	lastName;
	private char		gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Print User: " + id + " " + firstName + " " + lastName + " " + gender;
	}
}
