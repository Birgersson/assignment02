package com.nackademin.Sandra_Birgersson_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bc = new BasicCalculator();
	Random random = new Random(); 
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());
	
	//Happytesting
	@Test
	public void testAddition() {
		double tempN1 = 0;
		double tempN2 = 0;
		double tempResult = 0;
		
		for (int i = 0; i<10; i++) {
			tempN1 = random.nextDouble();
			tempN2 = random.nextDouble();
			tempResult = tempN1 + tempN2; 
			LOG.info("Testing addition with: " +tempN1 +" and: " +tempN2);
			assertEquals(bc.addition(tempN1, tempN2),tempResult,0); 
		}	
	}
	@Test
	public void testSubtraction() {
		double tempN1 = 0;
		double tempN2 = 0;
		double tempResult = 0;
		
		for (int i = 0; i<10; i++) {
			tempN1 = random.nextDouble();
			tempN2 = random.nextDouble();
			tempResult = tempN1 - tempN2; 
			LOG.info("Testing subtraction with: " +tempN1 +" and: " +tempN2);
			assertEquals(bc.subtraction(tempN1, tempN2),tempResult,0); 
		}	
	}
	@Test
	public void testMultiplication() {
		double tempN1 = 0;
		double tempN2 = 0;
		double tempResult = 0;
		
		for (int i = 0; i<10; i++) {
			tempN1 = random.nextDouble();
			tempN2 = random.nextDouble();
			tempResult = tempN1 * tempN2; 
			LOG.info("Testing multiplication with: " +tempN1 +" and: " +tempN2);
			assertEquals(bc.multiplication(tempN1, tempN2),tempResult,0); 
		}	
	}
	@Test
	public void testDivision() {
		double tempN1 = 0;
		double tempN2 = 0;
		double tempResult = 0;
		
		for (int i = 0; i<10; i++) {
			tempN1 = random.nextDouble();
			tempN2 = random.nextDouble();
			tempResult = tempN1 / tempN2; 
			LOG.info("Testing division with: " +tempN1 +" and: " +tempN2);
			assertEquals(bc.division(tempN1, tempN2),tempResult,0); 
		}		
	}
	
	//Wrong input testing
	//int, float, string 

}
