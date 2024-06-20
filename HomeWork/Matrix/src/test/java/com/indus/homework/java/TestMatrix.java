package com.indus.homework.java;

import static org.junit.Assert.assertArrayEquals;

import com.indus.homework.java.impl.Matrix;

import junit.framework.TestCase;

public class TestMatrix extends TestCase {
	
	Matrix objMatrix = null;

	protected void setUp() throws Exception {
		
		objMatrix = new Matrix();
		
		super.setUp();
	}

	protected void tearDown() throws Exception {
		
		objMatrix = null;
		
		super.tearDown();
	}
	public void testMatrixAdditionScenario1() {
		// fail("Not yet implemented"); // TODO
		// Input
		int[][] param1 = { { 3, 3 }, { 3, 3 } };

		int[][] param2 =  { { 3, 3 }, { 3, 3 } };

		// expected output
		int[][] expResult = { { 18, 18 }, { 18, 18 } };

		// actual output
		int[][] actResult = objMatrix.matrixAddition(param1, param2);

		// assertion
		assertArrayEquals(expResult, actResult);
	}
	public void testMatrixAdditionScenario2() {
		// fail("Not yet implemented"); // TODO
		// Input
		int[][] param1 = { { 2, 2 }, { 2, 2 } };

		int[][] param2 =  { { 2, 2 }, { 2, 2 } };

		// expected output
		int[][] expResult = { { 8, 8 }, { 8, 8 } };

		// actual output
		int[][] actResult = objMatrix.matrixAddition(param1, param2);

		// assertion
		assertArrayEquals(expResult, actResult);
	}
	

}
