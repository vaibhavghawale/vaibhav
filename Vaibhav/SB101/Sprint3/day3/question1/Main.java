package com.day3.question1;

public class Main {

	public static void main(String[] args)throws Exception {
		
		Product mt=new Product();
		
		mt.start();
		
		synchronized (mt) {

		System.out.println("main thread calls the wait method");
		
		mt.wait();
		
		System.out.println("main thread got the notification");
		
		System.out.println(mt.product);
}
}
}