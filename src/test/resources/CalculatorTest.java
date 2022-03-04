package resources;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calc = new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(3, calc.add(1, 2));
	}
	
	@Test
	public void testSubs() {
		assertEquals(-1, calc.subs(1, 2));
	}

}
