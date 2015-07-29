package Integers;
import java.util.*;

public class UniqueInt {
	/*
	 * This exercise returns the integers in a given array that occur exactly once.
	 */
	
	public static void main(String[] args){
		int[] test = {3, 2, 5, 6, 4, 5, 4, 2, 1, 1};
		int[] uniques = findUniques(test);
		
		for(int i = 0; i < uniques.length; i++){
			System.out.println(uniques[i]);
		}
	}
	
	static int[] findUniques(int[] a){
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++){
			boolean unique = true;
			
			for(int j = 0; j < a.length; j++){
				if(a[i] == a[j] && i != j){
					unique = false;
					break;					
				}
			}
			
			if(unique)
				tmp.add(a[i]);
		}
		
		int[] uniques = new int[tmp.size()];
		
		for(int i = 0; i < uniques.length; i++){
			uniques[i] = tmp.get(i);
		}
		
		return uniques;
	}
}
