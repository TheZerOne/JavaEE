package com.spring.employee;

public class EmployeeManager implements Employee {
	
	Employee emp;
	
	EmployeeManager(Employee emp){
		this.emp =emp;
	}

	public void printMessage() {
		this.emp.printMessage();
		
	}

}
