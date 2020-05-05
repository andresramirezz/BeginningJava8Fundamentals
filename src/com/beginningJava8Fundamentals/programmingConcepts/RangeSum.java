package com.beginningJava8Fundamentals.programmingConcepts;

/**
 * @author andresr
 * File: RangeSum.java
 * Computes and returns the sum of all integers between two integers specified by
 * lowerLimit and UpperLimit parameters.
 * 
 * The lowerLimit parameter must be less than or equal to the upperLimit parameter.
 * If the sum of all integers between the lowerLimit and the upperLimit exceeds the
 * range of the int data type then result is not defined.
 */

public class RangeSum {

	/**
	 * @param lowerLimit The lower limit of the integer range
	 * @param upperLimit The upper limit of the integer range
	 * @return The sum of all integers between lowerLimit (inclusive) and
	 * 		  upperLimit (inclusive)
	 */
	
	void getRangeSum( int lowerLimit, int upperLimit) {
		
		int sum = 0;
		int counter = lowerLimit;
		
		for (int i = lowerLimit; i <= upperLimit; i++) {
			sum = sum + counter;
			counter++;
		}
		System.out.println(sum);;
	}
	
	public static void main(String[] args) {
		RangeSum rs = new RangeSum();
		rs.getRangeSum(40, 60);
	}
}