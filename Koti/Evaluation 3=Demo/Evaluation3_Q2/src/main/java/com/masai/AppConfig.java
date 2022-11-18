package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("name.properties")
public class AppConfig {
  
	@Bean
	public List<Student> getList(){
		List<Student> l1=new ArrayList<>();
		l1.add(new Student(1,"Koti","Nandigama","Koti@123",79));
		l1.add(new Student(2,"Divya","Mylavaram","Divya@123",89));
		l1.add(new Student(3,"Ram","Rameshwar","Ram@123",90));
		l1.add(new Student(4,"Ramu","Nandigama","Ramu@123",98));
		l1.add(new Student(5,"Shiva","Kailasam","Shiva@123",100));
		
		return l1;
	}
	
	@Bean
	public Map<Student, Course> getMap(){
		Map<Student, Course> m1=new HashMap<>();
		m1.put(new Student(3,"Ram","Rameshwar","Ram@123",90), new Course(301,"Java","3 Months",10000));
		m1.put(new Student(5,"Shiva","Kailasam","Shiva@123",100), new Course(302,"Spring","2 Months",15000));
		m1.put(new Student(3,"Ram","Rameshwar","Ram@123",90), new Course(303,"JavaScript","4 Months",9000));
		
		return m1;
	}
}




