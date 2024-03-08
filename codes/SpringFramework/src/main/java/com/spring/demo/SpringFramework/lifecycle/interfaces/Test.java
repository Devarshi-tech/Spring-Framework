package com.spring.demo.SpringFramework.lifecycle.interfaces;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/spring/demo/SpringFramework/lifecycle/lifecycleconfig.xml");
		
		Pepsi p1 = (Pepsi) context.getBean("pepsi1");
		
		System.out.println(p1);
		
		//(shut down hook enable)
	
		context.registerShutdownHook();
	}

}
