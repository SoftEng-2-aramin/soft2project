package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import soft2project.Binary_Hexadecimal;

class Binary_HexadecimalTest {

	@Test
	 public void testValidBinAdd() {
		double test1 = Double.parseDouble(Binary_Hexadecimal.BinAdd(1, 1)); 
		double answer1 = 10;
		assertEquals(test1, answer1);
	}
	
	@Test
	 public void testInvalidBinAdd() {
		double test1 = Double.parseDouble(Binary_Hexadecimal.BinAdd(1, 2)); 
		double answer1 = 10;
		assertNotEquals(test1, answer1);
	}
	
	@Test
	public void testValidBinSub() {
		double test1 = Double.parseDouble(Binary_Hexadecimal.BinSub(1, 1)); 
		double answer1 = 0;
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testInvalidBinSub() {
		double test1 = Double.parseDouble(Binary_Hexadecimal.BinSub(1, 2)); 
		double answer1 = 1000;
		assertNotEquals(test1, answer1);
	}
	
	@Test
	public void testValidHexAdd() {
		String test1 = Binary_Hexadecimal.HexAdd(10, 1); 
		String answer1 = "b"; 
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testInvalidHexAdd() {
		String test1 = Binary_Hexadecimal.HexAdd(17, 1); 
		String answer1 = "g"; 
		assertNotEquals(test1, answer1);
	}
	
	@Test
	public void testValidHexSub() {
		String test1 = Binary_Hexadecimal.HexSub(15, 1); 
		String answer1 = "e";
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testInvalidHexSub() {
		String test1 = Binary_Hexadecimal.HexSub(17, 1); 
		String answer1 = "g";
		assertNotEquals(test1, answer1);
	}
	
	@Test
	public void testValidBin2Dec() {
		String test1 = Binary_Hexadecimal.Bin2Dec(1); 
		String answer1 = "1"; 
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testInvalidBin2Dec() {
		String test1 = Binary_Hexadecimal.Bin2Dec(2); 
		String answer1 = "10"; 
		assertNotEquals(test1, answer1);
	}
	
	@Test
	public void testValidDec2Bin () {
		String test1 = Binary_Hexadecimal.Dec2Bin(9); 
		String answer1 = "1001"; 
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testInvalidDec2Bin () {
		String test1 = Binary_Hexadecimal.Dec2Bin(10); 
		String answer1 = "1001"; 
		assertNotEquals(test1, answer1);
	}
	
	@Test
	public void testValidHex2Dec() {
		String test1 = Binary_Hexadecimal.Hex2Dec(11); 
		String answer1 = "11";
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testInvalidHex2Dec() {
		String test1 = Binary_Hexadecimal.Hex2Dec(17); 
		String answer1 = "16";
		assertNotEquals(test1, answer1);
	}
	
	@Test
	public void testValidDec2Hex() {
		String test1 = Binary_Hexadecimal.Dec2Hex(15); 
		String answer1 = "f";
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testInvalidDec2Hex() {
		String test1 = Binary_Hexadecimal.Dec2Hex(10); 
		String answer1 = "10";
		assertNotEquals(test1, answer1);
	}
	
	@Test
	public void testValidBin2Hex() {
		String test1 = Binary_Hexadecimal.Bin2Hex(1); 
		String answer1 = "1";
		assertEquals(test1, answer1);
	}
	
	@Test
	public void testInvalidBin2Hex() {
		String test1 = Binary_Hexadecimal.Bin2Hex(15); 
		String answer1 = "15";
		assertNotEquals(test1, answer1);
	}
	
	@Test
	public void testValidHex2Bin() {
		String test1 = Binary_Hexadecimal.Hex2Bin(9); 
		String answer1 = "1001";
		assertEquals(test1, answer1);	
	}
	
	@Test
	public void testInvalidHex2Bin() {
		String test1 = Binary_Hexadecimal.Hex2Bin(17); 
		String answer1 = "10010";
		assertNotEquals(test1, answer1);	
	}

}