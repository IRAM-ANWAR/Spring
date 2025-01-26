package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	public static int produceY() {
		return 10;
	}

	@Value("#{demo.produceX()}")
	private int x;

	@Value("#{T(com.springcore.spel.Demo).produceY()}")
	private int y;
	@Value("#{new java.lang.String('Iram')}")
	private String name;
	@Value("#{true}")
	private boolean isActive;

	public String getName() {
		return this.name;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int produceX() {
		return 7;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + this.x + ", y=" + this.y + ", name=" + this.name + ", isActive=" + this.isActive + "]";
	}

}
