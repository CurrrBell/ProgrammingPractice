package Integers;

public class homeBrewMultiply {
	
	/*
	 * This exercise is a simple implementation of the multiply arithmatic function without using "*"
	 */

	public static void main(String[] args) {
		System.out.println(multiply(7, 6));
		System.out.println(multiply(-7, 6));
		System.out.println(multiply(7, 0));
	}
	
	static int multiply(int x, int y){
		int total = 0;
		
		for(int i = 0; i < Math.abs(y); i++){
			total += x;
		}
		
		return total;		
	}

}
