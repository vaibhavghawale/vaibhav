package com.Evaluation.C1.question1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		

		TreeMap<Empolyee,Integer> hm = new TreeMap<>();
		
		hm.put(new Empolyee(101,"Vaibhav","Amravati"),50000);
		hm.put(new Empolyee(102,"Sanskruti","Nagpur"),40000);
		hm.put(new Empolyee(103,"Kshitija","Akola"),50000);
		hm.put(new Empolyee(104,"Pritam","mumbai"),50000);
		
		Set<Entry<Empolyee, Integer>> set= hm.entrySet();
		
		for(Entry<Empolyee, Integer> me: set) {
			
		System.out.println("Toppers Student of State :" + me.getValue());
		System.out.println("*********************************");
		Empolyee empolyee = me.getKey();
		System.out.println("name :" + empolyee.getName());
		System.out.println("address :" + empolyee.getAddress());
		System.out.println("empId :" +empolyee.getEmpId());
		}

		
		
	}
}
