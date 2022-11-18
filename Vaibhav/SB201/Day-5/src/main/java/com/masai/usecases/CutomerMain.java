package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.Emutil.EMUtil;
import com.masai.Entities.Address;
import com.masai.Entities.Customer;

public class CutomerMain {
	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		
		Customer customer=new Customer();
//		customer.setName("Koti");
//		customer.setMobileNumber("9014565789");
//		customer.setEmail("Koti@123");
//		
//		customer.getAddresses().add(new Address("AP","Krishna","521214","Home"));
//		customer.getAddresses().add(new Address("Telangana","Hyderabad","546510","Office"));
//		customer.getAddresses().add(new Address("AP","Mylavaram","520056","College"));
//		
//		Customer customer1=new Customer();
//		customer1.setName("Divya");
//		customer1.setMobileNumber("8614565789");
//		customer1.setEmail("Divya@123");
//		
//		customer1.getAddresses().add(new Address("TN","Chennai","565656","Home"));
//		customer1.getAddresses().add(new Address("Karnataka","Bangalore","575757","Office"));
//		customer1.getAddresses().add(new Address("AP","Mylavaram","520056","College"));
//		
//		em.getTransaction().begin();
//		em.persist(customer);
//		em.persist(customer1);
//		em.getTransaction().commit();
//		
//		System.out.println("Completed...");
		
/*========== Write a JPQL to get all addresses of a customer based on the cid. And print the details. =======*/	
//		
		int id=1;
        String jpql="from Customer where Cid=:cid";
		
		Query q= em.createQuery(jpql);
		q.setParameter("cid",id);
		List<Customer> ct= q.getResultList();
		
		for(Customer cust:ct) {
			
			List<Address> addrs= cust.getAddresses();
			
			for(Address adr:addrs) {
				
				System.out.println(adr);
			}
			
			
		}

		
	}
}

//public class CutomerMain {
//
//	public static void main(String[] args) {
//		
//		
//			
//		EntityManager em= EMUtil.provideEntityManager();
//		
//		Customer c=new Customer();
//	
//		c.setName("Vaibhav");
//		c.setEmail("Vaib@mail.com");
//		c.setMobileNumber("8765894343");
//		c.getAddresses().add((new Address("Maharashtra","Amravati","444701","Home")));
//		c.getAddresses().add((new Address("Karnataka","Banglore","555987","Office")));
//		c.getAddresses().add((new Address("Maharshtra","Nagpur","442675","Current")));
//		
//		em.getTransaction().begin();
//		em.persist(c);
//		em.getTransaction().commit();
//		
////		int id=1;
//		
//		
//		
//		em.close();
//}
//}
