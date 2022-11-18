package com.Sprint1.day2.question4;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	
	
public static Map<String, Student> sortByMapValue(HashMap<String,Student> map){
	
		
		Set<Map.Entry<String, Student>> set=map.entrySet();
	
		
		
		Set<Map.Entry<String, Student>> sortedMap = new TreeSet<>(new StudentComp());
		sortedMap.addAll(set);
		
		LinkedHashMap<String, Student> finalMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> s: sortedMap) {
			finalMap.put(s.getKey(), s.getValue());
		}
		return finalMap;
		
	}



	public static void main(String[] args) {
		
		HashMap<String,Student> hm = new HashMap<>();
		
		hm.put("Maharastra",new Student(10,"Ganesh",950));
		hm.put("Tamilnadu",new Student(12,"Surya",850));
		hm.put("Telangana",new Student(15,"Venkat",920));
		hm.put("Haryana",new Student(16,"Dinesh",910));
		hm.put("Kerla",new Student(18,"Srinu",880));	
		
		

		Map<String, Student> sortedMap = sortByMapValue(hm);
		
		for(Map.Entry<String, Student> s: sortedMap.entrySet()) {
			
			System.out.println("Student is from: "+s.getKey());
			System.out.println("---------------------------------");
			Student stu = s.getValue();
			
			System.out.println("Student Name: "+stu.getName());
			System.out.println("Student RollNo: "+stu.getRoll());
			System.out.println("Student Marks: "+stu.getMarks());
			System.out.println("------------------------------------");
		}
	}
}


