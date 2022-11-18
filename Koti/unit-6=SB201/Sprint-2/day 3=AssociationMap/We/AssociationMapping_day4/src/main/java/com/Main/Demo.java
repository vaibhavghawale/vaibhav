package com.Main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.Model.Department;
import com.Model.Employee;
import com.utility.EmUtil;

public class Demo {
public static void main(String[] args) {
	EntityManager em=EmUtil.provideEntityManager();
/*================== Step:1 for Registration (one to Many) - Unidirectional =========================*/
	
//	Employee emp1=new Employee();
//	emp1.setName("Koti");
//	emp1.setSalary(8500);
//
//	Employee emp2=new Employee();
//	emp2.setName("Raj");
//	emp2.setSalary(7500);
//
//	Department dept=new Department();
//
//	dept.setDname("Sales");
//	dept.setLocation("Andhra");
//
//	//associating both employee with a one dept obj
//	dept.getList().add(emp1);
//	dept.getList().add(emp2);
//	
//
//
//
//	em.getTransaction().begin();
//
////	em.persist(emp1); These two are neglect when we use cascade
////	em.persist(emp2); 
//	em.persist(dept);
//
//	em.getTransaction().commit();
//
//	em.close();
//
//	System.out.println("done...");
	
/*====== Step:2 for Getting details of employee by department name (one to Many) - Unidirectional ==========*/
	
//	String jpql= "select list from Department where dname=:dn";
//
//	Query q= em.createQuery(jpql);
//	q.setParameter("dn", "Sales");
//
//	List<Employee> allemps= q.getResultList(); //when it is non primary key it gives getResultList
//
//
////	System.out.println(allemps);
//	allemps.forEach(emp -> System.out.println(emp));
//
//
//	System.out.println("done...");

/*================= Step: 3 For Registration Many to One Relationship - Unidirectional ====================*/
//	
//	Department dept=new Department();
//	dept.setDname("Sales");
//	dept.setLocation("mumbai");
//
//	Employee emp1=new Employee();
//	emp1.setName("ram");
//	emp1.setSalary(7800);
//	emp1.setDept(dept);
//
//	Employee emp2=new Employee();
//	emp2.setName("ramesh");
//	emp2.setSalary(8850);
//	emp2.setDept(dept);
//
//
//	em.getTransaction().begin();
//
//	em.persist(emp1);
//	em.persist(emp2);
//
//	em.getTransaction().commit();
//
//	System.out.println("done...");
	
/*=== Step:4 for getting the details of Department based on employee Id ( Many to one - Unidirectional) ====*/
	
//	Employee emp= em.find(Employee.class, 3);
//
//	Department dept= emp.getDept();
//
//	System.out.println(dept.getDeptId());
//	System.out.println(dept.getDname());
//	System.out.println(dept.getLocation());
	
/*================= Step: 4 For Registration One to Many (bidirectional):- ====================*/	

//	Department dept=new Department();
//	dept.setDname("Marketing");
//	dept.setLocation("Kolkata");
//
//	Employee emp1=new Employee();
//	emp1.setName("Sunil");
//	emp1.setSalary(7800);
//	emp1.setDept(dept); //associating dept with emp1
//
//	Employee emp2=new Employee();
//	emp2.setName("Suresh");
//	emp2.setSalary(8800);
//	emp2.setDept(dept); //associating dept with emp1
//
//	//here both emp got the dept details..
//
//	//now we need to give both emp details to the dept
//	//associating both emp with the dept
//
//	dept.getEmps().add(emp1);
//	dept.getEmps().add(emp2);
//
//
//	em.getTransaction().begin();
//
//	em.persist(dept);
//
//	em.getTransaction().commit();
//
//	System.out.println("done...");
//	
/*================= Step: 5 List out all the employees working in perticular dept:- ====================*/	
	
//	Department d= em.find(Department.class, 1);
//
//	List<Employee> emps= d.getEmps();
//
//	emps.forEach(e ->{
//
//		System.out.println(e.getEmpId());
//		System.out.println(e.getName());
//		System.out.println(e.getSalary());
//
//	});
//
//	System.out.println("done...");

/*================= Step: 6 Many to Many ====================*/		
	
	Department d1 = new Department();
	d1.setDname("sales");
	d1.setLocation("kolkata");


	Department d2 = new Department();
	d2.setDname("Marketing");
	d2.setLocation("delhi");




	//creating employee without department
	Employee emp1 = new Employee();
	emp1.setName("ram");
	emp1.setSalary(50000);


	Employee emp2 = new Employee();
	emp2.setName("dinesh");
	emp2.setSalary(30000);

	//associating department with both employees(ram,dinesh) with dept sales
	emp1.getDeptList().add(d1);
	emp2.getDeptList().add(d1);

	//associating dept(sales) with both emp1 and emp2

	d1.getEmps().add(emp1);
	d1.getEmps().add(emp2);



	//assume dinesh is working in 2 dept(sales and marketing)
	emp2.getDeptList().add(d2);
	d2.getEmps().add(emp2);



	em.getTransaction().begin();

	em.persist(d1);
	em.persist(d2);

	em.getTransaction().commit();

	System.out.println("done");
 }
}
















