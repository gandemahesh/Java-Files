package com.indus.training.java;

import java.io.IOException;

import com.indus.training.java.domain.Student;

public interface IStudent {
	public boolean insertStudent(Student studentObj) throws IOException;
	public Student retrieveStudent(int student_id) throws IOException;
	
}