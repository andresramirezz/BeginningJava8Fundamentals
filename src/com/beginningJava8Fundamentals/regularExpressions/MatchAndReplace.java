package com.beginningJava8Fundamentals.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author andresr
 * This code illustrates the technique of referencing groups in a replacement 
 * text. The replacement text to replace the phone numbers with the formatted 
 * phone numbers will be ($1) $2-$3.
 */
public class MatchAndReplace {

	public static void main(String[] args) {
		// Prepare the regular expression
		String regex = "\\b(\\d{3})(\\d{3})(\\d{4})\\b";
		String replacementText = "($1) $2-$3";
		String source = "3342449027, 2339829, and 6152534734";
		
		//Compile the regular expression
		Pattern p = Pattern.compile(regex);
		
		//Get Matcher object
		Matcher m = p.matcher(source);
		
		//Replace the phone numbers by formatted phone numbers
		String formattedSource = m.replaceAll(replacementText);
		
		System.out.println("Text: " + source);
		System.out.println("Formatted Text: " + formattedSource);
	}
}