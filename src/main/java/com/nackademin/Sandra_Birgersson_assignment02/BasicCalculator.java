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
		return firstNumber / secondNumber;
	}	//Gör felhantering för division by 0. 
	//gör ev att alla return result: double... 

}
