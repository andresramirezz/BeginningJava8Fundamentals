package com.beginningJava8Fundamentals.classesAndObjects;

/**
 * @author andresr
 * A SmartDog Class That Declares Two Constructors to Initialize Instance Variables Differently
 */

public class SmartDog {
	
	private String name;
    private double price;
    
    public SmartDog() {
    	// Call another constructor with "Unknown" and 0.0 as parameters 
    	this("Unknown", 0.0);

    	System.out.println("Using SmartDog() constructor");
    }
	
    public SmartDog(String name, double price) {
		//Initialize name and price instance variables 
    	// with the name and price parameters
		this.name = name;
		this.price = price;
		
		System.out.println("Using SmartDog(String, double) constructor");
	}
	
    public void bark() {
    	
    	System.out.println(name + " is barking...");
	}
	
    public void setName(String name) { 
    	this.name = name;
	}
    
    public String getName() {
    	return this.name;
    }
    
    public void setPrice(double price) { 
    	this.price = price;
    }
    
    public double getPrice() { 
    	return this.price;
    }
    
    public void printDetails(){ 
    	System.out.print("Name: " + this.name ); 
    	
    	if (price > 0.0) {
    		System.out.println(", price: " + this.price );
    	}
    	else {
    	   	System.out.println(", price: Free" );
    	}
    }
}