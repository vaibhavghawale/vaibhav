package com.masai.usecases;

import java.util.Scanner;

import com.masai.Entities.Product;
import com.masai.Exception.ProductException;
import com.masai.productDao.ProductDao;
import com.masai.productDao.ProductDaoImpl;

public class Main {

	public static void main(String[] args) throws ProductException {
		
		ProductDao pr=new ProductDaoImpl();
		
        Scanner sc=new Scanner(System.in);
	    
	    System.out.println(".........................Welcome to Product Port.......................");
	    System.out.println();
	    System.out.println();
	    while(true) {
	    System.out.println("================================================================");	
	    System.out.println();
	    System.out.println();
	    System.out.println();
	  
	    System.out.println("Please Enter Choice for Service");
	    System.out.println();
	    System.out.println("1. for Adding a new product"); System.out.println();
	    System.out.println("2. To get the productName and quantity of all the products");
	    System.out.println("3. to get the Product Price based on the Product Id.");
	    System.out.println("4. to get the Product Details based on the product Id.");
	    System.out.println("5. to get the total price of all the products.");
	    System.out.println("6.  to get all the products whose quantity is less than 5.");
	    
		
	    int ch=sc.nextInt();
	    switch (ch) {
		case 1:{
			while(true) {
		    	System.out.println("Enter Product Name");
		    	String name=sc.next();
		    	System.out.println("Enter Price Of Product");
		    	int price=sc.nextInt();
		    	System.out.println("Enter Quantity of Product");
		    	int quantity =sc.nextInt();
		    	
		    	Product product= new Product();
		    	product.setProductName(name);
		    	product.setPrice(price);
		    	product.setQuantity(quantity);
		    	
		    	Product prod=pr.AddingProduct(product);
		 	    System.out.println(prod);
		      	System.out.println("Product Added Succesfully...");
		 	
		 		System.out.println("-----------------X------------------X----------------X");
		 		System.out.println("Do you want to conitunue service please press yes or no");
		 		String ch1=sc.next();
		 		if(ch1.equalsIgnoreCase("no")) {
		 			break;
		 		}
		 		
	    	}
		  }
		case 2:{
			
			pr.CallQuery();
			
			
		}
		case 3:{
		
			System.out.println("Enter a Product Id:");
			int id=sc.nextInt();
			pr.CallQuery2(id);
		}
		case 4:{
			System.out.println("Enter a Product Id:");
			int id=sc.nextInt();
			pr.detailProduct(id);
			
			
		}
		case 5:{
			pr.totalPrice();
		}
		case 6:{
			pr.getList();
		}
	    }
        
	  }

}
}
