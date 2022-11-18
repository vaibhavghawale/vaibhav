package com.Sprint2.day2.question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	
	public static void main(String[] args) {
		
		
		List<Product> p = new ArrayList<>();
		
		p.add(new Product(101,"Shoes",2,999));
		p.add(new Product(102,"shirt",1,199));
		p.add(new Product(103,"pen",3,499));
		p.add(new Product(104,"rope",2,99));
		p.add(new Product(105,"belt",1,299));
		p.add(new Product(106,"socks",5,699));
		
		Collections.sort(p, (p1,p2) -> p1.getPrice() > p2.getPrice() ? +1: -1);
		
		
		System.out.println(p);
		
		
	}
}
