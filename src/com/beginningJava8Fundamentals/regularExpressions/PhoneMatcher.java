package com.beginningJava8Fundamentals.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author andresr
 * This code illustrates the use of groups in regular expressions to get the 
 * area code part of phone numbers. Note that 2339829 does not match the 
 * pattern because it has only 7 digits.
 */
public class PhoneMatcher {

	public static void main(String[] args) {
		//Prepare a regular expression: A group of 3 digits followed by 7 digits
		String regex = "\\b(\\d{3})\\d{7}\\b";
		
		//Compile the regular expression
		Pattern p = Pattern.compile(regex);
		
		String source = "3342449027, 2339828, and 6152534734";
		
		//Get the Matcher object
		Matcher m = p.matcher(source);
		
		//Start matching and display the found area codes
		while ( m.find() ) {
			String phone = m.group();
			String areaCode = m.group(1);
			System.out.println("Phone: " + phone + ", Area code: " + areaCode);
		}
	}
}