package com.masai;

import javax.persistence.EntityManager;

import com.utility.EmUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		
		EntityManager em=EmUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		
		em.close();
		return employee;		
		
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee e=null;
		EntityManager em=EmUtil.provideEntityManager();
		em.getTransaction().begin();
		Employee emp=em.find(Employee.class, empId);
		e=emp;
		em.getTransaction().commit();
		
		em.close();
		return e;
		
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		EntityManager em=EmUtil.provideEntityManager();
		em.getTransaction().begin();
      Employee employee1 =em.find(Employee.class, empId);
		
		if(employee1 !=null) {
			em.getTransaction().begin();
			em.remove(employee1);
			em.getTransaction().commit();
			em.close();
		}
		return employee1;
		
		
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		EntityManager em=EmUtil.provideEntityManager();
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		em.close();
		
		return employee;
		
	}

}




