package com.hvcntt.sprintpointcut.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspectBefore {

	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
	}
	
	@Before("execution(* com.hvcntt.sprintpointcut.service.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
	}
}
