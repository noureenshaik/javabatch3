package com.product.pojo;

public class Product {
	
	private int pId;
	private String pName;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(int pId, String pName, double price, int quantity) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [pId= " + pId + ", pName= " + pName + ", price= $" + price + ", quantity= " + quantity + "]";
	}
	
	

}
