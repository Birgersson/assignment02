package com.nackademin.Sandra_Birgersson_assignment02;

public class BasicCalculator implements BasicOperations {

	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}	
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}	
	public double division(double firstNumber, double secondNumber) {
		
		if (Double.isInfinite(firstNumber/secondNumber)) {
			System.out.println("Division by 0");
			return 0;
		}
		else {
			return firstNumber / secondNumber;
	}	//Gör felhantering för division by 0. 
	}
}
	
