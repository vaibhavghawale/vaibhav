package com.question2;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		//predicate is predefined FI 
		
		Predicate<Student> p = student -> student.marks >500;
		
		System.out.println(p.test(new Student(10,"Badal",750)));

	}

}
