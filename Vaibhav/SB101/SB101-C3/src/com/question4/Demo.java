package com.question4;

public class Demo {

	
	public static void main(String[] args) {
		
		ThreadA ta= new ThreadA();
		ThreadB tb= new ThreadB(ta);
		ThreadC tc= new ThreadC(tb);

		
	
		
		ta.setName("Dhoni");
		tb.setName("Rohit");	
		tc.setName("Kohli");
		

		
		ta.setPriority(10);
		
		ta.start();
		tb.start();
		tc.start();
		
	}
	
}
