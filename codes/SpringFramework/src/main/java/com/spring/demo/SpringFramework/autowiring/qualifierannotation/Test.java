package com.spring.demo.SpringFramework.autowiring.qualifierannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/demo/SpringFramework/autowiring/qualifierannotation/autowireconfig.xml");
		
		Employee e = (Employee) context.getBean("emp");
		
		System.out.println(e);
	}

}
