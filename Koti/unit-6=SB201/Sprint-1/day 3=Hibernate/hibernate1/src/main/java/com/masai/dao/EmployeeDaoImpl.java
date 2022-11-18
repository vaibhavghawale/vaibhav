package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void save(Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();
	 // Transaction Statement (single tern object)
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		em.close();
		System.out.println();
		System.out.println(emp);

	}

	@Override
	public String getAddressOfEmployee(int empId) {
		
		String Address=null;
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em= emf.createEntityManager();
        Employee employee =em.find(Employee.class, empId);
		
		if(employee !=null) {
			em.getTransaction().begin();
			Address=employee.getAddress();
			em.getTransaction().commit();
		}
		
		return Address;	
		
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String emp="Employee not found for adding a bonus";
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em= emf.createEntityManager();
        Employee employee =em.find(Employee.class, empId);
		
		if(employee !=null) {
			em.getTransaction().begin();
			
			employee.setSalary(employee.getSalary()+bonus);
			
			em.getTransaction().commit();
			emp="Bonus has been added to "+employee.getName()+" Salary";
		}
		
		return emp ;	
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em= emf.createEntityManager();
		Employee employee =em.find(Employee.class, empId);
		
		if(employee !=null) {
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
			return true;
		}
		
		return false;
	}

}
