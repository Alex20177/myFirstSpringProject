package com.example;

public class Address {

	private String city_name;
	private int build_no;
	private long pin_code;

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public int getBuild_no() {
		return build_no;
	}

	public void setBuild_no(int build_no) {
		this.build_no = build_no;
	}

	public long getPin_code() {
		return pin_code;
	}

	public void setPin_code(long pin_code) {
		this.pin_code = pin_code;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.city_name + "\t" + this.pin_code;
	}

}// Close Address
