package Strings;

public class firstNonRepeated {

	public static void main(String[] args) {
		String test = "coconut";
		System.out.println(findFirstUnique(test));
	}
	
	static char findFirstUnique(String s){
		char unique = '\n';
		
		char[] sa = s.toCharArray();
		
		for(int i = 0; i < sa.length; i++){
			boolean isUnique = true;
			for(int j = 0; j < sa.length; j++){
				if(i == j){
					
				}
					
				else if(sa[i] == sa[j]){
					isUnique = false;
					break;
				}						
			}
			if(isUnique)
				return sa[i];
		}
		
		return unique;
	}
}
