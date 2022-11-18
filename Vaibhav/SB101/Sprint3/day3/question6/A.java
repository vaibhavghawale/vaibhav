package com.day3.question6;

import java.util.concurrent.Callable;

public class A implements Callable<String> {

	int num;
	
	public A( int num) {
		this.num=num;
	}
	
	@Override
	public String call() throws Exception {
		
		if(num%2==0) return "Even Number";
		else return "Odd Number";
	}
	
}
