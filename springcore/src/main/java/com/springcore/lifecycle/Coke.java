package com.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Coke {

	private double price;

	public Coke() {
		// TODO Auto-generated constructor stub
	}

	public Coke(double price) {
		super();
		this.price = price;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Method In Coke");
	}

	public double getPrice() {
		return this.price;
	}

	@PostConstruct
	public void init() {
		System.out.println("Init Method In Coke");

	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coke [price=" + this.price + "]";
	}
}
