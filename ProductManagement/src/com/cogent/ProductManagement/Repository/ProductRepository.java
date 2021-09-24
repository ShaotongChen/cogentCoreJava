package com.cogent.ProductManagement.Repository;

import com.cogent.ProductManagement.model.Product;

public interface ProductRepository {

	
	public String addProduct(Product product);
	public String deleteProductById(String id);
	public void deleteAllProducts();
	public Product getProductByID(String id);
	public Product[] getProducts();
	public String upddateProduct(String id, Product employee);
}
