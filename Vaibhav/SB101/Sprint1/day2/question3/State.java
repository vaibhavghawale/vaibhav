package com.Sprint1.day2.question3;

import java.util.LinkedHashMap;
import java.util.Map;

public class State {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> hm=new LinkedHashMap<>();
		
		hm.put("Maharashtra","Mumbai");
		hm.put("Gujrat","Gandhi Nagar");
		hm.put("Tamilnadu","chennai");
		hm.put("Goa","Panjim");
		hm.put("Telangana","Hydrabad");
		hm.put("Andrapradesh","Hydrabad");
		
		
		for(Map.Entry<String,String> me:hm.entrySet()){
		
			System.out.println("Capital of "+me.getKey()+" is a "+me.getValue());
		}
		
		}
	}
