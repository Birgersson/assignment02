package com.nackademin.Sandra_Birgersson_assignment02;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	public double square(double number) {
		return number * number;
	}
	public double root(double number) {
		return Math.sqrt(number);
	}
	public double negative(double number) {
		return Math.abs(number)*-1;
	}
	public double max(double firstNumber, double secondNumber) {
		return Math.max(firstNumber, secondNumber);
	}
	public double circleArea(double radius) {
		return Math.PI*Math.pow(radius, 2);
	}
}
