package com.cogent.productmanagement.service;

import com.cogent.productmanagement.model.Product;

public interface ProductService {

	
	public String addProduct(Product product);
	public String updateProduct(String Id, Product product);
	public Product getProductById(String Id);
	public Product[] getProducts();
	public String deleteProductById(String Id);
	public void deleteAllProducts();
}
