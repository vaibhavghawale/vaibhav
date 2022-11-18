package day4.Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {

		List<Student> list=new ArrayList<>();
		
		
		list.add(new Student(101,"Ramya",79));
		list.add(new Student(102,"RamLal",70));
		list.add(new Student(103,"Koti",100));
		list.add(new Student(104,"Pal",86));
		list.add(new Student(105,"Lal",35));
		
		
		Stream<Student> str1=list.stream();
		
		Student max_marks=list.stream().max((s1,s2) -> s1.getMarks()>s2.getMarks()?+1:-1).get();
		
		System.out.println(max_marks);
	}
}
