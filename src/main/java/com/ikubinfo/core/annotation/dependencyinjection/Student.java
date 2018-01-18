package com.ikubinfo.core.annotation.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name;

	private String surname;

	private int age;

	private School school;

	//Field Injection
	@Autowired
	private Exam exam;

	
	//Constructor Injection
	@Autowired
	public Student(School school) {
		this.school = school;
	}
	
	//Setter Injection
	@Autowired
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Exam getExam() {
		return exam;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

}
