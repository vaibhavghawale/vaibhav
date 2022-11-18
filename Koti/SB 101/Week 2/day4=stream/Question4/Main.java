package day4.Question4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
			
			
			list.add(new Student(101,"Koti",79));
			list.add(new Student(102,"Divya",70));
			list.add(new Student(103,"Raj",500));
			list.add(new Student(104,"Pannalal",606));
			list.add(new Student(105,"Kajal",705));
			
			
			Stream<Student> str1=list.stream();
			Stream<Student> str2=str1.filter(s -> s.getMarks()<500);
			
			List<Student> filterlist=list.stream()
					.filter(s -> s.getMarks()<500)
					.collect(Collectors.toList());
			
			System.out.println(filterlist);
		}
}
