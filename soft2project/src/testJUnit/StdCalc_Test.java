package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import soft2project.StdCalc;


class StdCalc_Test {

	@Test
	public void testvalidadd() {
		assertEquals(2, StdCalc.add(1, 1), 0);
	}
	
	@Test
	public void testinvalidadd() {
		assertNotEquals(1, StdCalc.add(1, 1), 0);	
	}
	
	@Test
	public void testvalidsub() {
		assertEquals(2, StdCalc.subtract(3, 1), 0);
	}
	
	@Test
	public void testinvalidsub() {
		assertNotEquals(2, StdCalc.subtract(1, 1), 0);
		
	}
	
	@Test
	public void testvalidiv() {
		assertEquals(2, StdCalc.divide(2, 1), 0);
	}
	
	@Test
	public void testinvalidiv() {
		assertNotEquals(2, StdCalc.divide(4, 1), 0);
	}
	
	@Test
	public void testvalidmulti() {
		assertEquals(2, StdCalc.mulitiply(2, 1), 0);
	}
	
	@Test
	public void testinvalidmulti() {
		assertNotEquals(2, StdCalc.mulitiply(4, 1), 0);
	}
	
	@Test
	public void testvalidabs() {
		assertEquals(2, StdCalc.absolute(-2), 0);
	}
	
	@Test
	public void testinvalidabs() {
		assertNotEquals(2, StdCalc.absolute(3), 0);
	}
}
