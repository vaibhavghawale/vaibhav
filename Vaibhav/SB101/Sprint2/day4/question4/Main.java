package com.Sprint2.day4.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.Sprint2.day4.question2.Student;

public class Main {

	public static void main(String[] args) {
		
	List<Student> list=new ArrayList<>();
		
		
		list.add(new Student(101,"ShamLal",79));
		list.add(new Student(102,"RamLal",70));
		list.add(new Student(103,"BansiLal",100));
		list.add(new Student(104,"Pannalal",86));
		list.add(new Student(105,"Lal",35));
		
		
		Stream<Student> str1=list.stream();
		Stream<Student> str2=str1.filter(s -> s.getMarks()<500);
		
		List<Student> filterlist=list.stream()
				.filter(s -> s.getMarks()<500)
				.collect(Collectors.toList());
		
		System.out.println(filterlist);
	}
}
