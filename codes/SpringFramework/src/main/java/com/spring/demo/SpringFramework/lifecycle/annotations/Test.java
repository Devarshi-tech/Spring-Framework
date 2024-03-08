package com.spring.demo.SpringFramework.lifecycle.annotations;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext 
		context = new ClassPathXmlApplicationContext("com/spring/demo/SpringFramework/lifecycle/lifecycleconfig.xml");

		Pizza p = (Pizza) context.getBean("pizza1");
		
		System.out.println(p);
		context.registerShutdownHook();
	}

}
