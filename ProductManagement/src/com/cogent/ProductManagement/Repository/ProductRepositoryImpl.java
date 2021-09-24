package com.cogent.ProductManagement.Repository;

import com.cogent.ProductManagement.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	
	Product[] products= new Product[10];
	int count=-1;
	private static ProductRepository productRepository;
	private ProductRepositoryImpl() {
		
		
	}
	public static ProductRepository getInstance() {
		if(productRepository==null) {
			productRepository= new ProductRepositoryImpl();
		return productRepository;
		}
		return productRepository;
	}
	@Override
	public String addProduct(Product product) {
	if(count>=products.length-1) {
		return "the product stack is full";
	}
	products[++count]=product;
	
	return "success!";
	}

	private int index(Product product) {
		if(product!=null) {
			for(int i=0; i<products.length;i++) {
				if(products[i]!=null && products[i]==product) {
					return i;
				}
			}return -1;
		}else return -1;
	}
	@Override
	public String deleteProductById(String id) {
		Product product= this.getProductByID(id);
		if(product!=null) {
			products[this.index(product)]=null;
		return "Deleted it";
		}else return "no found";
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		if(products!=null) {
		for(int i=0;i<products.length;i++ ) {
			products[i]=null;
			
		}
		
		}
		}

	@Override
	public Product getProductByID(String id) {

		for(int i=0; i<products.length;i++) {
			if(products[i]!=null && products[i].getProductId().equals(id)) {
				return products[i];
			}
		}
		return null;
	
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public String upddateProduct(String id, Product employee) {
 if(this.getProductByID(id)!=null) {
	 products[index(this.getProductByID(id))]=employee;
	 return "update success";
 }else return "no found";

	}

}
