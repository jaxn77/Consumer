package com.mkyong;

public class Products {
	
	public Products() {
		super();
	}
	public Products(String product_ID, String product_name,
			String product_price, String product_rating) {
		super();
		this.product_ID = product_ID;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_rating = product_rating;
	}
	String product_ID;
	String product_name;
	String product_price;
	String product_rating;
	public String getProduct_ID() {
		return product_ID;
	}
	public void setProduct_ID(String product_ID) {
		this.product_ID = product_ID;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_price() {
		return product_price;
	}
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	public String getProduct_rating() {
		return product_rating;
	}
	public void setProduct_rating(String product_rating) {
		this.product_rating = product_rating;
	}

}
