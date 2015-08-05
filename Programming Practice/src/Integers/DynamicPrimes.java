package Integers;
import java.util.*;

public class DynamicPrimes {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		DynamicPrimes ten = new DynamicPrimes(100);
		long end = System.currentTimeMillis();
		long first = end - start;
		System.out.println();
		start = System.currentTimeMillis();
		DynamicPrimes eleven = new DynamicPrimes(110);
		end = System.currentTimeMillis();
		long second = end - start;
		System.out.println();
		System.out.println("First run: " + first + " second run: " + second);
	}
	
	static ArrayList<Integer> composites = new ArrayList<Integer>();
	static ArrayList<Integer> knownPrimes = new ArrayList<Integer>();
	
	DynamicPrimes(int n){
		int[] candidates = new int[10000];
		int[] primes = new int[n];
		int primeIndex = 0;
		
		for(int i = 0; i < candidates.length; i++){
			candidates[i] = i+2; //start at 2
		}
		
		if(n > 1000)
			System.out.println("c'mon, man.");
		
		else{
			for(int i = 0; i < candidates.length; i++){
				if(!isComposite(candidates[i])){
					primes[primeIndex] = candidates[i];
					primeIndex++;
					
					if(!isKnownPrime(candidates[i]))
						sieve(candidates[i]);
				}
				
				if(primeIndex > n-1)
					break;
			}
		}
		
		for(int i = 0; i < primes.length; i++){
			System.out.print(primes[i] + ", ");
		}
	}
	
	boolean isComposite(int n){
		return composites.indexOf(n) != -1;
	}
	
	boolean isKnownPrime(int i){
		return knownPrimes.indexOf(i) != -1;
	}
	
	void sieve(int n){	//adds 500 multiples of found prime to the list of composites
		for(int i = 2; i < 502; i++){
			composites.add(i * n);
		}
	}
}
