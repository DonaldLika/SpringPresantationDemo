package com.ikubinfo.core.xml;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlContextTest {

	private static final Logger logger = Logger.getLogger(XmlContextTest.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("configurations.xml");

		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);

		logger.info(ctx.getBean("student"));
		logger.info(ctx.getBean("exam"));

		ctx.close();
	}

}
