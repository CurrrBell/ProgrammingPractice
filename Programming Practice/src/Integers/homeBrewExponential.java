package Integers;

public class homeBrewExponential {
	
	/*
	 * implements an exponent calculation function. only works for whole number powers
	 */

	public static void main(String[] args) {
		System.out.println(exp(4, 2));
		System.out.println(exp(3.5, 2));
		System.out.println(Math.pow(4, -2));
		System.out.println(exp(4, -2));
	}
	
	static double exp(double base, int pow){
		if(pow == 0)
			return 1;
		
		double total = base; 
		
		for(int i = 1; i < Math.abs(pow); i++){
			total *= base;
		}
		
		if(pow < 0)
			return 1/total;
		
		return total;
	}

}
