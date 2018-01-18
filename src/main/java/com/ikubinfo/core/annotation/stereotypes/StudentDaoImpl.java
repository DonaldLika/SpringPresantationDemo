package com.ikubinfo.core.annotation.stereotypes;

import org.springframework.stereotype.Repository;

import com.ikubinfo.core.annotation.dependencyinjection.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public Student getStudentById(int id) {
		Student student = new Student();
		student.setName("Test");
		student.setAge(22);
		return student;
	}

}
