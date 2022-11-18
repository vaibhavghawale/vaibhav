package com.UseCases;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Account;
import com.utility.EmUtil;

public class QueriesMain {
	public static void main(String[] args) {

		EntityManager em= EmUtil.provideEntityManager();

/*======================= Step:1 Named Queries:- For getting All Account Details =======================*/
//		Query q= em.createNamedQuery("account.getBalance");
//
//		q.setParameter("bal", 5000);
//
//		List<Account> accounts=q.getResultList();
//
//		accounts.forEach(a -> System.out.println(a));
		
/*======================= Step:2 NativeQueries:- For getting All Account Details =======================*/	
		
//		String nq="select * from account"; //here account is the table name
//
//	 	Query q= em.createNativeQuery(nq, Account.class);
//
//	 	List<Account> list= q.getResultList();
//
//	 	list.forEach(a -> System.out.println(a));	
		
/*======================= Step:3 NamedNativeQuery:- For getting All Account Details =======================*/
		Query q= em.createNamedQuery("allAccount" );

	 	List<Account> list= q.getResultList();

	 	list.forEach(a -> System.out.println(a)); 	
	 	

	}
}










