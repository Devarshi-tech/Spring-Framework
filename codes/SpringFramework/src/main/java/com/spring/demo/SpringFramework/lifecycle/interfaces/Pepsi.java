package com.spring.demo.SpringFramework.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	// this will work as init
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Taking pepsi : init");
	}

	// this will work as destory
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Going to put bottle back to shop : destroy");
	}

}
