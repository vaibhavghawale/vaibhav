package com.question4;

public class ThreadB extends Thread{

	ThreadA trA;
	
	public ThreadB(ThreadA trA) {
		this.trA=trA;
	}
	
	@Override
	public void run() {
		
		try {
			trA.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name= Thread.currentThread().getName();
		int product=1;
		for(int i=1;i<10;i++) {
			product=product*i;
		}
		System.out.println("Thread "+name+" Print 1st 10 number product is :"+product);
	}
		
		
	}
