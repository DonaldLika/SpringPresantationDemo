package com.ikubinfo.aop.model;

import org.springframework.stereotype.Component;
import com.ikubinfo.aop.aspect.Loggable;

@Component
public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String nm) {
		this.name = nm;
	}

	public void throwException() {
		throw new RuntimeException("Dummy Exception");
	}

}
