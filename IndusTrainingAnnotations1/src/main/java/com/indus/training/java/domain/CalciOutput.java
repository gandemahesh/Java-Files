package com.indus.training.java.domain;

public class CalciOutput {

	private double param1;
	private double param2;
	private double result;
	private String operation;

	public CalciOutput() {

	}

	public CalciOutput(double prm1, double prm2, double rslt, String opr) {
		
		param1 = prm1;
		param2 = prm2;
		result = rslt;
		operation = opr;

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
		this.param2 = prm2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double rslt) {
		this.result = rslt;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String opr) {
		this.operation = opr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		long temp;
		temp = Double.doubleToLongBits(param1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(param2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(this.result);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalciOutput other = (CalciOutput) obj;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		if (Double.doubleToLongBits(param1) != Double.doubleToLongBits(other.param1))
			return false;
		if (Double.doubleToLongBits(param2) != Double.doubleToLongBits(other.param2))
			return false;
		if (Double.doubleToLongBits(result) != Double.doubleToLongBits(other.result))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CalciOutput [param1=" + param1 + ", param2=" + param2 + ", result=" + result + ", operation="
				+ operation + "]";
	}
	

}	
