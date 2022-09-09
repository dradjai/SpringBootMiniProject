package com.cogent.spring.mini.project.service;

import java.util.List;

import com.cogent.spring.mini.project.model.Product;

public interface ProductService {
	
	public Product createProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(int prodId);
	
	public Product updateProduct(Product product);
	
	public String deleteProduct(int prodId);
	

}
