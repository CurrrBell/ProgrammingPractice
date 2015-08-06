package Integers;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryIntTest {

	@Test
	public void unsignedBinaryTest() {
		int num = 233;
		BinaryInt.unsignedDecimalToBinary(num);
		assertEquals("11101001", BinaryInt.bitVector);
	}
	
	@Test
	public void padWithZerosTest(){
		int num = 233;
		BinaryInt.unsignedDecimalToBinary(num);
		BinaryInt.padWithZeros();
		assertEquals("00000000000000000000000011101001", BinaryInt.bitVector);
	}
	
	@Test
	public void unsignedToSignedTest(){
		int start = -13;	
		BinaryInt.unsignedDecimalToBinary(start);
		BinaryInt.padWithZeros();
		BinaryInt.unsignedToSigned();
		assertEquals("11111111111111111111111111110011", BinaryInt.bitVector);
	}
	
	

}
