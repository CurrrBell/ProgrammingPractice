package Integers;

public class Fibonacci {
	
	/*
	 * This exercise calculates the first n terms of the Fibonacci sequence both iteratively
	 * and recursively. The recursive method uses dynamic programming to increase efficiency
	 */

	public static void main(String[] args) {
		int[] test = iterativeFibonacci(10);
		recursiveFibonacci test1 = new recursiveFibonacci(10);
		
		for(int i = 0; i < test.length; i++){
			System.out.println(test[i]);
		}		
		
		for(int i = 0; i < recursiveFibonacci.sequence.length; i++){
			System.out.println(recursiveFibonacci.sequence[i]);
		}
	}
	
	static int[] iterativeFibonacci(int n){
		int[] sequence = new int[n];
		
		sequence[0] = 1;
		
		if(n == 1)
			return sequence;
		
		sequence[1] = 1;
		
		if(n == 2)
			return sequence;
		
		for(int i = 2; i < n; i++){
			sequence[i] = sequence[i-1] + sequence[i-2];
		}
		
		return sequence;
	}

	static class recursiveFibonacci{
		static int[] sequence;
		
		recursiveFibonacci(int n){
			sequence = new int[n];
			recursiveHelper(n);
		}
		
		void recursiveHelper(int n){
			if(n == 1){
				sequence[0] = 1;
			}
			
			else if(n == 2){
				recursiveHelper(1);
				sequence[1] = 1;
			}
			
			else{
				recursiveHelper(n-1);
				sequence[n-1] = sequence[n-2] + sequence[n-3];				
			}
		}
	}
}
