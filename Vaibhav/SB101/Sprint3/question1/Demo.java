package com.day1.question1; 


public class Demo {
	
	public static void main(String[] args) {
		
		ThreadA ta= new ThreadA();
		
		Thread t1=new Thread(ta);
		Thread t2=new Thread(ta);
		
		t1.setName("Dhoni");
		t2.setName("Kohli");
		
		
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
		System.out.println("t1 thread priority"+t1.getPriority());
		System.out.println("t1 thread priority"+t2.getPriority());
		
		System.out.println("I'm main");
	}

}
