package com.spring.demo.SpringFramework.autowiring.qualifierannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	// annotation on property
	// this uses basically type annotation
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

//	autowiring by setter
	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		System.out.println("setting value from setter");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	autowiring by constructor
//	@Autowired
//	@Qualifier("address2")
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
