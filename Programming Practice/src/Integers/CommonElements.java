package Integers;
import java.util.*;

public class CommonElements {
	
	/*
	 * This exercise finds the common elements in two integer arrays
	 */
	
	public static void main(String[] args) {
		int[] a1 = {3, 5, 4, 1, 2, 7};
		int[] a2 = {4, 6, 3, 4, 0, 9};
		int[] common = commonElements(a1, a2);
		
		for(int i = 0; i < common.length; i++){
			System.out.println(common[i]);
		}
		
		
	}
	
	static int[] commonElements(int[] a, int[] b){
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < b.length; j++){
				if(a[i] == b[j]){
					if(tmp.indexOf(a[i]) == -1)	//avoid duplicates
						tmp.add(a[i]);
					
					break;	//if we find a match we don't care about the rest
				}
			}
		}
		
		int[] common = new int[tmp.size()];
		
		for(int i = 0; i < common.length; i++){
			common[i] = tmp.get(i);
		}
		
		return common;
	}

}
