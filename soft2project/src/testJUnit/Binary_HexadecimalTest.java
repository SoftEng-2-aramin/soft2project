package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import soft2project.Binary_Hexadecimal;

class Binary_HexadecimalTest {

	@Test
	 public void testBinAdd() {
		double test1 = Double.parseDouble(Binary_Hexadecimal.BinAdd(1, 2)); 
		double answer1 = 11;
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testBinSub() {
		double test1 = Double.parseDouble(Binary_Hexadecimal.BinSub(9, 1)); 
		double answer1 = 1000;
		System.out.println(Binary_Hexadecimal.BinSub(9, 1));
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testHexAdd() {
		String test1 = Binary_Hexadecimal.HexAdd(10, 1); 
		String answer1 = "b";
		System.out.println(Binary_Hexadecimal.HexAdd(10, 1)); 
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testHexSub() {
		String test1 = Binary_Hexadecimal.HexSub(15, 1); 
		String answer1 = "e";
		System.out.println(Binary_Hexadecimal.HexSub(15, 1)); 
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testBin2Dec() {
		String test1 = Binary_Hexadecimal.Bin2Dec(9); 
		String answer1 = "9";
		System.out.println(Binary_Hexadecimal.Bin2Dec(9)); 
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testDec2Bin () {
		String test1 = Binary_Hexadecimal.Dec2Bin(9); 
		String answer1 = "1001";
		System.out.println(Binary_Hexadecimal.Dec2Bin(9)); 
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testHex2Dec() {
		String test1 = Binary_Hexadecimal.Hex2Dec(11); 
		String answer1 = "11";
		System.out.println(Binary_Hexadecimal.Hex2Dec(11)); 
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testDec2Hex() {
		String test1 = Binary_Hexadecimal.Dec2Hex(15); 
		String answer1 = "f";
		System.out.println(Binary_Hexadecimal.Dec2Bin(15)); 
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testBin2Hex() {
		String test1 = Binary_Hexadecimal.Bin2Hex(15); 
		String answer1 = "f";
		System.out.println(Binary_Hexadecimal.Bin2Hex(15)); 
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testHex2Bin() {
		String test1 = Binary_Hexadecimal.Hex2Bin(9); 
		String answer1 = "1001";
		System.out.println(Binary_Hexadecimal.Hex2Bin(9)); 
		assertEquals(test1, answer1);	
	}

}