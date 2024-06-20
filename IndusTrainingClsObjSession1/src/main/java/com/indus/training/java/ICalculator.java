package com.indus.training.java;

import com.indus.training.java.domain.CalciInput;
import com.indus.training.java.domain.CalciOutput;

public interface ICalculator {
	
	public CalciOutput addition(CalciInput calIn);
	
	public CalciOutput subtraction(CalciInput calIn);
	
	public CalciOutput multiplication(CalciInput calIn);
	
	public CalciOutput division(CalciInput CalIn);

}
