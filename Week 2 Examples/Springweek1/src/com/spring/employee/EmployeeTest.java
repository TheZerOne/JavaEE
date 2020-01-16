package com.spring.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.context.ApplicationContext;


public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = context.getBean("faculty",Employee.class);
		emp.printMessage();

	}

}
