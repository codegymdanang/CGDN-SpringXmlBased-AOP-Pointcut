package com.hvcntt.sprintpointcut.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hvcntt.sprintpointcut.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		//Aspect Before
		//employeeService.getEmployee().getName();
		
		
		
	}

}
