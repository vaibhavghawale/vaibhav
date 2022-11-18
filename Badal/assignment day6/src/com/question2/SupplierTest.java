package com.question2;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<Integer> s  = () -> 100*100;
		
		Supplier<String> b = () -> "Ram";
        
		System.out.println(s.get());
		System.out.println(b.get());
	}

}
