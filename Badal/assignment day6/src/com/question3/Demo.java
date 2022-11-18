package com.question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		
		Map<String, Student> hm = new HashMap<>();
		hm.put("India", new Student(1,"Badal","hsj@gmail.com",980));
		hm.put("China", new Student(2,"hiso","hdj@gmail.com",280));
		hm.put("US", new Student(3,"Badal","hsdj@gmail.com",400));
		hm.put("UK", new Student(7,"Badal","dsj@gmail.com",300));
		hm.put("Japan", new Student(8,"Badal","sjj@gmail.com",680));
		
		
		
		Fintr f = a -> {
			
			
			List<Map.Entry<String, Student>> tm  = new LinkedList<Map.Entry<String, Student> >(
	                a.entrySet());
			

			
			//Collections.sort(tm, tm.ge);
			
			
			for(Map.Entry<String, Student> i:tm) {
				
				System.out.println(i.getValue().marks);
				
			}
			return a;
			
		};
		
      f.sortMapUsingStudentName(hm);

	}

}
