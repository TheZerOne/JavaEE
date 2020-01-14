package com.spring.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDrawerApp {
		
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
					
		Shape shape = context.getBean("myShape", Shape.class);
		
		System.out.println(shape.drawShape());
		System.out.println(shape.colorShape());
		
		context.close();
	}
	

}
