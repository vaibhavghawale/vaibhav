package com.UseCases;

import javax.persistence.EntityManager;


import com.Model.Address;
import com.Model.Employee;
import com.utility.EmUtil;

public class Demo {
	public static void main(String[] args) {

		
/*========================== For Step 1: Single Address ==============================*/
//		EntityManager em= EmUtil.provideEntityManager();
//		Employee emp=new Employee();
//		emp.setEname("Ram");
//		emp.setSalary(7800);
//
//     	emp.setAddr(new Address("Maharastra", "pune", "75455"));
//		
//		//Address adr=new Address("maharastra", "pune","75455");
//				//emp.setAddr(adr);
//
//				em.getTransaction().begin();
//
//				em.persist(emp);
//
//				em.getTransaction().commit();
//
//				System.out.println("done...");
//				
//				em.close();
/*========================== For Step 2: Multiple Address ->It is Not Working ==============================*/	
//		
//		EntityManager em= EmUtil.provideEntityManager();
//
//		Employee emp=new Employee();
//		emp.setEname("Ram");
//		emp.setSalary(7800);
//		emp.setHomeAddr(new Address("Maharastra", "pune", "75455"));
//		emp.setOfficeAddr(new Address("Telengana","hydrabad", "785422"));
//
//
//		em.getTransaction().begin();
//
//		em.persist(emp);
//
//		em.getTransaction().commit();
//
//		System.out.println("done...");
	
/*====================== For Step 3: Multiple Address Maximum we used this method ===================*/	
		
		EntityManager em= EmUtil.provideEntityManager();

		Employee emp=new Employee();
		emp.setEname("Ram");
		emp.setSalary(7800);
		emp.getAddress().add(new Address("St1","C1","P1"));
		emp.getAddress().add(new Address("St2","C2","P2"));

		

		em.getTransaction().begin();

		em.persist(emp);

		em.getTransaction().commit();

		System.out.println("done...");

	}
	
}

