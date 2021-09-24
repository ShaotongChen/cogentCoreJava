package com.cogent.productmanagement.repository;

import com.cogent.productmanagement.model.Product;

public class ProductRepositoryImpl implements ProductRepository{

	
	private Product[] products= new Product[10];
	int count=-1;
	private static ProductRepository productrepository;
	private ProductRepositoryImpl() {
		
		
	}
	public static ProductRepository getInstance() {
		if(productrepository ==null) {
		productrepository= new ProductRepositoryImpl();
		return productrepository;
		}
		return productrepository; 
	}
	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		if(count>products.length)
		return "the product stack is full.";
		
			products[++count]=product;
			return "success!";
		
	}

	@Override
	public String updateProduct(String Id, Product product) {
		
		Product prod= getProductById(Id);
		if(prod!=null) {
		this.products[index(prod)]= product;
		return "Success";
		}
		return "we didnt find "+Id+" Product";
		
	}

	@Override
	public Product getProductById(String Id) {
		for(int i=0; i< products.length;i++) {
			if(products[i]!=null && products[i].getProductId().equals(Id)) {
				
				return products[i]; 
			}
		}
		
		return null;
	}

	@Override
	public Product[] getProducts() {
		
		return products;
	}
private int index(Product product) {
	if(product !=null) {
	for(int a=0; a< this.products.length;a++) {
	if(this.products[a]!=null && this.products[a]==product) {
		
		return a;}
			}
	return -1;
	}else return -1;
}
	@Override
	public String deleteProductById(String Id) {
Product product = this.getProductById(Id);		
if(product!=null) {
	
	this.products[index(product)]=null;
	return "delete success";
	

}return "something is wrong!";
	}
	@Override
	public void deleteAllProducts() {
		if(this.products!=null) {
		for(int i=0; i<this.products.length;i++) {
			this.products[i]=null;
		}
		}
		// TODO Auto-generated method stub
		
	}

}
