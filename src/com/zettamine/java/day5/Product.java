package com.zettamine.java.day5;

import java.io.Serializable;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int productId;
	private String productName;
	
	public Product(int id, String name) {
		this.productId = id;
		this.productName = name;
	}
	
	public int getId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
}
