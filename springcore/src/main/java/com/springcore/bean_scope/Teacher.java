package com.springcore.bean_scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class Teacher {

	@Value("D")
	private String name;
	@Value("Goa")
	private String city;

	@Value("#{friends}")
	private List<String> friends;

	public Teacher() {
		super();
	}

	public Teacher(String name, String city, List<String> friends) {
		super();
		this.name = name;
		this.city = city;
		this.friends = friends;
	}

	public String getCity() {
		return this.city;
	}

	public String getName() {
		return this.name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + this.name + ", city=" + this.city + ", friends=" + this.friends + "]";
	}

}
