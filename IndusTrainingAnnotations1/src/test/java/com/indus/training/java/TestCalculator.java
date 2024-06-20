package com.indus.training.java;


import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.indus.training.java.domain.CalciInput;
import com.indus.training.java.domain.CalciOutput;
import junit.framework.TestCase;

@SpringBootTest
public class TestCalculator extends TestCase {

	@Autowired
	private ICalculator calObj;

//	protected void setUp() throws Exception {
//		calObj = new Calculator();
//	}
//
//	protected void tearDown() throws Exception {
//		calObj = null;
//	}

	@Test
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

	@Test
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