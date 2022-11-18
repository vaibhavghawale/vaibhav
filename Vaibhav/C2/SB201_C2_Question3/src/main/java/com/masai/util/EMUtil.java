package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	static EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("mappingUnit");
	}
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
}
