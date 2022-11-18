package com.Sprint2.day3.question3;

public class StudentMain {
	
	private int roll;
	private String name;
	private String email;
	private int marks;
	
	
	
	public StudentMain() {
		super();
	}
	public StudentMain(int roll, String name, String email, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentMain [roll=" + roll + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}
	
	
	

}
