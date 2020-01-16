package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	Faculty faculty;
	
	@Autowired
	public Employee(Faculty faculty) {
		this.faculty = faculty;
	}

}
