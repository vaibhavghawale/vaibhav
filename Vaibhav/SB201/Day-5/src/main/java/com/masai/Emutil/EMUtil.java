package com.masai.Emutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("productUnit");
	}
	
	public static EntityManager provideEntityManager(){
		
		//EntityManager em= emf.createEntityManager();
		//return em;
		
		return emf.createEntityManager();
	}
}
