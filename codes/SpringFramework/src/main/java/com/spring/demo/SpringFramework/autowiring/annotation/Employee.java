package com.spring.demo.SpringFramework.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	// annotation on property
	// this uses basically type annotation
//	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

//	autowiring by setter
//	@Autowired
	public void setAddress(Address address) {
		System.out.println("setting value from setter");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	autowiring by constructor
	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("setting value from constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
