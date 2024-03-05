package com.spring.demo.SpringFramework.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.SpringFramework.collections.Emp;

public class TestRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/spring/demo/SpringFramework/ref/refconfig.xml");
		A a = (A) context.getBean("aref");
		
		System.out.println(a.toString());
		
	}

}
