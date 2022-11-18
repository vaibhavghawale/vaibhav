package com.masai;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private Map <Student, Course> theMap; // inject 3 entries with valid details
	
	@Autowired
	@Qualifier("getList")
	private List<Student> theList; //inject List of 5 Student object
	
	@Value("${appName2}")
	private String appName; //inject the AppName from the properties file
	//Hint: Make use of @Bean annotation to inject theMap and theList;
	
	
	public void printMap(){
	//print all the student's and their course details from theMap
		System.out.println();
		System.out.println(theMap);
	}
	
	public void printList(){
	//sort the List of Student according to the marks (make use of Lamda
	//expression).
	//print all the sorted Student Details
		System.out.println();
		theList.sort((a,b)->(a.getMarks()>b.getMarks()?1:-1));
		for(Student s:theList) System.out.println(s);
		System.out.println();
	}
	
	public void printAppName(){
	//print the injected appName
		System.out.println("App Name: "+appName);
	}
}






