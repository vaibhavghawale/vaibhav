package com.Sprint2.day3.question2;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

import com.Sprint1.day2.question4.Student;

public class Demo {
	
	
	
	public static void main(String[] args) {
		
//		Predicate<Student> p=new MyPredicate();
		
		
		/*   1.   ---------> Prediacte Using Lambda Expression <---------    */
		
		
		Predicate<Student> p = s -> s.getMarks()>500;
		
		System.out.println(p.test(new Student(10,"Ganesh",950)));
	    
		
		/*   2.   ---------> Consumer Using Lambda Expression <---------    */
		
		Consumer <Student> c = s -> {
			
			System.out.println(s.getRoll());
			
		};
		
		c.accept(new Student(10,"Ganesh",950));
		
		
		/*   3.   ---------> Suppier Using Lambda Expression <---------    */
		
		Supplier<String> student = () -> "What you want i'm returning a strinhg" ;
		
		System.out.println(student.get());
		
		
		/*   4.   ---------> Function Using Lambda Expression <---------    */
		
		Function<Student , String> function= s -> {
			
			return s.getMarks()>500?"Pass":"Fail";
			
		};
		
		System.out.println(function.apply((new Student(10,"Ganesh",950))));
		
		
	}
}
