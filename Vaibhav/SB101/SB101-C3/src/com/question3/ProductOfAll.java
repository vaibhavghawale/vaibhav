package com.question3;

import java.util.concurrent.Callable;

public class ProductOfAll implements Callable<Integer> {

	int num;
	int product=1;
	public ProductOfAll(int num) {
		this.num=num;
	}
	
	
	
	@Override
	public Integer call() throws Exception {
		
		for(int i=1;i<num;i++) {
			product=product*i;
		}
		
		return product;
		
	}

	
	
}
