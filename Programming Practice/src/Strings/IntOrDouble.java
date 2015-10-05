package Strings;

import java.util.regex.*;

public class IntOrDouble {
	/*
	 * This program returns "int" if the provided string parses as an integer, 
	 * "double" if it parses as a double,
	 * and "NaN" if it does not parse into a number at all.
	 */
	
	public static void main(String[] args) {
		System.out.println(intOrDouble("poop"));
		System.out.println(intOrDouble("39"));
		System.out.println(intOrDouble("39.0"));
		System.out.println(intOrDouble("39.0.0"));
	}
	
	static String intOrDouble(String s){
		Pattern number = Pattern.compile("[0-9]*.?[0-9]*");
		Pattern integer = Pattern.compile("[0-9]+");
		Matcher m1 = number.matcher(s);
		Matcher m2 = integer.matcher(s);
		
		if(!m1.matches())
			return "NaN";
		
		else if(m2.matches())
			return "int";
		
		else
			return "double";
	}
}
