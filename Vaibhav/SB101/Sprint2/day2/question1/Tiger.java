package com.Sprint2.day2.question1;

public class Tiger extends Animal {

	@Override
	void eat() {
		
		System.out.println("Tiger is eating !! ");
		
	}
	
	public static void main(String[] args) {
		
		try {
		Animal animal=new Tiger();
		animal.eat();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
