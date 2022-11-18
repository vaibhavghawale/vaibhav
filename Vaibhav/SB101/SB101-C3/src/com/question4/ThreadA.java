package com.question4;

public class ThreadA extends Thread {

	@Override
	public void run() {
		
		String name= Thread.currentThread().getName();
		int sum=0;
		for(int i=1;i<=20;i++) {
			sum+=i;
		}
		System.out.println("Thread "+name+" Print 1st 20 number addition is :"+sum);
	}
	
}
