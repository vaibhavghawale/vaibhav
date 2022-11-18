package com.day2.question;

import com.day1.question1.ThreadA;

public class threadA extends Thread {

	@Override
	public void run() {
		
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println("This is thread"+currentThread().getName()+" Print even number :"+i);
			}
		}
		super.run();
	}
}
