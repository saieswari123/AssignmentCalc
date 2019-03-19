import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	@Test
	public void testAddition() {
		Calculator c = new Calculator();
		assertEquals(6, c.Addition(3,3));
		assertEquals(2, c.Addition(5,-3));
		assertEquals(-6, c.Addition(-2,-4));
	}
	
	@Test
	public void testMultiplication() {
		Calculator c = new Calculator();
		assertEquals(9, c.Multiplication(3,3));
		assertEquals(6, c.Multiplication(2,3));
		assertEquals(-12, c.Multiplication(-4,3));
		assertEquals(12, c.Multiplication(-4,-3));
	}
	
	@Test
	public void testDivision() {
		Calculator c = new Calculator();
		assertEquals(3, c.Division(6,2));
		assertEquals(-8, c.Division(-16,2));
		assertEquals(-1, c.Division(-3,2));
		assertEquals(1, c.Division(-6,-4));
				}
}
