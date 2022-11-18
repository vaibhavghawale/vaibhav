package com.Sprint2.day1.question6;

public class Child extends Parent{

	Child() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void fun1() {
		super.fun1();
	}
	
	public static void main(String[] args) {
		try {
		Child ch=new Child();
		ch.fun1();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
