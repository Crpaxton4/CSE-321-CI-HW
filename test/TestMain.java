import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	
	@Test
	public void test() {
		assertTrue(true);
	}

	@Test
	public void testFib() {
		Main m = new Main();
		
		int n = 4;
		
		int f = m.fib(n);
		
		assertEquals(f, 3)
	}
}
