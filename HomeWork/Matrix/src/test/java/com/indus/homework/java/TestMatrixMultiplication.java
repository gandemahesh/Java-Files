package com.indus.homework.java;

import static org.junit.Assert.assertArrayEquals;

import com.indus.homework.java.impl.Matrix;

import junit.framework.TestCase;

public class TestMatrixMultiplication extends TestCase {
	Matrix objMatrix = null;

	protected void setUp() throws Exception {

		objMatrix = new Matrix();

		super.setUp();
	}

	protected void tearDown() throws Exception {

		objMatrix = null;

		super.tearDown();
	}

	public void testMatrixMultiplicationSenario1() {
		// Input
		int[][] param1 = { { 3, 4, 5 }, { 1, 3, 5 }, { 2, 4, 6 } };
		int[][] param2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		// expected output
		int[][] expResult = { {} };

		// actual output
		int[][] actResult = objMatrix.matrixMultiplication(param1, param2);

		// assertion
		assertArrayEquals(expResult, actResult);
	}

}
