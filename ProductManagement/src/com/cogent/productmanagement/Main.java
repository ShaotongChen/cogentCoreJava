package com.cogent.productmanagement;

import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.service.ProductService;
import com.cogent.productmanagement.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProductService productService= ProductServiceImpl.getInstance();
Product product= new Product("00001", "duck", 20, 10, "1");
Product product1= new Product("00002", "duc", 21, 10, "2");
Product product2= new Product("00003", "du", 22, 10, "3");
Product product3= new Product("00004", "d", 23, 10, "4");
Product product4= new Product("00005", "uck", 24, 10, "5");
Product product5= new Product("00006", "ck", 25, 10, "6");
Product product6= new Product("00007", "k", 26, 10, "7");
Product product7= new Product("00008", "dk", 27, 10, "8");
Product product8= new Product("00009", "dck", 28, 10, "9");
Product product9= new Product("00010", "duk", 29, 10, "10");
productService.addProduct(product);
productService.addProduct(product1);
productService.addProduct(product2);
productService.addProduct(product3);
productService.addProduct(product4);
productService.addProduct(product5);
productService.addProduct(product6);
productService.addProduct(product7);
productService.addProduct(product8);
productService.addProduct(product9);

//System.out.println(product);

Product productT= new Product("00000","123",66,77,"dsa");
Product[] products= productService.getProducts();
//productService.deleteAllProducts();
productService.deleteProductById("00007");
System.out.println(productService.updateProduct("00002", productT));
for(Product p: products) {
	System.out.println(p);
}

	}

}
