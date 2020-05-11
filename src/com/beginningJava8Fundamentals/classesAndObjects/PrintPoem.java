package com.beginningJava8Fundamentals.classesAndObjects;

/**
 * @author andresr
 * This code add a parameter to the printPoem method to allow the caller to pass 
 * the stanza number that it wants to print.
 */
public class PrintPoem {

	public static void main(String[] args) {
		printPoem(1);
		printPoem(2);
		printPoem(5);
	}
	
	static void printPoem(int stanzaNumber) {
        
		if (stanzaNumber < 1 || stanzaNumber > 2) {
        		System.out.println("Cannot print stanza #" + stanzaNumber); 
        		return; // End the method call
        }
        if (stanzaNumber == 1) {
        		System.out.println("Strange fits of passion have I known:"); 
        		System.out.println("And I will dare to tell,"); 
        		System.out.println("But in the lover's ear alone,"); 
        		System.out.println("What once to me befell.");
        }
        else if (stanzaNumber == 2) {
        		System.out.println("When she I loved looked every day"); 
        		System.out.println("Fresh as a rose in June,"); 
        		System.out.println("I to her cottage bent my way,"); 
        		System.out.println("Beneath an evening-moon.");
        }
	}
}