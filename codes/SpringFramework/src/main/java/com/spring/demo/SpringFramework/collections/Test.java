package com.spring.demo.SpringFramework.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/spring/demo/SpringFramework/collections/collectionconfig.xml");
		Emp e1 = (Emp) context.getBean("emp1");
		
		System.out.println(e1.getAddresses());
		System.out.println(e1.getProps());
		
//		by default implementation is ArrayList
		System.out.println(e1.getPhones().getClass().getName());
		
	}

}
