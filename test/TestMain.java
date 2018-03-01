import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {
	
	Main m;
	
	@Before
	public void setup() {
		m = new Main();
	}
	@Test
	public void testMax() {
		assertEquals(15, m.max(3, 15));
	}
}
