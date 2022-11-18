package com.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {
	private static EntityManagerFactory emf;

	static{ //this static block exgute one time when EMUtil class run.
		emf=Persistence.createEntityManagerFactory("Customer-unit");
	}

	public static EntityManager provideEntityManager(){

		//EntityManager em= emf.createEntityManager();
		//return em;

		return emf.createEntityManager();
	}
}
