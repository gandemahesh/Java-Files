package com.indus.training.java.impl;

import com.indus.training.java.ICalculator;
import com.indus.training.java.domain.CalciInput;
import com.indus.training.java.domain.CalciOutput;

public class Calculator implements ICalculator {

	public CalciOutput addition(CalciInput calIn) {

		CalciOutput calOutObj = new CalciOutput();
		{
			calOutObj.setParam1(calIn.getParam1());
			calOutObj.setParam2(calIn.getParam2());
			calOutObj.setResult(calIn.getParam1() + calIn.getParam2());
			calOutObj.setOperation("Addition");
		}
		return calOutObj;
	}

	public CalciOutput subtraction(CalciInput calIn) {

		CalciOutput calOutObj = new CalciOutput();
		{
			calOutObj.setParam1(calIn.getParam1());
			calOutObj.setParam2(calIn.getParam2());
			calOutObj.setResult(calIn.getParam1() - calIn.getParam2());
			calOutObj.setOperation("Subtraction");
		}
		return calOutObj;
	}

	public CalciOutput multiplication(CalciInput calIn) {

		CalciOutput calOutObj = new CalciOutput();
		{
			calOutObj.setParam1(calIn.getParam1());
			calOutObj.setParam2(calIn.getParam2());
			calOutObj.setResult(calIn.getParam1() * calIn.getParam2());
			calOutObj.setOperation("Mutiplication");
		}
		return calOutObj;

	}

	public CalciOutput division(CalciInput calIn) {

		CalciOutput calOutObj = new CalciOutput();
		{
			calOutObj.setParam1(calIn.getParam1());
			calOutObj.setParam2(calIn.getParam2());
			calOutObj.setResult(calIn.getParam1() / calIn.getParam2());
			calOutObj.setOperation("Division");
		}
		return calOutObj;
	}
}
