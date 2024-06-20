package com.indus.training.java.json.impl;

import java.io.FileReader;


import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

import com.indus.training.java.IStudent;
import com.indus.training.java.domain.Student;

public class StudentDAOJson implements IStudent {

	public boolean insertStudent(Student studentObj) throws IOException {
	    FileWriter fileWriter = new FileWriter("Student" + studentObj.getId() + ".txt");
	    BufferedWriter writer = new BufferedWriter(fileWriter);

	    try {
	        int id = studentObj.getId();
	        String firstName = studentObj.getFirstName();
	        String lastName = studentObj.getLastName();
	        String jsonFormat = "{\"Id\":" + id + ",\"firstName\":\"" + firstName + "\",\"lastName\":\"" + lastName + "\"}";
	        writer.write(jsonFormat);
	    } finally {
	        if (writer != null) {
	            writer.close();
	        }
	    }

	    return true;
	}

	public Student retrieveStudent(int student_id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
}
	public void connectToAndQueryDatabase(String root, String Avyaanvihaan@99) {

	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", root, Avyaanvihaan@99);

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM Table1");

	    while (rs.next()) {
	        int x = rs.getInt("a");
	        String s = rs.getString("b");
	        float f = rs.getFloat("c");
	    }
	}