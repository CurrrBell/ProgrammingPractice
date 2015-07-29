package Integers;

public class BinarySearch {

	/*
	 * This exercise implements a binary search on a sorted array of integers
	 */
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 9, 10};
		System.out.println(binarySearch(a, 2));
		System.out.println(binarySearch(a, 1));	
		System.out.println(binarySearch(a, 10));
		System.out.println(binarySearch(a, 8));	//missing
		System.out.println(binarySearch(a, 0)); //out of bounds
		System.out.println(binarySearch(a, 11));
	}
	
	static int binarySearch(int[] a, int x){
		int index = a.length / 2;
		int interval = index / 2;
		
		while(true){
			if(a[index] == x)
				return index;
			
			else if((index == 0 && a[index] != x) || (index == a.length-1 && a[index] != x) || (a[index-1] < x && a[index] > x) || (a[index] < x && a[index+1] > x)){	//x must not be in the array
				return -1;
			}
			
			if(a[index] > x){
				index -= interval;
				
				if(interval > 1)
					interval /= 2;
			}
			
			else if(a[index] < x){
				index += interval;
				
				if(interval > 1)
					interval /= 2;
			}
			
			
		}
		
	}
}
