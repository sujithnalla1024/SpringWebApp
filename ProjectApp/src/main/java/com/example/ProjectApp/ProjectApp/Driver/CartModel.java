package com.example.ProjectApp.ProjectApp.Driver;
public class CartModel {
	private String CartItemId;
	private String ProductName;
	private int quantity;
	private String price;
	public CartModel() {
		
	}
	public CartModel(String cartItemId, String productName, int quantity, String price) {
		super();
		CartItemId = cartItemId;
		ProductName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public String getCartItemId() {
		return CartItemId;
	}
	public void setCartItemId(String cartItemId) {
		CartItemId = cartItemId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}
