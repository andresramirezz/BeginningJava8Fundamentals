package com.beginningJava8Fundamentals.classesAndObjects;

/**
 * @author andresr
 * Using the this Keyword to Refer to an Instance Variable Whose Name Is 
 * Hidden by a Local Variable
 */
public class ThisTest {

	int num = 1982; // An instance variable
	
	void printNum(int numParam) {
		System.out.println("Parameter num: " + numParam); 
		System.out.println("Instance variable num: " + this.num);
	}
	
	public static void main(String[] args) { 
		ThisTest tt = new ThisTest();
		tt.printNum(1969);
	}
}