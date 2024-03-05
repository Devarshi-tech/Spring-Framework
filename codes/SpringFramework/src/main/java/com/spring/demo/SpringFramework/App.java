package com.spring.demo.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // we will tell IoC to give us object of Student
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student stu1 = (Student) context.getBean("student1");
        Student stu2 = (Student) context.getBean("student2");
        Student stu3 = (Student) context.getBean("student3");
        // IoC maintained life cycle of object
        System.out.println(stu1);
        System.out.print(stu3);
    }
}
