package com.indus.training.java.csv.impl;

import java.io.FileReader;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

import com.indus.training.java.IStudent;
import com.indus.training.java.domain.Student;

public class StudentDAO implements IStudent {



	public boolean insertStudent(Student studentObj) throws IOException {
		// TODO Auto-generated method stub

		FileWriter outputStream = new FileWriter("Student" + studentObj.getId() + ".txt");
		try {

			int Id = studentObj.getId();
			String firstName = studentObj.getFirstName();
			String lastName = studentObj.getLastName();
			String CSVformat1 = "Id,firstName,lastName";
			String CSVformat2 = "1,Mahesh,Gande";
			outputStream.write(CSVformat1);
			outputStream.write(CSVformat2);

		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return true;

	}

	public Student retrieveStudent(int student_id)
			throws IOException {
		
		Student student = Student.getInstance("studentCls");
		BufferedReader reader = null;
		FileReader inputStream = new FileReader("Student" + student_id + ".txt");
		try {
			String fileStream = "";

			reader = new BufferedReader(inputStream);
			while ((fileStream = reader.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(fileStream, "{}:,");

				while (token.hasMoreTokens()) {
					StringTokenizer currToken = new StringTokenizer(token.nextToken().trim(), "\"");

					while (currToken.hasMoreTokens()) {
						String key = currToken.nextToken().trim();
						if (key.equals("id")) {
							String id1 = token.nextToken().replaceAll("\"", "");
							student.setId(Integer.parseInt(id1));
						} else if (key.equals("name")) {
							student.setFirstName(token.nextToken().replaceAll("\"", ""));
						} else if (key.equals("address")) {
							student.setLastName(token.nextToken().replaceAll("\"", ""));
						}
					}
				}

			}

		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return student;
	}


	
	public List<Student> retrieveAllStudents() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
