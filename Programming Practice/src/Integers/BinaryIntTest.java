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
	public void unsignedToSignedTest(){
		String bit = "01101";
	}

}
