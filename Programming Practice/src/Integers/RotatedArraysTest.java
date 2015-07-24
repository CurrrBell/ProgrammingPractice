package Integers;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotatedArraysTest {

	@Test
	public void isRotatedUnequalLength(){
		int[] a = new int[3];
		int[] b = new int[4];
		assertEquals(false, RotatedArrays.isRotated(a, b));
	}
	
	@Test
	public void isRotatedIdenticalArrays(){
		int[] a = {1, 2, 1, 4};
		int[] b = {1, 2, 1, 4};
		assertEquals(true, RotatedArrays.isRotated(a, b));		
	}
	
	@Test
	public void isRotatedSequenceBroken(){
		int[] a = {1, 2, 1, 4};
		int[] b = {1, 4, 1, 2};
		assertEquals(true, RotatedArrays.isRotated(a, b));
	}

}
