package com.ikubinfo.aop.aspect;
import org.springframework.stereotype.Component;

@Component
public class TestClass {

	public void afisho(int i,int j) {
		System.out.println(i+"testimi"+j);
	}
	
}
