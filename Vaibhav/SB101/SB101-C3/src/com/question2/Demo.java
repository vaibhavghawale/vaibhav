//Q2/- Make a thread that will calculate the product of 1 to 10 number and another
//thread (main thread ) will print the calculated value of the first thread. Make use of
//wait and notify method.



package com.question2;

public class Demo {
	
	public static void main(String[] args) {
		
		Product pr=new Product();
		pr.start();
		
		synchronized (pr) {
			
			try {
				pr.wait();   //calling wait method
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("The product of 1 to 10 is :"+pr.product);
		
		}
		
	
	}

}
