package com.cogent.productmanagement.model;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class Product {

	
	public Product(String productId, String productName, float productPrice, long qty, String bathchNo) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.qty = qty;
		this.bathchNo = bathchNo;
	}
	private String  productId;
	private String  productName;
	private float productPrice;
	private long qty;
	private Date createDate;
	private Date expiryDate;
	private String bathchNo;
	
	
}
