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
		
		if (secondNumber==0) {
			System.out.println("Division by 0");
			return Double.MAX_VALUE; //returning closes to infinity.... User should understand something is wrong here. 
		}
		else {
			return firstNumber / secondNumber;
	}	
	}
}
	
