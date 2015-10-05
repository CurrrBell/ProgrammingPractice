package Strings;

import java.util.ArrayList;

public class StringPermutations {

	public static void main(String[] args) {

	}
	
	static String[] findPermutations(String[] s){		
		if(s.length == 1)
			return s;
		
		ArrayList<String> tmp = new ArrayList<String>();
		String[] permutations;
		
		
		permutations = new String[tmp.size()];
		
		for(int i = 0; i < permutations.length; i++){
			permutations[i] = tmp.get(i);
		}
		
		return permutations;
	}
}
