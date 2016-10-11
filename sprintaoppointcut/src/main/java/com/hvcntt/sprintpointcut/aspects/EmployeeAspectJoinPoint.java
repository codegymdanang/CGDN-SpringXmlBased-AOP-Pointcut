package com.hvcntt.sprintpointcut.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 Aspect classes are required to have @Aspect annotation.
@Before annotation is used to create Before advice
The string parameter passed in the @Before annotation is the Pointcut expression
getNameAdvice() advice will execute for any Spring Bean method with signature public String getName(). 
This is a very important point to remember, if we will create Employee bean using new operator the advices will not be applied. 
Only when we will use ApplicationContext to get the bean, advices will be applied.
We can use asterisk (*) as wild card in Pointcut expressions, 
getAllAdvice() will be applied for all the classes in 
com.journaldev.spring.service package whose name starts with get and doesn’t take any arguments. 
 */

@Aspect
public class EmployeeAspectJoinPoint {

	@Before("execution(public void com.hvcntt.sprintpointcut.model ..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint){
		System.out.println("Before running loggingAdvice on method="+joinPoint.toString());
		
		System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));

	}
	
	//Advice arguments, will be applied to bean methods with single String argument
	@Before("args(name)")
	public void logStringArguments(String name){
		System.out.println("String argument passed="+name);
	}
}
