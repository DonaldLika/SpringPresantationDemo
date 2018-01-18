package com.ikubinfo.aop.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {
	
	
	@Around("test1()")
	public void testtest(ProceedingJoinPoint jp) {
		
		try {
			
			Arrays.asList(jp.getArgs()).forEach(System.out::println);
			System.out.println("Before TestClass");

			jp.proceed();
			System.out.println("After TestClass");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Pointcut("execution(* com.ikubinfo.aop.aspect.TestClass.afisho(int,int)) and !bean('employeeService') and args(i,j)")
	public void test1() {
				
	}
	
}
