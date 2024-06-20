package com.indus.homework.java.impl;

import com.indus.homework.java.InterfaceMatrix;

public class Matrix implements InterfaceMatrix {

	@Override
	public int[][] matrixAddition(int[][] param1, int[][] param2) {
		int[][] resultMatrix = { { 0 }, { 0 } };
		{
			int m = param1.length;
			int n = param2[0].length;
			resultMatrix = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < param2.length; k++) {
						resultMatrix[i][j] += param1[i][k] * param2[k][j];
					}
				}
			}
		}
		return resultMatrix;
	}

	@Override
	public int[][] matrixMultiplication(int[][] param1, int[][] param2) {
		// multiplying and printing multiplication of 2 matrices
		int[][] resultMatrix = { { 0 }, { 0 } };
		{
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						resultMatrix[i][j] += param1[i][k] * param2[k][j];
					} // end of k loop
				}
			}
			return resultMatrix;
		}

	}
}
