package Integers;

public class RotatedArrays {

	/*
	 * This exercise aims to determine whether or not two arrays of integers are rotated versions
	 * of each other, i.e. A = {1, 2, 3, 4, 5, 6} and B = {4, 5, 6, 1, 2, 3}
	 */
	public static void main(String[] args) {
		
		int[] a = {1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 1, 9, 1, 10};
		int[] b = {4, 1, 5, 1, 6, 1, 7, 1, 8, 1, 9, 1, 10, 1, 2, 1, 3, 1};
		
		System.out.println(isRotated(a, b));
	}
	
	static boolean isRotated(int[] a, int[] b){
		if(a.length != b.length)
			return false;
		
		int start = a[0]; //this value will be used to find where in b a rotation may start
		
		
		for(int i = 0; i < b.length; i++){
			if(b[i] == start){	//now we must see if the sequence follows
				int aOffset = 1;
				int bOffset = i + 1;
				int matches = 1;
				
				while(matches < a.length){
					if(a[aOffset] != b[bOffset])
						break;
					
					if(aOffset == a.length-1)	//in case we need to loop around the end of the array
						aOffset = -1;
					
					if(bOffset == b.length-1)
						bOffset = -1;
					
					matches++;
					aOffset++;
					bOffset++;
				}
				
				if(matches == a.length)
					return true;
			}
		}
		
		return false;
	}
}
