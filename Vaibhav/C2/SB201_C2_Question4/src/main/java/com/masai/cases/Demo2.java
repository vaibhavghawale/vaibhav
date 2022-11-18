package com.masai.cases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.models.ConractualEmployee;
import com.masai.models.SalariedEmployee;
import com.masai.util.EMUtil;

public class Demo2 {
	public static void main(String[] args) {
		EntityManager em = EMUtil.provideEntityManager();
		String jpql = "from ConractualEmployee"; 
		TypedQuery<ConractualEmployee> q = em.createQuery(jpql,ConractualEmployee.class);
		List<ConractualEmployee> list = q.getResultList();
		if(list == null) {
			System.out.println("No Conractual Employee found");
		}
		else {
			System.out.println("all details of ConractualEmployee are :");
			int empno = 1;
			for(ConractualEmployee cemp : list) {
				int i=1;
				System.out.println("Emp No = " + (empno++));
				System.out.println((i++) + "-> Id : " + cemp.getEmpId());
				System.out.println((i++) + "-> Name : " + cemp.getEmpName());
				System.out.println((i++) + "-> mobile no. : " + cemp.getMobileNumber());
				System.out.println((i++) + "-> Number of working days : " + cemp.getNoOfWorkingDays());
				System.out.println((i++) + "-> cost per day : " + cemp.getCostofperday());
				System.out.println("------------------------------------------");
			}
			
		}
		
		
		
	}
}

