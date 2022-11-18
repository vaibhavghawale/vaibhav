package com.masai.productDao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.Emutil.EMUtil;
import com.masai.Entities.Product;
import com.masai.Exception.ProductException;
import com.mysql.cj.Query;

import antlr.collections.List;

public class ProductDaoImpl implements ProductDao {

	@Override
	public Product AddingProduct(Product product) throws ProductException {
		
		EntityManager em= EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(product);
		em.getTransaction().commit();
		em.close();
		
		
		return product;
	}

	@Override
	public void CallQuery() {
		
		EntityManager em= EMUtil.provideEntityManager();
		String jpql="select productName,quantity from Product";
		
		javax.persistence.Query q=em.createQuery(jpql);
		java.util.List<Object[]> product=q.getResultList();
		
	 	for(Object[] pr: product) {
	 		
	 		 String name= (String)pr[0];
	 		 int balance= (Integer)pr[1];
	 		
	 		 System.out.println("Name is "+name);
	 		 System.out.println("Balance is :"+balance);
	 		 
	 		System.out.println("===========================");
	 	}
		
		
	}

	@Override
	public void CallQuery2(int id) {
		EntityManager em= EMUtil.provideEntityManager();
		String jpql="select price from Product where productId=:pid";
        
		TypedQuery<Integer> tq= em.createQuery(jpql,Integer.class);
		
	 	tq.setParameter("pid",id);
	 	
	 	Integer pr= tq.getSingleResult();
 	
 		 System.out.println("Product price is :"+(Integer)pr);
 			
	     em.close();
		
	}

	@Override
	public void detailProduct(int id) {
		
		EntityManager em= EMUtil.provideEntityManager();
		String jpql="productName from Product where productId=:pid ";
        
		
		javax.persistence.Query q=em.createQuery(jpql);
		
		
	 	q.setParameter("pid",id);
	 	

	 	java.util.List<Product> pr=q.getResultList();
 	
	 	pr.forEach(s -> System.out.print(s));
 			
	     em.close();
		
		
		
	}

	@Override
	public void totalPrice() {
		
		EntityManager em= EMUtil.provideEntityManager();
		String jpql="SELECT SUM(price) from product";
		
        TypedQuery<Integer> tq= em.createQuery(jpql,Integer.class);
	 	
	 	Integer pr= tq.getSingleResult();
 	
 		 System.out.println("Product price is :"+(Integer)pr);
 			
	     em.close();
		
		
		
	}

	@Override
	public void getList() {
		
		EntityManager em= EMUtil.provideEntityManager();
		String jpql="from Product where quantity < 5 ";
        
		TypedQuery<Integer> tq= em.createQuery(jpql,Integer.class);
	
	 	List pr= (List) tq.getResultList();
 	
 		((Iterable<Integer>) pr).forEach(s -> System.out.println(s));
 			
	     em.close();
	}

}
