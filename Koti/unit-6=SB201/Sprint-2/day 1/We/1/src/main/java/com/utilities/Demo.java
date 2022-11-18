package com.utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
  public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
	EntityManager em=emf.createEntityManager();
/*======================Step:1 Inserting or saving the data into table ============================*/
	Student s1=new Student(10,"Jhothi",80);
	em.getTransaction().begin();
	em.persist(s1);
	em.getTransaction().commit();
	
	em.close();
	System.out.println("Completed");
	
/*======================Step:2 Finding the data using id which is primary key ============================*/
//	Student s1=em.find(Student.class, 1);
//	
//	System.out.println(s1);
//	em.close();
//	System.out.println("Completed");
}
	
}
