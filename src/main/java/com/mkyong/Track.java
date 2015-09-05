package com.mkyong;

import java.util.List;

public class Track {

	String orderno;
	String gross;
	List <Products> products;



	@Override
	public String toString() {
		return "Order [orderno=" + orderno + ", singer=" + gross + "List of products "+ products+"]";
	}



	public String getOrderno() {
		return orderno;
	}



	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}



	public String getGross() {
		return gross;
	}



	public void setGross(String gross) {
		this.gross = gross;
	}



	public List<Products> getProducts() {
		return products;
	}



	public void setProducts(List<Products> products) {
		this.products = products;
	}

}
