package com.Sprint1.day1.ClassPractice;
import java.util.PriorityQueue;
import java.util.Queue;
public class Demo {



		public static void main(String[] args) {
			
			
			Queue<Integer> q = new PriorityQueue<>();
			
			q.add(10);
			q.add(20);
			q.add(30);
			q.add(12);
			q.add(22);
			q.add(35);
			
			System.out.println(q);
			
			
			
			Integer i1;
			
			while((i1 = q.poll()) != null) {
				
				System.out.println(i1);
			}
			
			
			System.out.println(q);
			
			
		}
}