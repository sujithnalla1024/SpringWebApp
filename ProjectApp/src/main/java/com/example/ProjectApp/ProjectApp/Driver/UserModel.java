package com.example.ProjectApp.ProjectApp.Driver;

import java.util.ArrayList;

public class UserModel {
	private String email;
	private String password;
    private String username;
    private String mobileNumber;
    private boolean active;
    private String role;
    private ArrayList<OrderModel> ordersList;
	public UserModel(String email, String password, String username, String mobileNumber, boolean active, String role) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.active = active;
		this.role = role;
		ordersList=new ArrayList<OrderModel>();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<OrderModel> getOrdersList() {
		return ordersList;
	}
	public void setOrdersList(ArrayList<OrderModel> ordersList) {
		this.ordersList = ordersList;
	}
	
}
