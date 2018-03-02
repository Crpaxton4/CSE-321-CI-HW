import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMain {
	
	Main m;

	@Before
	public void setUp() {
		m = new Main();
	}
	
	@Test
	public void testFib() {
		assertEquals(0, m.fib(0));
		assertEquals(1, m.fib(1));
		assertEquals(3, m.fib(4));
		assertEquals(89, m.fib(11));
		assertEquals(6765, m.fib(20));
	}
	
	@Test
	public void testReverseString() {
		String s1 = "Reverse";
		assertTrue(m.reverseString(s1).equals("esreveR"));
		String s2 = "";
		assertTrue(m.reverseString(s2).equals(""));
		String s3 = "aaaa";
		assertTrue(m.reverseString(s3).equals("aaaa"));
	}
	
	@Test
	public void testCountPositive() {
		int[] a1 = {1, 2, 3, -1, -5, 4, -1, 6, 6};
		assertEquals(6, m.countPositive(a1));
		int[] a2 = new int[0];
		assertEquals(0, m.countPositive(a2));
		int[] a3 = {-1, -2, -1, -6, -5, -4, -9, -3};
		assertEquals(0, m.countPositive(a3));
		int[] a4 = {1, 2, 3, 4, 5, 1, 6};
		assertEquals(7, m.countPositive(a4));
	}

}
