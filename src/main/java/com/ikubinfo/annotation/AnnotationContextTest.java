package com.ikubinfo.annotation;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ikubinfo.annotation.configuration.JavaConfiguration;
import com.ikubinfo.annotation.stereotypes.StudentService;

public class AnnotationContextTest {

	private static final Logger logger = Logger.getLogger(AnnotationContextTest.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);

		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(logger::info);

		logger.info(ctx.getBean("database"));

		/*StudentService studentService = ctx.getBean("studentService", StudentService.class);
		logger.info(studentService.getStudentById(22));
*/
		ctx.close();
	}

}
