package com.Sprint2.day2.question4;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	private void display(List<String> city) {
		
		System.out.println(city);

	}

	public static void main(String[] args) {
		
	List<String> city = new ArrayList<>();
		
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Nagpur");
		city.add("Amravti");
		city.add("Pune");

		Demo c1=new Demo();
		c1.display(city);
	}
}
