package com.spring.demo.SpringFramework.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting property");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	configure life cycle methods in xml file
	public void init() {
		System.out.println("inside init mehtod");
	}
	
//	to call destory , enable pre shut down hook in Test.class
	public void destory() {
		System.out.print("Inside destory method");
	}

}
