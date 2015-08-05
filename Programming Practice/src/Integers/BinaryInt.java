package Integers;
import java.util.*;

public class BinaryInt {

	public static void main(String[] args) {

	}

	static String bitVector = "";
	
	static void unsignedDecimalToBinary(int x){
		Stack<Integer> bits = new Stack<Integer>();
		
		int num = Math.abs(x);
		
		while(num > 0){
			bits.push(num % 2);
			num /= 2;
			
			if(num == 1){
				bits.push(1);
				break;
			}				
		}
		
		while(!bits.isEmpty()){			
			if(bits.pop() == 1)
				bitVector += "1";
			
			else
				bitVector += "0";
		}
	}

	static void unsignedToSigned(){
		
	}
}
