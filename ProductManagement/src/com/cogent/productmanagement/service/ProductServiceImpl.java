package com.cogent.productmanagement.service;

import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.repository.ProductRepository;
import com.cogent.productmanagement.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService{

	
	ProductRepository productRepository= ProductRepositoryImpl.getInstance();
	private static ProductService productService;
	private ProductServiceImpl() {
		
		
	}
	public static ProductService getInstance() {
		if(productService==null) {
			productService= new ProductServiceImpl();
			return productService;
		}
		return productService;
	}
	@Override
	public String addProduct(Product product) {
		
		return productRepository.addProduct(product);
	}

	@Override
	public String updateProduct(String Id, Product product) {
		// TODO Auto-generated method stub
		return productRepository.updateProduct(Id, product);
	}

	@Override
	public Product getProductById(String Id) {
		// TODO Auto-generated method stub
		return productRepository.getProductById(Id);
	}

	@Override
	public Product[] getProducts() {
		return productRepository.getProducts();
	}

	@Override
	public String deleteProductById(String Id) {
		// TODO Auto-generated method stub
		return productRepository.deleteProductById(Id);
	}

	@Override
	public void deleteAllProducts() {
		productRepository.deleteAllProducts();
		
	}

}
