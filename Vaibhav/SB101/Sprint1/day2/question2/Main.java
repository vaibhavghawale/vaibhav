package com.Sprint1.day2.question2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		
		TreeMap<Student,String> tm = new TreeMap<>(new StudentComp());
		
		
		tm.put(new Student(10,"Ganesh",950),"Maharastra");
		tm.put(new Student(12,"Surya",850),"Tamilnadu");
		tm.put(new Student(15,"Venkat",920),"Telangana");
		tm.put(new Student(16,"Dinesh",910),"Haryana");
		tm.put(new Student(18,"Srinu",880),"Kerla");
		
		
		Set<Map.Entry<Student,String>> set= tm.entrySet();
		
		
		for(Map.Entry<Student,String> me: set) {
			
		System.out.println("Toppers from " + me.getValue()+" is");
		System.out.println("--------------");
		Student student = me.getKey();
		System.out.println("Roll :" + student.getRoll());
		System.out.println("Name :" + student.getName());
		System.out.println("Marks :" + student.getMarks());
		
		System.out.println("*********************************");
		}
		}
	
}
