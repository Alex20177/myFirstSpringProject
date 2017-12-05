package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Address;

@Component
public class Customer_Autowired {

	private String cust_name;
	private int cust_id;
	@Autowired
	private Address cust_address;

	public Customer_Autowired() {
		cust_id = 100;
		cust_name = "cust_name";
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public Address getCust_address() {
		return cust_address;
	}

	public void setCust_address(Address cust_address) {
		this.cust_address = cust_address;
	}

}// Close Customer_Autowired class
