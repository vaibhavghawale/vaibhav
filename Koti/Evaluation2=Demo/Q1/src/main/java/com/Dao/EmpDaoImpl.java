package com.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.Exceptions.DepartmentException;
import com.Exceptions.EmployeeException;
import com.Model.Department;
import com.Model.Employee;
import com.utility.EmUtil;

public class EmpDaoImpl implements EmpDao{

	EntityManager em=EmUtil.provideEntityManager();
	@Override
	public void addDepartment(Department dept) {
		if(dept!=null) {
			em.getTransaction().begin();
			em.persist(dept);
			em.getTransaction().commit();
			
			System.out.println("Department Saved...");
		}
		em.close();
	}

	@Override
	public void addEmployee(Employee emp) {
		if(emp!=null) {
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
			
			System.out.println("Employee Saved...");
		}
		em.close();		
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
		Employee employee=em.find(Employee.class, empId);
		Department department=em.find(Department.class, deptId);
		System.out.println(department);
		System.out.println(employee);
		
		if(department==null) {
			throw new DepartmentException("Department Not Exist");
		}
		if(employee==null) {
			throw new EmployeeException("Employee Not Exist");
		}
		else {
			employee.setDepartment(department);
			department.getEmp().add(employee);
			em.getTransaction().begin();
			
			Department dep1=em.merge(department);
			em.getTransaction().commit();
			em.close();
			
			System.out.println(department);
			System.out.println("done...");
		}
		
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		List<Employee> allemp=null;
		String jpql="select emp from Department where name=?1";		
		Query q=em.createQuery(jpql);
		q.setParameter(1, deptName);
		allemp=q.getResultList();
		
		if(allemp.size()==0) throw new EmployeeException("No Employee Found..");
		em.close();
		return allemp;
		
		
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		Employee emp2=em.find(Employee.class, empId);
		Department dep2=emp2.getDepartment();
		em.close();
		
		if(dep2==null) throw new DepartmentException("No Department Found");
		return dep2;
	}

}














