package com.nackademin.Sandra_Birgersson_assignment02;

public class Main {

	public static void main(String[] args) {
			
		BasicCalculator bC = new BasicCalculator();
		System.out.println("Addition gives result: "+bC.addition(2, 2));
		System.out.println("Subtraction gives result: "+bC.subtraction(2, 2));
		System.out.println("Multiplication gives result: "+bC.multiplication(2, 2));
		System.out.println("Division gives result: "+bC.division(2, 2));


		AdvancedCalculator aC = new AdvancedCalculator(); 
		System.out.println("Square gives result: "+aC.square(123456));
		System.out.println("Root gives result: "+aC.root(123456));
		System.out.println("Negative gives result: "+aC.negative(123456));
		System.out.println("Max gives result: "+aC.max(123456, 23456));
		System.out.println("CircleArea gives result: "+aC.circleArea(56));
	//	System.out.println("Addition gives result: "+aC.addition(2, 2));
	//Why not access the basicCalulator like this? Good or bad practice? 
	}

}
