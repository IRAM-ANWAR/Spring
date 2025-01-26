package com.springcore.autowiring;

public class Address {

	private String street;
	private String city;

	public String getCity() {
		return this.city;
	}

	public String getStreet() {
		return this.street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [street=" + this.street + ", city=" + this.city + "]";
	}

}
