package com.indus.training.java.domain;

public class CalciInput {
	
	private double param1;
	private double param2;
	
	public CalciInput() {
		
	}
	
	public CalciInput(double prm1, double prm2) {
		param1 = prm1;
		param2 = prm2;
	}

	public double getParam1() {
		return param1;
	}

	public void setParam1(double prm1) {
		param1 = prm1;
	}

	public double getParam2() {
		return param2;
	}

	public void setParam2(double prm2) {
		param2 = prm2;
	}
	
	

}
