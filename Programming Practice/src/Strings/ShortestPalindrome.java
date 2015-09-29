package Strings;

import java.util.ArrayList;

public class ShortestPalindrome {
	/*
	 * This program finds all the palindromes within a string and prints the shortest one.
	 */
	public static void main(String[] args) {
		System.out.println(findShortestPalindrome("myracecarisdank"));
	}
	
	static String findShortestPalindrome(String s){
		ArrayList<String> palindromes = new ArrayList<String>();
		String shortest = s;
		char[] characters = s.toCharArray();
		
		for(int i = 0; i < characters.length; i++){
			for(int j = i + 3; j < characters.length; j++){
				String sequence = "";
				sequence += characters[i];
				
				for(int k = 1; k < j - i; k++){
					sequence += characters[i+k];
				}
				
				if(isPalindrome(sequence))
					palindromes.add(sequence);
			}
		}
		for(int i = 0; i < palindromes.size(); i++){
			if(palindromes.get(i).length() < shortest.length())
				shortest = palindromes.get(i);
		}
		
		return shortest;
	}
	
	static boolean isPalindrome(String s){	//helper function for findShortestPalindrome()
		char[] characters = s.toCharArray();
		int counter = 0;
		int j = characters.length -1;
		
		for(int i = 0; i < (characters.length/2); i++){
			if(characters[i] != characters[j-counter])
				return false;
			
			counter++;
		}
		
		return true;
	}
}
