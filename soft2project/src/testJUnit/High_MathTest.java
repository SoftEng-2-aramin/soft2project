package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import soft2project.High_Math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class High_MathTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDSqrt() {
		assertEquals(2, High_Math.dSqrt(4),0);
	}
	
	@Test
	void invalidtestDSqrt() {
		assertNotEquals(1, High_Math.dSqrt(4),0);
	}
	

	@Test
	void testDPow() {
		assertEquals(4, High_Math.dPow(2, 2),0);	}

	@Test
	void invalidtestDPow() {
		assertNotEquals(2, High_Math.dPow(2, 2),0);	}
	
	@Test
	void testDLoge() {
		assertEquals(0, High_Math.dLoge(1),0);	}

	@Test
	void invalidtestDLoge() {
		assertNotEquals(1, High_Math.dLoge(1),0);	}
	
	@Test
	void testDLog10() {
		assertEquals(0, High_Math.dLog10(1),0);	}
	
	@Test
	void invalidtestDLog10() {
		assertNotEquals(1, High_Math.dLog10(1),0);	}

	@Test
	void testDSqr() {
		assertEquals(4, High_Math.dSqr(2),0);	}
	
	@Test
	void invalidtestDSqr() {
		assertNotEquals(2, High_Math.dSqr(2),0);	}


	@Test
	void testDNrt() {
		assertEquals(2, High_Math.dNrt(4,2 ),0);	}
	@Test
	void invalidtestDNrt() {
		assertNotEquals(4, High_Math.dNrt(4,2 ),0);	}

	@Test
	void testDSin() {
		assertEquals(0, High_Math.dSin(0),0);	}

	@Test
	void invalidtestDSin() {
		assertNotEquals(1, High_Math.dSin(0),0);	}

	@Test
	void testDCos() {
		assertEquals(1, High_Math.dCos(0),0);	}

	@Test
	void invalidtestDCos() {
		assertNotEquals(0, High_Math.dCos(0),0);	}

	@Test
	void testDTan() {
		assertEquals(0, High_Math.dTan(0),0);	}

	@Test
	void invalidtestDTan() {
		assertNotEquals(1, High_Math.dTan(0),0);	}

}