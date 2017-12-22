package com.ikubinfo.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.ikubinfo.annotation.dependencyinjection.School;

@Component
public class BPP implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("After-----------------------");
		if(arg0 instanceof School) {
			System.out.println("School Object");
			System.out.println(arg0);
		}
		
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Before----------------------");
		return arg0;
	}

}
