package com.question3;

public class Student {

	int roll;
	String name;
	String email;
	int marks;
	
	
	
	
	public Student() {
		super();
		
	}




	public Student(int roll, String name, String email, int marks) {
		
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}




	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}
	
	
	
}
