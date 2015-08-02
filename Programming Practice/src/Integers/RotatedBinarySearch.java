package Integers;

public class RotatedBinarySearch {
	
	/*
	 * This exercise performs a binary search on a sorted, but rotated, array of integers.
	 */
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 9, 10};	//unrotated
		int[] b = {4, 5, 6, 7, 9, 10, 1, 2, 3}; //rotated
		
		System.out.println(rotatedBinarySearch(a, 2));
		System.out.println(rotatedBinarySearch(a, 1));	
		System.out.println(rotatedBinarySearch(a, 10));
		System.out.println(rotatedBinarySearch(a, 8));	//missing
		System.out.println(rotatedBinarySearch(a, 0)); //out of bounds
		System.out.println(rotatedBinarySearch(a, 11));
		
		System.out.println(rotatedBinarySearch(b, 2));
		System.out.println(rotatedBinarySearch(b, 4));	
		System.out.println(rotatedBinarySearch(b, 3));
		System.out.println(rotatedBinarySearch(b, 8));	//missing
		System.out.println(rotatedBinarySearch(b, 0)); //out of bounds
		System.out.println(rotatedBinarySearch(b, 11));
	}
	
	static int rotatedBinarySearch(int[] a, int x){
		int index = a.length / 2;
		int interval = index / 2;
		
		//find where the sorted bits "start"
		
		for(int i = 0; i < a.length; i++){
			if(i > 0 && a[i] < a[i-1]){
				index = (i + index) % a.length;	//sets the index to where we would normally start if the array wasn't rotated
			}
		}
		
		int count = 0;	//need a new way to know if the key isn't in the array. if we iterate the while loop more times than there are elements, the key is not in the array
		
		while(count < a.length){
			if(a[index] == x)
				return index;						
			
			if(a[index] > x){
				index -= interval;
				
				if(index < 0)
					index += a.length;
				
				if(interval > 1)
					interval /= 2;
			}
			
			else if(a[index] < x){
				index = (index + interval) % a.length;
				
				if(interval > 1)
					interval /= 2;
			}
			
			count++;
		}
		
		return -1;
	}

}
