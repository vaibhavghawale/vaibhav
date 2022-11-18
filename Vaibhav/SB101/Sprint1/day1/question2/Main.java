package com.Sprint1.day1.question2;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {

		    Scanner input = new Scanner(System.in);
				try{
			Queue<Product> q=new PriorityQueue<>(new ProductPriceCom());
			
			System.out.println("1 to add product");
			System.out.println("2 to exit");
			
			System.out.println("Enter a choice");
			int choice=input.nextInt();
			
			while(choice!=2) {
				System.out.println("Enter a product Id");
				int productId=input.nextInt();
				
				System.out.println("Enter a product price");
				int productPrice=input.nextInt();
				
				System.out.println("Enter a name");
				String productName=input.next();
				input.nextLine();
				
				System.out.println("Enter a choice");
				choice=input.nextInt();
				
				
				Product p1=new Product(productId,productName,productPrice);
				q.offer(p1);

				 
			}
			
			Product i;
			while((i=q.poll())!=null) {
				System.out.println(i);
			}
		}catch (Exception e) {
		System.out.println(e);
	}
}
	}
