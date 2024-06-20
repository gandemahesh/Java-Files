package com.indus.training.java;
import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.java.domain.CalciInput;
import com.indus.training.java.domain.CalciOutput;
import com.indus.training.java.impl.Calculator;

public class TestCalculator extends TestCase {

	private Calculator calObj;
	
	protected void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("Calculator.xml");
		
		calObj = context.getBean("Calculator", Calculator.class);
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAdditionScenario1() {

		// inputs
		CalciInput calIn = new CalciInput(10.0, 20.0);

		// expected result
		CalciOutput expCalOut = new CalciOutput(10.0, 20.0, 30.0, "Addition");

		// actual result
		CalciOutput actCalOut = calObj.addition(calIn);

		// assertions
		assertEquals(expCalOut, actCalOut);
	}

	public void testSubtractionScenario1() {

		// inputs
		CalciInput calIn = new CalciInput(10.0, 20.0);

		// expected result
		CalciOutput expCalOut = new CalciOutput(10.0, 20.0, -10.0, "Subtraction");

		// actual result
		CalciOutput actCalOut = calObj.subtraction(calIn);

		// assertions
		assertEquals(expCalOut, actCalOut);
	}
}