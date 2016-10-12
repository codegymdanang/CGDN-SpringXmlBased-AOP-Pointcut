package com.hvcntt.sprintpointcut.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.hvcntt.sprintpointcut.aspects.Loggable)")
	public void myAdvice(){
		System.out.println("Annotation !!!!! Executing myAdvice!!");
	}
}
