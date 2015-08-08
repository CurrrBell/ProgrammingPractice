package Integers;

public class homeBrewParseInt{

	public static void main(String[] args) {
		System.out.println(homeBrewParseInt.parseInt("-234891"));
		System.out.println(homeBrewParseInt.parseInt("not a number"));
	}
	
	static int parseInt(String s){
		int value = 0;
		NumberFormatException format = new NumberFormatException("This is not a valid integer");
		
		String[] digits = s.split("");
		
		for(int i = 0; i < digits.length/2; i++){	//reverse the string for more clear processing later
			String tmp = digits[i];
			digits[i] = digits[digits.length - 1 - i];
			digits[digits.length - 1 - i] = tmp;
		}
		
		for(int i = 0; i < digits.length; i++){
			if(digits[i].equals("0")){
				
			}
				
			else if(digits[i].equals("1")){
				value += Math.pow(10, i);
			}
			
			else if(digits[i].equals("2")){
				value += (2 * Math.pow(10, i));
			}
			
			else if(digits[i].equals("3")){
				value += (3 * Math.pow(10, i));
			}
			
			else if(digits[i].equals("4")){
				value += (4 * Math.pow(10, i));
			}
			
			else if(digits[i].equals("5")){
				value += (5 * Math.pow(10, i));
			}
			
			else if(digits[i].equals("6")){
				value += (6 * Math.pow(10, i));
			}
			
			else if(digits[i].equals("7")){
				value += (7 * Math.pow(10, i));
			}
			
			else if(digits[i].equals("8")){
				value += (8 * Math.pow(10, i));
			}
			
			else if(digits[i].equals("9")){
				value += (9 * Math.pow(10, i));
			}
			
			else if(digits[i].equals("-") && i == digits.length-1){	//if this is a leading - sign, it's legal. same with +
				value *= -1;
			}
			
			else if(digits[i].equals("+") && i == digits.length-1){
				
			}
			
			else{
				throw format;
			}
			
		}
		
		return value;
	}

}
