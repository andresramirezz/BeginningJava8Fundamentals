package com.beginningJava8Fundamentals.classesAndObjects;

/**
 * @author andresr
 * A Dog Class with Two Constructors, One with No Parameter and One with a String Parameter
 */

public class Dog {
	
	// Constructor #1
	public Dog() {
		System.out.println("A dog is created.");
	}
	
	// Constructor #2
	public Dog(String name) {
		System.out.println("A dog named " + name + " is created.");
	}
}