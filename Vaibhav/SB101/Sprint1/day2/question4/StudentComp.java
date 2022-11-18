package com.Sprint1.day2.question4;

import java.util.Comparator;
import java.util.Map;

public class StudentComp implements Comparator<Map.Entry<String, Student>>{


	@Override
	public int compare(java.util.Map.Entry<String, Student> o1, java.util.Map.Entry<String, Student> o2) {
		return o1.getValue().getMarks()>o2.getValue().getMarks()?1:-1;
		
	}
}
