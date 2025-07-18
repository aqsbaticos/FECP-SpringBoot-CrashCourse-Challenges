package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	void setup() {
		calculator = new Calculator();
	}

	@Test
	void shouldReturnCorrectSum() {
		int result1 = calculator.sum(1,2);
		short result2 = calculator.sum((short) 1,(short) 2);
		long result3 = calculator.sum(123L,246L);
		float result4 = calculator.sum(1.1f,2.2f);
		double result5 =calculator.sum(1,2);
		assertEquals(3, result1);
		assertEquals((short) 3, result2);
		assertEquals(369L, result3);
		assertEquals(3.3f, result4, 0.001);
		assertEquals(3, result5, 0.001);
	}

	@Test
	void shouldReturnCorrectDifference() {
		int result1 = calculator.difference(1,2);
		short result2 = calculator.difference((short) 1,(short) 2);
		long result3 = calculator.difference(24L,12L);
		float result4 = calculator.difference(1.1f,2.2f);
		double result5 =calculator.difference(1,2);
		assertEquals(-1, result1);
		assertEquals((short) -1, result2);
		assertEquals(12L, result3);
		assertEquals(-1.1f, result4, 0.001);
		assertEquals(-1, result5, 0.001);
	}

	@Test
	void shouldReturnCorrectProduct() {
		int result1 = calculator.product(1,2);
		short result2 = calculator.product((short) 1,(short) 2);
		long result3 = calculator.product(13,12L);
		float result4 = calculator.product(1.1f,2.2f);
		double result5 =calculator.product(1,2);
		assertEquals(2, result1);
		assertEquals((short) 2, result2);
		assertEquals(156L, result3);
		assertEquals(2.42f, result4, 0.001);
		assertEquals(2, result5, 0.001);
	}

	@Test
	void shouldReturnCorrectQuotient() {
		double a = 2, b = 2, expected = 1;
		double actual = calculator.quotient(a,b);
		assertEquals(expected, actual, 0.01);
	}

//	@Test
//	void shouldThrowArithmeticExceptionWhenZeroDivisor() {
//		double a = 10, b = 0;
//		double actual = calculator.quotient(a,b);
//		assertThrows(ArithmeticException.class, () -> System.out.print("Division by 0 should be invalid."));
//	}

}