package Integers;
import java.util.*;

public class Pairs {
	/*
	 * This exercise aims to find the pairs of integers in a random array that sum to 10. A Pair object is
	 * returned, containing the key/value pairs for the integers in question.
	 */

	public static void main(String[] args) {
		int test[] = new int[100000];
		Random rand = new Random();
		
		for(int i = 0; i < test.length; i++){
			test[i] = rand.nextInt();
		}
		
		Pair[] p = getPairs(test);
		
		System.out.println(p.length);
		
		for(int i = 0; i < p.length; i++){
			System.out.println(p[i]);
		}
	}
	
	static Pair[] getPairs(int[] a){
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		
		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){	//don't want to double count pairs, so only consider ints we haven't checked yet
				if(a[i] + a[j] == 10){
					pairs.add(new Pair(i, a[i], j, a[j]));
				}
			}
		}
		
		Pair[] p = new Pair[pairs.size()];
		
		for(int i = 0; i < p.length; i++){
			p[i] = pairs.get(i);
		}
		
		return p;
	}
	
	public static class Pair{
		int keyA;
		int valueA;
		int keyB;
		int valueB;
		
		Pair(){
			
		}
		
		Pair(int ka, int va, int kb, int vb){
			this.keyA = ka;
			this.valueA = va;
			this.keyB = kb;
			this.valueB = vb;
		}
		
		int getKeyA(){
			return this.keyA;
		}
		
		int getValA(){
			return this.valueA;
		}
		
		int getKeyB(){
			return this.keyB;
		}
		
		int getValB(){
			return this.valueB;
		}
		
		public String toString(){
			return "keyA: " + this.keyA + " valueA: " + this.valueA + " keyB: " + this.keyB + " valueB: " + this.valueB;
		}
	}

}
