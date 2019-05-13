package vn.edu.vnuk.sep.model;

public abstract class Person {
	protected int id;
	protected int yearOfBirth;
	protected int type;
	protected String name;
	
	public Person() {
		
	}
	
	public Person(int id) {
		this.id = id;
	}

	public Person(int id, int type) {
		this.id = id;
		this.type = type;
	}
	
	public Person(int id, int yearOfBirth, int type, String name) {
		this.id = id;
		this.yearOfBirth = yearOfBirth;
		this.type = type;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String toString();
	
	public abstract void input();
	
	public abstract float getSalary();
}

