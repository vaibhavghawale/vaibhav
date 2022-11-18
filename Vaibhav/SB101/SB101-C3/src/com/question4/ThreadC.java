package com.question4;

import java.security.PublicKey;

public class ThreadC extends Thread {

	
	ThreadB trC;
	public ThreadC(ThreadB trC) {
		this.trC=trC;
	}
	
	
	@Override
	public void run() {
		
	try {
		trC.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		String name= Thread.currentThread().getName();
		for(int i=1;i<10;i++) {
			System.out.println("Thread "+name+" first number is :"+i);
		}
		
	}
}
