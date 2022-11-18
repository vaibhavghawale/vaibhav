package com.question3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	
	public static void main(String[] args) {
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		ProductOfAll [] pr= {
				new ProductOfAll(10),
				new ProductOfAll(5),
				new ProductOfAll(12),
				new ProductOfAll(2),
				new ProductOfAll(7),
				new ProductOfAll(8),
		};
	
		
		for(ProductOfAll p:pr) {
			
			Future<Integer> ansFuture=service.submit(p);
			
			
			try {
				System.out.println(ansFuture.get());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		service.shutdown();
	}
	
}
