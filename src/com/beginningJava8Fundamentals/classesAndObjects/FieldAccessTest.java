package com.beginningJava8Fundamentals.classesAndObjects;

/**
 * @author andresr
 * A Test Class to Demonstrate How to Access (Read/Write) Class Variables and 
 * Instance Variables of a Class
 */

class FieldAccessTest {

	String name = null;
	String gender = null;
	static long count = 0;
	
	public static void main(String[] args) {
		// Create an instance of Human class 
		FieldAccessTest jack = new FieldAccessTest();
		
		// Increase count by one
		FieldAccessTest.count++;
		
		// Assign values to name and gender
		jack.name = "Jack Parker"; 
		jack.gender = "Male";
		
		// Read and print the values of name, gender and count 
		String jackName = jack.name;
		String jackGender = jack.gender;
		long population = FieldAccessTest.count;
		
		System.out.println("Name: " + jackName); 
		System.out.println("Gender: " + jackGender); 
		System.out.println("Population: " + population);
		
		// Change the name
		jack.name = "Jackie Parker";
		
		// Read and print the changed name
		String changedName = jack.name; 
		System.out.println("Changed Name: " + changedName);
	}
}