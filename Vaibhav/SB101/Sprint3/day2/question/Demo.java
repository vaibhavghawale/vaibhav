package com.day2.question;

import com.day1.question1.ThreadA;

public class Demo {

	
	public static void main(String[] args) {
		
		ThreadA tr1 =new ThreadA();
		ThreadB tr2=new ThreadB(tr1);
		
		Thread t1=new Thread(tr1);
		Thread t2=new Thread(tr2);
		
		t1.setName("Thread for even number");
		t2.setName("Thread for even number");
		
		t1.start();
		t2.start();
		
		
		
	}
}
