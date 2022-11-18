package com.day1.question;
					

					class ThreadA extends Thread {
						
					@Override
					public void run() {
					for (int i = 0; i < 10; i++) {
					System.out.println("inside run mehod of ThreadA" + i);
					}
					System.out.println("end of ThreadA");
					}
					}
					
					
					class ThreadB extends Thread {
					@Override
					public void run() {
					for (int i = 50; i < 60; i++) {
					System.out.println("inside run mehod of ThreadB" + i);
					}
					System.out.println("end of ThreadB");
					}
					}
					
					
					
					class ThreadC extends Thread {
					@Override
					public void run() {
					for (int i = 20; i < 30; i++) {
					System.out.println("inside run mehod of ThreadC" + i);
					}
					System.out.println("end of ThreadC");
					}
					}
					
					class Main {
						
					public static void main(String[] args) {
						
						//1. thread = main deafult.
						
					ThreadA t1 = new ThreadA();
					ThreadB t2 = new ThreadB();
					ThreadC t3 = new ThreadC();
					
					// 1. thread....
					
					
					t1.start();   //2
					
					t2.start();		//3
					
					t3.start();		//4
					
					
					for (int i = 70; i < 80; i++) {
					System.out.println("inside main of Test:" + i);
					}
					System.out.println("end of main");
					}
					}