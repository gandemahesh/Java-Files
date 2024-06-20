package com.indus.training.java;

import java.io.IOException;
import java.util.Scanner;

import com.indus.training.java.domain.Student;
import com.indus.training.java.json.impl.StudentDAOJson;

import junit.framework.TestCase;

public class TestStudentDAOUI extends TestCase {

	private IStudent studentObj;

	protected void setUp() throws Exception {
		studentObj = new StudentDAOJson();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		studentObj = null;
		super.tearDown();
	}

	public void testUI() throws Exception {
		int id;
		String firstName;
		String lastName;

		Scanner scanner = new Scanner(System.in);
		int in = 0;
		while (in != 4) {
			System.out.println("Please enter the required option");
			System.out.println("1. Json");
			System.out.println("2. Csv");
			System.out.println("3. Pipeline");
			System.out.println("4. exit");
			in = Integer.parseInt(scanner.nextLine());
		    if (in == 4) {
			System.out.println("Exit option selected");
			break;
		    }
			System.out.println("Enter the id");
			id = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter firstName");
			firstName = scanner.nextLine();
			System.out.println("Enter lastName");
			lastName = scanner.nextLine();
			if (in == 1) {
				// Scenario for option 1 (Json)
				//input
				Student insertStudent = new Student(id,firstName,lastName);
				//expected output
				boolean expectedStudent= true;
				//actual output
				boolean actualStudent = false;
				try {
					actualStudent = studentObj.insertStudent(insertStudent);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//assertion
				assertEquals(expectedStudent, actualStudent);
//				System.out.println("Check");
				// Perform the desired operations for Json
				
				//expected output
				Student expectedStudent1 = new Student(id, firstName, lastName);
				//actual output
			    Student actualStudent1=null;
				actualStudent1 = studentObj.retrieveStudent(id);
				
				//assertion
				assertEquals(expectedStudent1, actualStudent1);
				
			} else if (in == 2) {
				// Scenario for option 2 (Csv)
				// input
				Student insertStudent = new Student(id, firstName, lastName);
				// expected output
				boolean expectedStudent = true;
				// actual output
				boolean actualStudent = false;
				try {
					actualStudent = studentObj.insertStudent(insertStudent);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					// assertion
					assertEquals(expectedStudent, actualStudent);
				}
				// Perform the desired operations for Csv
				
				// expected output
				Student expectedStudent2 = new Student(id, firstName, lastName);
				// actual output
				Student actualStudent2 = null;
				try {
					actualStudent2 = studentObj.retrieveStudent(id);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// assertion
				assertEquals(expectedStudent2, actualStudent2);
				
			} else if (in == 3) {
				// Scenario for option 3 (Pipeline)
				//input
				Student insertStudent = new Student(id,firstName,lastName);
				//expected output
				boolean expectedStudent= true;
				//actual output
				boolean actualStudent = false;
				try {
					actualStudent = studentObj.insertStudent(insertStudent);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//assertion
				assertEquals(expectedStudent, actualStudent);
			}
				// Perform the desired operations for Pipeline
			//expected output
			Student expectedStudent = new Student(id, firstName, lastName);
			//actual output
			Student actualStudent = null;
			try {
				actualStudent = studentObj.retrieveStudent(id);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//assertion
			assertEquals(expectedStudent, actualStudent);
		}
		scanner.close();

		}

	}