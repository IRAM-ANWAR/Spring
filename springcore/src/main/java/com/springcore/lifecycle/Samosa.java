package com.springcore.lifecycle;

public class Samosa {
	private Double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(Double price) {
		super();
		this.price = price;
	}

	public void destroy() {
		System.out.println("Destroy Method");
	}

	public Double getPrice() {
		return this.price;
	}

	public void init() {
		System.out.println("Init Method");
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + this.price + "]";
	}
}
