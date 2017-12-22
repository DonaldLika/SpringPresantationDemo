package com.ikubinfo.annotation.stereotypes;

import org.springframework.stereotype.Repository;

import com.ikubinfo.annotation.dependencyinjection.Student;

@Repository
public class NewStudentDaoImpl implements StudentDao {

	@Override
	public Student getStudentById(int id) {
		return null;
	}

}
