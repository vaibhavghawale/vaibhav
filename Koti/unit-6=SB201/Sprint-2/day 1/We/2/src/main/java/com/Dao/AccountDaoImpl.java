package com.Dao;

import javax.persistence.EntityManager;

import com.model.Account;
import com.utility.EmUtil;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean createAccount(Account account) {
		boolean flag=false;
		
		EntityManager em=EmUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(account);
		flag=true;
		em.getTransaction().commit();
		em.close();
		
		return flag;
	}

	@Override
	public boolean deleteAccount(int accno) {
		boolean flag=false;


		EntityManager em= EmUtil.provideEntityManager();

		Account acc=em.find(Account.class, accno);

		if(acc != null){

			em.getTransaction().begin();

			em.remove(acc);
			flag=true;

			em.getTransaction().commit();
		}

		em.close();



		return flag;
	}

	@Override
	public boolean updateAccount(Account account) {
		boolean flag=false;


		EntityManager em= EmUtil.provideEntityManager();

		em.getTransaction().begin();

		em.merge(account);
		flag=true;

		em.getTransaction().commit();


		em.close();

		return flag;
	}

	@Override
	public Account findAccount(int accno) {
		/*Account account=null;

		 EntityManager em=EMUtil.provideEntityManager();


		 	account = em.find(Account.class, accno);




			return account;*/

			return EmUtil.provideEntityManager().find(Account.class, accno);
	}
   
}
