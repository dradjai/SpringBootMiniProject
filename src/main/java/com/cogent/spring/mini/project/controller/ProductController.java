package com.cogent.spring.mini.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.spring.mini.project.model.Product;
import com.cogent.spring.mini.project.service.ProductServiceImpl;


@RestController
@RequestMapping("/pms/api/")
public class ProductController {
	
	
	@Autowired
	ProductServiceImpl pService;
	
	
	//Post
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return pService.createProduct(product);
	}
	
	//Get
	@GetMapping
	public List<Product> getAllProducts(){
		return pService.getAllProducts();
	}
	
	@GetMapping("product/{prodId}")
	public Product getProductById(@PathVariable("prodId") int prodId) {
		return pService.getProductById(prodId);
	}
	
	//PUT
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return pService.updateProduct(product);
	}
	
	//DELETE
	@DeleteMapping("{prodId}")
	public String deleteProduct(@PathVariable("prodId") int prodId) {
		return pService.deleteProduct(prodId);
	}

}
