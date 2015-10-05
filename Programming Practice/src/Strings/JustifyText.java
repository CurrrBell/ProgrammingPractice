package Strings;

public class JustifyText {

	/*
	 * This program takes in a string and its desired width. the beginning of the string will be left-
	 * justified, the end will be right-justified with spaces between words to space them out.
	 */
	
	public static void main(String[] args) {
		System.out.println(justify("The way the world works is kinda lame", 40));
	}
	
	static String justify(String s, int width){
		String output = "";
		int numSpaces;
		int avgSpaces;
		int leftovers;
		
		
		if(width < s.length())
			return output;
		
		String[] words = s.split(" ");
		numSpaces = words.length - 1;	//need at least this many to properly space out the words
		numSpaces += (width - s.length());	//add extra spaces
		avgSpaces = numSpaces / (words.length - 1); //base number of spaces that all words will have between them
		leftovers = numSpaces - (avgSpaces * (words.length - 1));	//stragglers
		
		for(int i = 0; i < words.length; i++){
			output += words[i];
			
			for(int j = 0; j < avgSpaces; j++){
				output += " ";
			}
			
			if(leftovers > 0){
				output += " ";
				leftovers--;
			}
		}
		
		return output;
	}
}
