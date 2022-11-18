package com.masai.cases;

import javax.persistence.EntityManager;

import com.masai.models.ConractualEmployee;
import com.masai.models.SalariedEmployee;
import com.masai.util.EMUtil;

public class InsertRecords {
	public static void main(String[] args) {
		EntityManager em = EMUtil.provideEntityManager();
		
		SalariedEmployee salariedEmployee1 = new SalariedEmployee();
		SalariedEmployee salariedEmployee2 = new SalariedEmployee();
		SalariedEmployee salariedEmployee3 = new SalariedEmployee();
		SalariedEmployee salariedEmployee4 = new SalariedEmployee();
		
		salariedEmployee1.setEmpName("Rohan");
		salariedEmployee1.setEmail("rohan@gmail.com");
		salariedEmployee1.setSalary(10000);
		
		salariedEmployee2.setEmpName("Vishal");
		salariedEmployee2.setEmail("vishal@gmail.com");
		salariedEmployee2.setSalary(20000);
		
		salariedEmployee3.setEmpName("Vikarm");
		salariedEmployee3.setEmail("vikram@gmail.com");
		salariedEmployee3.setSalary(30000);
		
		salariedEmployee4.setEmpName("Anuj");
		salariedEmployee4.setEmail("anuj@gmail.com");
		salariedEmployee4.setSalary(40000);
		
		
		ConractualEmployee conractualEmployee1 = new ConractualEmployee();
		ConractualEmployee conractualEmployee2 = new ConractualEmployee();
		ConractualEmployee conractualEmployee3 = new ConractualEmployee();
		ConractualEmployee conractualEmployee4 = new ConractualEmployee();
		
		conractualEmployee1.setEmpName("C1");
		conractualEmployee1.setMobileNumber(93939);
		conractualEmployee1.setNoOfWorkingDays(2);
		conractualEmployee1.setCostofperday(100);
		
		conractualEmployee2.setEmpName("C2");
		conractualEmployee2.setMobileNumber(93939);
		conractualEmployee2.setNoOfWorkingDays(2);
		conractualEmployee2.setCostofperday(100);
		
		conractualEmployee3.setEmpName("C3");
		conractualEmployee3.setMobileNumber(93939);
		conractualEmployee3.setNoOfWorkingDays(2);
		conractualEmployee3.setCostofperday(100);
		
		conractualEmployee4.setEmpName("C4");
		conractualEmployee4.setMobileNumber(93939);
		conractualEmployee4.setNoOfWorkingDays(2);
		conractualEmployee4.setCostofperday(100);
		
		
		em.getTransaction().begin();
		em.persist(salariedEmployee1);
		em.persist(salariedEmployee2);
		em.persist(salariedEmployee3);
		em.persist(salariedEmployee4);
		
		em.persist(conractualEmployee1);
		em.persist(conractualEmployee2);
		em.persist(conractualEmployee3);
		em.persist(conractualEmployee4);
		
		em.getTransaction().commit();
		System.out.println("done...");
		
	}
}
