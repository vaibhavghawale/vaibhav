package com.masai.cases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.models.SalariedEmployee;
import com.masai.util.EMUtil;

public class Demo1 {
	public static void main(String[] args) {
		EntityManager em = EMUtil.provideEntityManager();
		String jpql = "from SalariedEmployee";
		TypedQuery<SalariedEmployee> q = em.createQuery(jpql,SalariedEmployee.class);
		List<SalariedEmployee> list = q.getResultList();
		if(list == null) {
			System.out.println("No salaried employee found");
		}
		else {
			System.out.println("all details of SalariedEmployee are :");
			int empno = 1;
			for(SalariedEmployee semp : list) {
				int i=1;
				System.out.println("Emp No = " + (empno++));
				System.out.println((i++) + "-> Id : " + semp.getEmpId());
				System.out.println((i++) + "-> Name : " + semp.getEmpName());
				System.out.println((i++) + "-> Email : " + semp.getEmail());
				System.out.println((i++) + "-> Salary : " + semp.getSalary());
				System.out.println("------------------------------------------");
			}
			
		}
		
		
		
	}
}
