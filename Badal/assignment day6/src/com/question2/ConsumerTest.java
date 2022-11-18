package com.question2;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<Student> c = s -> System.out.println("name : "+s.name+","+"marks : "+s.marks+","+"roll : "+s.roll);
		
         c.accept(new Student(10,"Badal",870));
	}

}
