package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Employee emp =context.getBean(Employee.class);
	}

}
