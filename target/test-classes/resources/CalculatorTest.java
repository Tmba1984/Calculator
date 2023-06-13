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
		assertEquals(0, calc.subs(2, 2));
	}

}
