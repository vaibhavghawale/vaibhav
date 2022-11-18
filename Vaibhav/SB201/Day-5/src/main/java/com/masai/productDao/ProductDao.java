package com.masai.productDao;

import com.masai.Entities.Product;
import com.masai.Exception.ProductException;

import antlr.collections.List;


public interface ProductDao {



	public Product AddingProduct(Product product) throws ProductException;

	public void CallQuery();

	public void CallQuery2(int id);

	public void detailProduct(int id);

	public void totalPrice();

	public void getList();

}
