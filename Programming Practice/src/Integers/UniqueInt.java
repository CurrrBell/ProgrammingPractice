package Integers;
import java.util.*;

public class UniqueInt {
	/*
	 * This exercise returns the integers in a given array that occur exactly once.
	 */
	
	public static void main(String[] args){
		Random rand = new Random();
		int[] test = new int[100];
		
		for(int i = 0; i < test.length; i++){
			test[i] = rand.nextInt(50);
		}
		
		System.out.println(findUniques(test).length);
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
		
		return uniques;
	}
}
