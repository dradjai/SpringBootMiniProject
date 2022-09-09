package com.cogent.spring.mini.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.spring.mini.project.model.Product;
import com.cogent.spring.mini.project.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repo;
	
	@Override
	public Product createProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	@Override
	public Product getProductById(int prodId) {
		return repo.findById(prodId).get();
	}

	@Override
	public Product updateProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public String deleteProduct(int prodId) {
		repo.deleteById(prodId);
		return "product deleted";
	}

}
