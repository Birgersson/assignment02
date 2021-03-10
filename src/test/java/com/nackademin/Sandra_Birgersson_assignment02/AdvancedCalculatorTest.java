package com.nackademin.Sandra_Birgersson_assignment02;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator ac = new AdvancedCalculator();
	Random random = new Random(); 
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());
	
	
	@Test
	public void testSquare() {
			double tempN = 0;
			double tempResult = 0;
			
			for (int i = 0; i<10; i++) {
				tempN = random.nextDouble()*(random.nextInt(100)+1);
				tempResult = tempN*tempN;
				LOG.info("Testing square(+) with: " +tempN );
				assertEquals(ac.square(tempN),tempResult,0); 
			}
			for (int i = 0; i<10; i++) {
				tempN = random.nextDouble()*(-1)*(random.nextInt(100)+1);
				tempResult = tempN*tempN;
				LOG.info("Testing square(-) with: " +tempN );
				assertEquals(ac.square(tempN),tempResult,0); 
			}	
			 tempN = 0;
			 tempResult = 0;
			LOG.info("Testing square(0) with: " +tempN );
			assertEquals(ac.square(tempN),tempResult,0); 
	}

	@Test
	public void testRoot() {
			double tempN = 0;
			double tempResult = 0;
			
			for (int i = 0; i<10; i++) {
				tempN = random.nextDouble()*(random.nextInt(100)+1);
				tempResult = Math.sqrt(tempN);
				LOG.info("Testing square root(+) with: " +tempN );
				assertEquals(ac.root(tempN),tempResult,0); 
			}
			for (int i = 0; i<10; i++) {
				tempN = random.nextDouble()*(-1)*(random.nextInt(100)+1);
				tempResult = Math.sqrt(tempN);
				LOG.info("Testing square root(-) with: " +tempN );
				assertEquals(ac.root(tempN),tempResult,0); 
			}	
			 tempN = 0;
			 tempResult = 0;
			LOG.info("Testing square root(0) with: " +tempN );
			assertEquals(ac.root(tempN),tempResult,0); 
	}
	@Test
	public void testNegative() {
			double tempN = 0;
			double tempResult = 0;
			
			for (int i = 0; i<10; i++) {
				tempN = random.nextDouble()*(random.nextInt(100)+1);
				tempResult = Math.abs(tempN)*(-1);
				LOG.info("Testing negative(+) with: " +tempN );
				assertEquals(ac.negative(tempN),tempResult,0); 
			}
			for (int i = 0; i<10; i++) {
				tempN = random.nextDouble()*(-1)*(random.nextInt(100)+1);
				tempResult =Math.abs(tempN)*(-1);
				LOG.info("Testing negative(-) with: " +tempN );
				assertEquals(ac.negative(tempN),tempResult,0); 
			}	
			 tempN = 0;
			 tempResult = 0;
			LOG.info("Testing negative(0) with: " +tempN );
			assertEquals(ac.negative(tempN),tempResult,0); 
	}
	@Test 
	public void testMax() {
			double tempN1 = 0;
			double tempN2 = 0;
			double tempResult = 0;
			
			for (int i = 0; i<10; i++) {
				tempN1 = random.nextDouble()*(random.nextInt(100)+1);
				tempN2 = random.nextDouble()*(random.nextInt(100)+1);
				tempResult = Math.max(tempN1, tempN2);
				LOG.info("Testing max(+) with: " +tempN1 +" and " +tempN2 );
				assertEquals(ac.max(tempN1, tempN2),tempResult,0); 
			}
			for (int i = 0; i<10; i++) {
				tempN1 = random.nextDouble()*(random.nextInt(100)+1)*(-1);
				tempN2 = random.nextDouble()*(random.nextInt(100)+1);
				LOG.info("Testing max(-) with: " +tempN1 +" and " +tempN2 );
				assertEquals(ac.max(tempN1, tempN2),tempN2,0); 
			}	
			 tempN1 = 0;
			 tempN2 = 0;
			LOG.info("Testing max(0) with: "  +tempN1 +" and " +tempN2  );
			assertEquals(ac.max(tempN1,tempN2),0,0);
			 tempN1 = 0;
			 tempN2 = random.nextDouble()*(random.nextInt(100)+1);
			LOG.info("Testing max(0) with: "  +tempN1 +" and " +tempN2  );
			assertEquals(ac.max(tempN1,tempN2),tempN2,0);
	}
			
	@Test
	public void testCircleArea() {
			double r = 0;
			double tempResult = 0;
			
			for (int i = 0; i<10; i++) {
				r = random.nextDouble()*(random.nextInt(100)+1);
				tempResult = Math.PI*Math.pow(r, 2);
				LOG.info("Testing circle of area(+) with: " +r );
				assertEquals(ac.circleArea(r),tempResult,0); 
			}
			for (int i = 0; i<10; i++) {
				r = random.nextDouble()*(-1)*(random.nextInt(100)+1);
				tempResult =Math.PI*Math.pow(r, 2);
				LOG.info("Testing circle of area(-) with: " +r );
				assertEquals(ac.circleArea(r),tempResult,0); 
			}	
			 r = 0;
			 tempResult = 0;
			LOG.info("Testing circle of area(0) with: " +r );
			assertEquals(ac.circleArea(r),tempResult,0); 
	}
	
}
