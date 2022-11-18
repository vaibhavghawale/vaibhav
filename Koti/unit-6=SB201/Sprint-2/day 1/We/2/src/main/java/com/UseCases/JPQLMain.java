package com.UseCases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Account;
import com.utility.EmUtil;

public class JPQLMain {
	public static void main(String[] args) {
/* ========================= Step1 getting all the records from the DB =============================*/
		EntityManager em= EmUtil.provideEntityManager();

//		//String jpql= "select a from Account a";
//		String jpql= "from Account";
//		Query q=em.createQuery(jpql);
//
//		List<Account> list=q.getResultList();
//		
//		list.forEach(account -> System.out.println(account));
//		
//		em.close();
//
////		for(Account acc:list){
////			System.out.println(acc);
////		}
		
/* ========================= Step2 search on non-primary key =============================*/	
//		//String jpql= "select a from Account a where a.name='Ram' ";
//		String jpql_1= "from Account where name='Ramesh'";
//		Query q1= em.createQuery(jpql_1);
//
//		List<Account> list2= q1.getResultList();
//
//		for(Account acc:list2){
//			System.out.println(acc);
//	}

/* =============== Step3 if we conform that only one row will come then (Or) Unique row ==============*/
		//String jpql= "select a from Account a where a.name='Ram' ";
		String jpql = "from Account where name='Ramesh'";
		Query q = em.createQuery(jpql);

//				Object obj= q.getSingleResult();
//				Account acc=(Account)obj;

		Account acc = (Account) q.getSingleResult(); //use this statement or wright above 2 statements
		System.out.println(acc);

		em.close();					
				
}

}
















