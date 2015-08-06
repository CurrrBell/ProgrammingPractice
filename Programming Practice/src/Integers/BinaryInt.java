package Integers;
import java.util.*;

public class BinaryInt {

	public static void main(String[] args) {
		BinaryInt twenty = new BinaryInt(20);
		BinaryInt fourMillion = new BinaryInt(4000000);
		BinaryInt negativeNum = new BinaryInt(-2347891);
	}
	
	BinaryInt(int x){
		bitVector = "";
		
		unsignedDecimalToBinary(x);
		padWithZeros();
		
		if(x < 0)
			unsignedToSigned();
		
		System.out.println(x + " in binary: " + bitVector);
	}

	static String bitVector = "";
	
	static void unsignedDecimalToBinary(int x){
		Stack<Integer> bits = new Stack<Integer>();
		
		bitVector = "";
		
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
	
	static void padWithZeros(){
		while(bitVector.length() < 32){
			bitVector = "0" + bitVector;
		}
	}

	static void unsignedToSigned(){	//flip the bits then add 1
		bitVector = bitVector.replace('0', '2'); //dummy placeholder
		bitVector = bitVector.replace('1', '0');
		bitVector = bitVector.replace('2', '1');
		
		
		String[] bits = bitVector.split("");
		int index = bits.length - 1;		
		
		while(true){
			if(bits[index].equals("0")){
				bits[index] = "1";
				break;
			}
			
			index--;
		}
		
		bitVector = "";
		
		for(int i= 0; i < bits.length; i++){
			bitVector += bits[i];
		}
		
		/*
		 * in this binary addition, we needn't worry about carries simply because we're adding 1. 
		 * It's implied that we start with a "carry" and that it will be dumped into the first 
		 * zero found in the bit vector. Once we find that, there can't be any further carries, so we stop.
		 */
		
	}


}
