package com.UseCases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.Model.Customer;
import com.utility.EmUtil;

public class Demo {
	public static void main(String[] args) {
		EntityManager em=EmUtil.provideEntityManager();
		
//		Customer customer=new Customer();
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
		
		String jpql1="from Customer";
		Query q=em.createQuery(jpql1);

		List<Customer> list=q.getResultList();
		
		list.forEach(i -> System.out.println(i));
		
		em.close();

		
	}
}
