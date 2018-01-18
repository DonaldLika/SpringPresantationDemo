package com.ikubinfo.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ikubinfo.aop.aspect.TestClass;
import com.ikubinfo.aop.model.Employee;

@Component
public class EmployeeService {

	@Autowired
	private Employee employee;
	
	@Autowired
	private TestClass testClass;
	
	public void afishotest() {
		testClass.afisho(2,3);
	}
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}

	public TestClass getTestClass() {
		return testClass;
	}

	public void setTestClass(TestClass testClass) {
		this.testClass = testClass;
	}
}
