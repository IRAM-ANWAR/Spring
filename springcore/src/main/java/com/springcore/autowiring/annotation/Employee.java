package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	// @Autowired
	// @Qualifier("addressObj")
	private Address address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(@Qualifier("addressObj") Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return this.address;
	}

	// @Autowired
	// @Qualifier("addressObj")
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + this.address + "]";
	}

}
