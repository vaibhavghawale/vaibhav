package com.day1.question1;

public class ThreadA extends Thread{

	@Override
	public void run() {
		
		
		for(int i=0;i<10;i++) {
			String tname=Thread.currentThread().getName();
			System.out.println(tname+" "+i);
		}
		
		
		
	}

	
}
