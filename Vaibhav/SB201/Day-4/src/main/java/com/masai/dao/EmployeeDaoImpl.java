package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.Emutil.EMUtil;
import com.masai.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
     
		EntityManager em= EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		
		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emp=null;
		
		EntityManager em= EMUtil.provideEntityManager();
		em.getTransaction().begin();
		Employee employee =em.find(Employee.class, empId);
		em.getTransaction().commit();
		emp=employee;
		em.close();
		
		return emp;
	}


	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
			
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		em.close();
		return employee;
		
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		EntityManager em= EMUtil.provideEntityManager();
		em.getTransaction().begin();
		Employee employee =em.find(Employee.class, empId);
		
		if(employee !=null) {
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
			em.close();
		}
		return employee;
	}

}
