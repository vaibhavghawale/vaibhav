package com.Sprint1.day2.question1;
import java.util.Arrays;
import java.util.List;



public class Main {	
	
public static  void fun1(List<?> list) {
		
		System.out.println("inside fun1...");
		
		//we can access the values from the unbounded type by using Object class
		
		try {
		for(Object i1:list) {
		
		    list= (List<?>) i1;
		}
//		return list;
		System.out.println(list);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
	
		List<Integer> ilist= Arrays.asList(10,20,30,40);
		
		List<String> slist= Arrays.asList("a","b","c","d");
		
		
		
		fun1(ilist);
		
//		List<?> li1=fun1(ilist);
//		List<?> li2=fun1(slist);
//		
//		System.out.println(li1);
//		System.out.println(li2);
		
	}
	
}
