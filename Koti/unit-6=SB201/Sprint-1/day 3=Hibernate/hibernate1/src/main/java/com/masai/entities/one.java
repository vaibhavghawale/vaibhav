package com.masai.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class one {
	public static void main(String[] args) {
		
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
       EntityManager em=emf.createEntityManager();
       
//========================  For Finding Employee details =======================================
//       Employee employee=em.find(Employee.class, 1);
//       if(employee!=null) {
//    	   System.out.println(employee);
//       }
//       else {
//    	   System.out.println("Record Not Found");
//       }
//       em.close();
       
//========================  For Creating Employee Object and inserting  ========================     
//       Employee employee=new Employee(4, "Amit", "TN", 20000);
//       
//       EntityTransaction et=em.getTransaction(); //It required for Insert,delete,Edit operations
//       
//       et.begin();
//       em.persist(employee); // It is Transactional Area lies b/w begin and commit
//       et.commit();
//       
//       em.close();
//       System.out.println("Employee Saved");

//========================  For Deleting Employee details using id =============================   
       
//       Scanner sc=new Scanner(System.in);
//
//		System.out.println("Enter Employee Id to delete ");
//		int id=sc.nextInt();
//
//		Employee employee= em.find(Employee.class, id);
//
//		if(employee != null){
//
//			em.getTransaction().begin();
//
//			em.remove(employee);
//
//			em.getTransaction().commit();
//
//
//			System.out.println("Employee removed....");
//
//		}else
//			System.out.println("Employee not found...");
//
//		em.close();
//
//
//		System.out.println("done");

//===========  For Updating Employee details using id (here we are justing adding salary ) =============       
   	Scanner sc=new Scanner(System.in);

	System.out.println("Enter id to give Bonus: ");
	int id=sc.nextInt();

	Employee emp=em.find(Employee.class, id); //if it returns the obj then the obj will be in p.state

	if(emp == null){
		System.out.println("Employee does not exist..");
	}
	else
	{
		System.out.println("Enter the amount to give Bonus: ");
		int salary = sc.nextInt();

		em.getTransaction().begin();

		emp.setSalary(emp.getSalary() + salary);

		em.getTransaction().commit();

		System.out.println("Salary Updated ...");

	}
	em.close();

	System.out.println("done");
       
	}
}







