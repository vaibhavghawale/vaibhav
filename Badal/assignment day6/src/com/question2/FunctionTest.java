package com.question2;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		
		//here input type is Integer and return type is String

		Function<Integer, String> f = a -> "Badal is here";
		
		System.out.println(f.apply(18));

	}

}
