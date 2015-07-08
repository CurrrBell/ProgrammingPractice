package Integers;

import java.util.Random;

public class MostFrequent {
	//find the most frequent integer in an array
	
	public static void main(String[] args){
		int[] testArray = generateArray();
		System.out.println(findMostFrequent(testArray));
	}
	
	private static int findMostFrequent(int[] a){
		int bestSoFar = 0;
		int bestOccurrences = 0;
		int current;
		int currentOccurrences = 0;
		
		for(int i = 0; a.length - i > bestOccurrences; i++){
			current = a[i];
			currentOccurrences = 0;
			
			for(int j = i; j < a.length; j++){
				if(a[j] == current)
					currentOccurrences++;
			}
			
			if(currentOccurrences > bestOccurrences){
				bestSoFar = current;
				bestOccurrences = currentOccurrences;
			}
		}
		
		return bestSoFar;
	}
		
	private static int[] generateArray(){
		Random rand = new Random();
		int[] array = new int[rand.nextInt(100)];
		
		for(int i = 0; i < array.length; i++){
			array[i] = rand.nextInt(100);
		}
		
		return array;
	}
}
