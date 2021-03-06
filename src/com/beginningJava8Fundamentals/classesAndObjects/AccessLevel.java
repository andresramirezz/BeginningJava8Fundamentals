package com.beginningJava8Fundamentals.classesAndObjects;

/**
 * @author andresr
 * An AccessLevel Class with Class Members Having Different Access Levels
 */

public class AccessLevel {

	private int v1 = 100;
	int v2 = 200;
	protected int v3 = 300; 
	public int v4 = 400;
	
	void m2() {
		System.out.println("Inside m2():"); 
		System.out.println("v1 = "+v1+ ", v2 = "+v2+", v3 = "+v3+ ", v4 = "+v4);
	}
	
	protected void m3() {
		System.out.println("Inside m3():"); 
		System.out.println("v1 = "+v1+ ", v2 = "+v2+", v3 = "+v3+ ", v4 = "+v4);
	}
	
	public void m4() {
		System.out.println("Inside m4():"); 
		System.out.println("v1 = "+v1+ ", v2 = "+v2 +", v3 = "+v3 + ", v4 = "+v4);
	} 
}