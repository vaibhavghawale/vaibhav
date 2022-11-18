package com.Sprint2.day3.question3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.Sprint1.day2.question4.Student;

public class Main {
	
//	public static HashMap<String, StudentMain> sortMapUsingStudentName(HashMap<String, StudentMain> hm){
//		
//		Comparator<Map.Entry<String, Student>> marksComp = (s1,s2)->{
//			return s1.getValue().getName().compareTo(s2.getValue().getName());
//		};
//		
//		return hm;
//		
	
	public static void main(String[] args) {
		
        HashMap<String,StudentMain> hm = new HashMap<>();
		
        hm.put("India",new StudentMain(79,"Koti","Koti@143.com",799));
		hm.put("Russia",new StudentMain(49,"Divya","Divya@143.com",798));
		hm.put("USA",new StudentMain(27,"Kiran","Kiran@143.com",900));
		hm.put("Lanka",new StudentMain(55,"Vamsi","Swathi@183.com",600));
		hm.put("Japan",new StudentMain(69,"Dhoni","Mikel@123.com",1000));
		
//
//		Map<String, StudentMain> sortedMap= sortMapUsingStudentName(hm);
//		
//            for(Entry<String, StudentMain> s: sortedMap.entrySet()) {
//			
//			System.out.println("Student is from: "+s.getKey());
//			System.out.println("---------------------------------");
//			StudentMain stu = s.getValue();
//			
//			System.out.println("Student Name: "+stu.getName());
//			System.out.println("Student RollNo: "+stu.getRoll());
//			System.out.println("Student Marks: "+stu.getMarks());
//			System.out.println("------------------------------------");
//		}
		
		
		Set<Map.Entry<String, StudentMain>> set=hm.entrySet();	
		Set<Map.Entry<String, StudentMain>> Sorted_set=new TreeSet<>(
				(s1,s2)->s2.getValue().getName().compareTo(s1.getValue().getName()));
		Sorted_set.addAll(set);
		Sorted_set.forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
		
		
	}

}
