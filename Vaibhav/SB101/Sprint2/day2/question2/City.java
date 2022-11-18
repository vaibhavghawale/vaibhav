package com.Sprint2.day2.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {

	public static void main(String[] args) {
		
		List<String> city = new ArrayList<>();
		
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Nagpur");
		city.add("Amravti");
		city.add("Pune");
		


		 Collections.sort(city);
		 Collections.reverse(city); // descending order 
	        System.out.println(city);
		
	}
	
}
