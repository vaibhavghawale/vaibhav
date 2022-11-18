package com.utilities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Students1") //changing table name
public class Student {
	@Id
	private int roll;
	
	@Column(name="StudentName") //changing Column name
	private String name;
	
	@Transient  //It ignores the data but it save in database but not visible
	private int marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int marks) {
		super();	
		this.roll = roll;
		this.name = name;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
