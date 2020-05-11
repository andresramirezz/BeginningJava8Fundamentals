package com.beginningJava8Fundamentals.classesAndObjects;

/**
 * @author andresr
 * Accessing Class Fields from Static and Non-static Methods
 */
public class MethodType {

	public static void main(String[] args) {
		
		// Create an instance of the MethodTYpe class
		MethodType mt = new MethodType();
		System.out.println("Invoking instance method...");
				
		// Invoke the instance method 
		mt.printMN();
		System.out.println("Invoking class method on class name...");
		
		// Invoke the class method using the class name
		MethodType.printM();
		
		System.out.println("Invoking class method on an instance...");
		
		// Invoke the class method using the instance reference 
		printM();
	}
		
		static int m = 100; // A static variable 
		int n = 200; 		// An instance variable
        
		// Declare a static method
        static void printM() {
        	/* We can refer to only static variable m in this method
   				because you are inside a static method */
        	
        	System.out.println("printM() - m = " + m);
        	
        	/* System.out.println("printM() - n = " + n); */ /* A compile-time error */
        }
        
        // Declare an instance method
        void printMN() {
        	/* We can refer to both static and instance variables m and n in 
        	  this method */ 
        	
        	System.out.println("printMN() - m = " + m);
        	System.out.println("printMN() - n = " + n);
        } 
}