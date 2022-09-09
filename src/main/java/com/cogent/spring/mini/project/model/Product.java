package com.cogent.spring.mini.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int prodId;
	private String prodName;
	private double prodCost;
	private double prodDiscount;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String prodName, double prodCost, double prodDiscount) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.prodDiscount = prodDiscount;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdCost() {
		return prodCost;
	}
	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}
	public double getProdDiscount() {
		return prodDiscount;
	}
	public void setProdDiscount(double prodDiscount) {
		this.prodDiscount = prodDiscount;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + ", prodDiscount="
				+ prodDiscount + "]";
	}
	
	
	
	

}
