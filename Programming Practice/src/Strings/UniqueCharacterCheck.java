package Strings;

public class UniqueCharacterCheck {
	/*
	 * This program checks a string to see if there are any repeating characters
	 */
	public static void main(String[] args) {
		String s = "derp";
		String t = "derpd";
		
		System.out.println(uniqueCharsCheck(s));
		System.out.println(uniqueCharsCheck(t));
	}
	
	static boolean uniqueCharsCheck(String s){
		char[] characters = s.toCharArray();
		
		for(int i = 0; i < characters.length; i++){
			for(int j = i + 1; j < characters.length; j++){
				if(characters[i] == characters[j])
					return false;
			}
		}
		
		return true;
	}
}
