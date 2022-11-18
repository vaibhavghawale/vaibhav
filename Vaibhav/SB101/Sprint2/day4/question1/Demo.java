package com.Sprint2.day4.question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	
	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<>();
		
		
		list.add(new Product(101,"Shoes",999,5));
		list.add(new Product(102,"Iphone",124999,1));
		list.add(new Product(103,"Laptop",57000,11));
		list.add(new Product(104,"Saop",100,10));
		list.add(new Product(105,"books",300,15));
		
		
		
		System.out.println("All product list");
		for(Product l:list) {
			System.out.println(l);
		}
		
		
		Collections.sort( list,(s1,s2) -> s1.getPrice()>s2.getPrice()?+1:-1);
		
		Stream<Product> str1=list.stream();
		Stream<Product> str2=str1.filter(s -> s.getQuantity()>10);
		
//		Collections.sort( str2,(s1,s2) -> s1.getPrice()>s2.getPrice()?+1:-1);
		
		
		
//		str1.forEach(s -> System.out.println(s));
		
		System.out.println("Filteredproduct list");
		
		str2.forEach(s -> System.out.println(s));
		
	}
}
