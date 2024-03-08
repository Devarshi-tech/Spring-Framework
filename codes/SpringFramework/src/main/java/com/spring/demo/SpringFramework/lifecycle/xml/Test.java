package com.spring.demo.SpringFramework.lifecycle.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/spring/demo/SpringFramework/lifecycle/lifecycleconfig.xml");
		
		Samosa s1 = (Samosa) context.getBean("samosa1");
		
		System.out.println(s1);
		
		//(shut down hook enable)
		//call destroy method mentioned in xml bean
		context.registerShutdownHook();
	}

}
