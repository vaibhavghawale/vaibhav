package com.UseCases;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
//		//String jpql= "select a from Account a where a.name='Ram' ";
//		String jpql = "from Account where name='Ramesh'";
//		Query q = em.createQuery(jpql);
//
////				Object obj= q.getSingleResult();
////				Account acc=(Account)obj;
//
//		Account acc = (Account) q.getSingleResult(); //use this statement or wright above 2 statements
//		System.out.println(acc);
//
//		em.close();	
/* =============== Step4 Unique row Without using downcasting ==============*/	

//		//String jpql= "select a from Account a where a.name='Ram' ";
//		String jpql= "from Account where name='Ram'";
//		TypedQuery<Account> q= em.createQuery(jpql,Account.class);
//
//		Account acc= q.getSingleResult();
//
//		System.out.println(acc);
				
/* =============== Step5 Bulk Update (We update all rows)  ==============*/	
//		String jpql= "update Account set balance=balance+500";
//
//		Query q= em.createQuery(jpql);
//
//		em.getTransaction().begin();
//		int x= q.executeUpdate();
//		em.getTransaction().commit();
//
//		System.out.println(x+" row updated...");
		
/* =============== Step6 using positional parameter:-updating balance using name ==============*/	
//		String jpql= "update Account set balance=balance+?1 where name=?2";
//
//		Query q= em.createQuery(jpql);
//
//		q.setParameter(1, 1000);
//		q.setParameter(2, "Ram");
//
//		em.getTransaction().begin();
//		int x=q.executeUpdate();
//		em.getTransaction().commit();
//
//
//		System.out.println(x+" record updated...");
		
/* =============== Step7 using named parameter:- updating balance using name ==============*/
		
//		String jpql= "update Account set balance=balance+:bal where name=:n";
//
//		Query q= em.createQuery(jpql);
//
//		q.setParameter("bal", 600);
//		q.setParameter("n", "Ramesh");
//
//		em.getTransaction().begin();
//		int x=q.executeUpdate();
//		em.getTransaction().commit();
//
//
//		System.out.println(x+" record updated...");
						
/* =============== Step 8 getting name using id ==============*/	
		
//		String jpql ="select name from Account where accno =:ano";
//		TypedQuery<String> q=em.createQuery(jpql,String.class);
//				q.setParameter("ano", 2);		
//				String n= q.getSingleResult();
//				
//				System.out.println(n);
		
/* =============== Step 9  multiple row and 1 column:-Getting balance from all rows ==============*/

//		String jpql= "select balance from Account";
//
//		Query q=em.createQuery(jpql);
//
//		List<Integer> list= q.getResultList();
//
//		System.out.println(list);
		
/* =============== Step 10.A few column and all rows: we are getting name and balance-==============*/	
		
//		String jpql= "select name,balance from Account";
//
//		Query q= em.createQuery(jpql);
//	 	List<Object[]> results= q.getResultList();
//
//	 	for(Object[] or: results) {
//
//	 		 String name= (String)or[0];
//	 		 int balance= (Integer)or[1];
//
//	 		 System.out.println("Name is "+name);
//	 		 System.out.println("Balance is :"+balance);
//
//	 		System.out.println("===========================");
//	 	}
		
/* =============== Step 10.B few column and all rows: we are getting name and balance -==============*/			
//		String jpql= "select name,balance from Account where accno=:an";
//
//		TypedQuery<Object[]> q= em.createQuery(jpql,Object[].class);//without downcasting
//		q.setParameter("an", 1);
//	 	Object[] result=q.getSingleResult();
//	 	
//	 	System.out.println("Name is "+((String)result[0]).toUpperCase());
//		 System.out.println("Balance is :"+(Integer)result[1]);
		
/* =============== Step 11 aggregrate function:- Adding all balances in all rows ==============*/	
		String jpql= "select sum(balance) from Account";

		TypedQuery<Long> q=em.createQuery(jpql,Long.class);

		long result= q.getSingleResult();

		System.out.println(result);
		
		
	}		
}


















