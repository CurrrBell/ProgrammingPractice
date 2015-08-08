package Integers;
import java.util.*;

public class newRand {
	
	/*
	 * This exercise implements a function that returns an integer between 0 and 7 inclusive given
	 * a function that does the same between 0 and 5. To accomplish this, the results from rand5() are
	 * remapped to a distribution that fits 8 possibilities. Essentially, each outcome of rand5() has a 
	 * 16.67% probability. rand7() needs a distribution of 12.5% for each outcome. This means that 25% of
	 * the time, since 6 and 7 constitute 25% of rand7() outcomes that are not possible with rand5(), the 
	 * result of rand5() needs to be remapped to 6 or 7. The other 75% of the time, the result of 0-5 is 
	 * kept. To generate something with 25% probability, rand5() is run twice and added together, denoted
	 * by the "chance" variable. This is equivalent to rolling two six-sided dice. The odds of rolling 4
	 * or 5 with two dice is 9/36, or 25% (however since we start with 0 we test for 3 or 4). If this test
	 * passes, a value of 6 or 7 is returned each with 50% probability. This leads to an even distribution
	 * of 12.5% per outcome. 
	 */

	public static void main(String[] args) {
		randomnessTest();
	}
	
	static int rand5(){	//given random function, returns random int between 0 and 5 inclusive
		Random rand = new Random();
		
		return rand.nextInt(6);
	}
	
	static int rand7(){
		int result = rand5();
		int chance = rand5() + rand5();
		
		if(chance == 3 || chance == 4){
			chance = rand5();
			
			if(chance < 3)
				result = 6;
			
			else
				result = 7;
		}
		
		return result;
	}
	
	static void randomnessTest(){	//many iterations to look at distribution of rand7()
		int[] log = new int[8];
		int tmp;
		
		for(int i = 0; i < 100000; i++){
			tmp = rand7();
			log[tmp]++;
		}
		
		for(int i = 0; i < 8; i++){
			System.out.println(i + ": " + log[i]);
		}
	}
}
