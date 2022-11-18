package com.day3.question6;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

public static void main(String[] args) throws InterruptedException, ExecutionException {
	
	ExecutorService service =Executors.newFixedThreadPool(3);
	Scanner scanner=new Scanner(System.in);
//	
//	while(true) {
//		String numString;
//		
//		if(numString) {
//			
//		}

	A a=new A(21);
	Future<String> ansFuture=service.submit(a);
	
	System.out.println(ansFuture.get());
	
	service.shutdown();	
		
}
	
}
