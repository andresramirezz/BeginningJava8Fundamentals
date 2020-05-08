package com.beginningJava8Fundamentals.classesAndObjects;

/**
 * @author andresr
 * This code demonstrates the default initialization of fields. The DefaultInit 
 * class includes only instance variables. The class fields are initialized with 
 * the same default value as the instance fields. If you declare all fields of 
 * the DefaultInit class as static, the output will be the same.
 */

public class DefaultInit {

        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        boolean bool;
        String str;
	
	public static void main(String[] args) {
		
		// Create an object of DefaultInit class 
		DefaultInit obj = new DefaultInit();
		
		// Print the default values for all instance variables 
		System.out.println("byte is initialized to " + obj.l); 
		System.out.println("short is initialized to " + obj.s); 
		System.out.println("int is initialized to " + obj.i); 
		System.out.println("long is initialized to " + obj.l); 
		System.out.println("float is initialized to " + obj.f); 
		System.out.println("double is initialized to " + obj.d); 
		System.out.println("boolean is initialized to " + obj.bool); 
		System.out.println("String is initialized to " + obj.str);
	}
}