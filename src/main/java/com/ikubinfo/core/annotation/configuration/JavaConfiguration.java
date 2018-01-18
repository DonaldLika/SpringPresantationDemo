package com.ikubinfo.core.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ikubinfo.core.annotation.dependencyinjection.Exam;
import com.ikubinfo.core.annotation.dependencyinjection.School;
import com.ikubinfo.core.annotation.dependencyinjection.Student;

@ComponentScan(basePackages = "com.ikubinfo.annotation")
@Configuration
public class JavaConfiguration {

	@Bean
	public School school() {
		return new School();
	}

/*	@Bean
	public Student student() {
		Student student = new Student(school());
		student.setExam(exam());
		return student;
	}*/

	@Bean
	public Exam exam() {
		return new Exam();
	}

}
