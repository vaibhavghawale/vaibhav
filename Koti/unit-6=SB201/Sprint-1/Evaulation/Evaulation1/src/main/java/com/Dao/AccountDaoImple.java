package com.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.useCases.Account;

public class AccountDaoImple implements AccountDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
	EntityManager em= emf.createEntityManager();
	
	
	@Override
	public Account findById(int id) {
		Account account=em.find(Account.class, id);
		
		if(account!=null) {
			return account;
			
		}	
		
		return account;
	}


	@Override
	public String save(Account account) {
		String a=null;
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		em.close();
		System.out.println(account);
		
		return null;
	}


	@Override
	public String deleteAccountById(int id) {
		Account account=em.find(Account.class, id);
		String d=null;
		if(account!=null) {
			em.getTransaction().begin();
			em.remove(account);
			em.getTransaction().commit();
			
		}
		return d;
	}

}
