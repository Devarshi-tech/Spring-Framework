package com.spring.demo.SpringFramework.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private double price;

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}

}
