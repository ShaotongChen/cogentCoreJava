package com.cogent.ProductManagement.model;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Product {
public Product(String productId, String productName, float productPrice, long qty, String batchNo) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.qty = qty;
		this.batchNo = batchNo;
	}
private String productId;
private String productName;
private float productPrice;
private Date productDate;
private Date expiryDate;
private long qty;
private String batchNo;
	/*productID: String 
	ProductName: String
	productPrice : Float
	productDate: date
	qty: long;
	expiryDate: date
	batchNo: String.*/
}
