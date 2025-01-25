package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

	private double price;

	public Pepsi() {
		// TODO Auto-generated constructor stub
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// init method work
		System.out.println("Pepsi Init Method");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Pepsi Destroy Method");

	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + this.price + "]";
	}

}
