package com.Sprint2.day4.question3;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(27);
		list.add(13);
		list.add(78);
		list.add(10);
		
		List<Integer> list2=new ArrayList<>();
		for(Integer i:list) {
			
			list2.add(i*i);
		}
		
		System.out.println("First list of set");
		for(Integer i3:list) {
			System.out.println(i3);
		}
		
		System.out.println("Second list of set");
		for(Integer i2:list2) {
			System.out.println(i2);
		}
	
	}
}
