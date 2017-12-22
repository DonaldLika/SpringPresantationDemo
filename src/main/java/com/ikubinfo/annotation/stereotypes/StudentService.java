package com.ikubinfo.annotation.stereotypes;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ikubinfo.annotation.dependencyinjection.Exam;
import com.ikubinfo.annotation.dependencyinjection.Student;

@Service
public class StudentService {

	/*
	 * Match by Qualifier
	 */
	@Qualifier("studentDaoImpl")
	@Resource()
	private StudentDao studentDao;

	/*
	 * Match by Name
	 */
	@Autowired
	private StudentDao newStudentDaoImpl;

	@Inject
	private Exam exam;

	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

}
