package com.indus.taining.java.impl;

import java.io.FileInputStream;
import java.util.Properties;

public class IOCStudent {
	public Object getInstance(String clsprop) {
		Object returnObject = null;
		
		try {
			Properties studentProps = new Properties();
			studentProps.load(new FileInputStream(new File("/Users/maheshgande/Desktop/IndusTraining/Indus.Training.IOCObjectCoversion/StudentResources.txt")));
			returnObject = class.forName(studentProps.getProperty(clsprop)).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
			
					
		
		return returnObject;
		
		
		
	}

}