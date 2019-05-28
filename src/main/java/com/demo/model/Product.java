package com.demo.model;

public class Product {

	private String pId;
	private String pName;
	private Double price;

	public Product() {
	}

	public Product(String pId, String pName, Double price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + "]";
	}

}
