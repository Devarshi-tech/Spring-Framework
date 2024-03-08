package com.spring.demo.SpringFramework.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/SpringFramework/constructorinjection/ciconfig.xml");
		
		Person p = (Person) context.getBean("person");
		
		System.out.println(p);
		
		Addition add = (Addition) context.getBean("add");
		add.doSum();
//		System.out.print(add.doSum());
	}

}
