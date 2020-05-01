package com.beginningJava8Fundamentals.regularExpressions;

/**
 * @author andresr
 * The regular expression to match the word apple would be \bapple\b, 
 * which means the following: a word boundary, the word apple, and a word 
 * boundary.
 */

public class MatchBoundary {

	public static void main(String[] args) {
		// Prepare regular expression. Use \\b to get \b inside the string literal.
		String regex = "\\bapple\\b";
		String replacementStr = "orange";
		String inputStr = "I have an apple and five pineapples";
		String newStr = inputStr.replaceAll(regex, replacementStr);
		
		System.out.println("Regular Expression: " + regex);
		System.out.println("Input String: " + inputStr);
		System.out.println("Replacement String: " + replacementStr);
		System.out.println("New String: " + newStr);
	}

}
