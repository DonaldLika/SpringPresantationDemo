package com.ikubinfo.aop;

import java.util.Arrays;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikubinfo.aop.model.Employee;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AopMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("configurations.xml");

		Arrays.asList(ctx.getBeanDefinitionNames()).forEach(System.out::println); 

		Employee employee = ctx.getBean("employee", Employee.class);

		//INFO
		// You can do any tests' with aspect provided

		System.out.println(employee.getName());

		ctx.close();

	}

}
