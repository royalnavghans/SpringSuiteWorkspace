package com.read.prop.file;

public class Product {

	private Integer prodId;
	private String prodName;
	private Double prodCost;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	
	@Override
	public String toString() {
		return "product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + "]";
	}
}
