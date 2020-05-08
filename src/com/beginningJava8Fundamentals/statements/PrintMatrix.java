package com.beginningJava8Fundamentals.statements;

/**
 * @author andresr
 * Suppose you want to print a 3x3 (read as three by three) matrix.
 */
public class PrintMatrix {

	public static void main(String[] args) {
		
		//Outer for-loop statement
		for (int i = 1; i < 4; i++) {
			//Inner for-loop statement
			for (int j = 1; j < 4; j++) {
				System.out.print( i + "" + j );
				
				//Prints a tab after each column value, except for the last number 
				//in a row
				if( j < 3 ) {
					System.out.print( "\t" );
				}
			}
			//Prints a new line, except after the last line
			if( i < 3 ) {
				System.out.println();
			}
		}
	}
}