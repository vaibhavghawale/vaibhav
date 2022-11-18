package com.utilities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class product {

	@Id
	private int Id;
	private String name;
	private int price;
	
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public product(int id, String name, int price) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [Id=" + Id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
