package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.exceptions.DepartmentException;
import com.masai.exceptions.EmployeeException;
import com.masai.models.Department;
import com.masai.models.Employee;
import com.masai.util.EMUtil;
import com.mysql.cj.Query;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addDepartment(Department dept) {
		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		
	}

	@Override
	public void addEmployee(Employee emp) {
		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
		EntityManager em = EMUtil.provideEntityManager();
		Employee employee = em.find(Employee.class, empId);
		
		if(employee != null) {
			Department department = em.find(Department.class, deptId);
			if(department != null) {
				employee.setDepartment(department);
				department.getEmployees().add(employee);
				System.out.println("done ... ");
				em.getTransaction().begin();
				em.persist(employee);
				em.getTransaction().commit();
			}
			else throw new DepartmentException("Department not found");
		}
		else throw new EmployeeException("Employee not found");
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		List<Employee> employees= null;
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "from Department where deptName = ?1";
		TypedQuery<Department> q = em.createQuery(jpql,Department.class);
		q.setParameter(1, deptName);
		Department department = q.getSingleResult();
		employees = department.getEmployees();
		if(employees.size() == 0) throw new EmployeeException("No employee found");
		return employees;
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		Department department = null;
		EntityManager em = EMUtil.provideEntityManager();
		Employee emp = em.find(Employee.class, empId);
		department = emp.getDepartment();
		if(department == null) throw new DepartmentException("No department found");
		
		return department;
	}
	
}
