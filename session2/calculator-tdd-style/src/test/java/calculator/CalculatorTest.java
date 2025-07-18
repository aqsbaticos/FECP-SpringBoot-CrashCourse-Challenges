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
		int a1 = 2, b1 = 2, expected1 = 1;
		short a2 = (short) 2, b2 = (short) 2, expected2 = 1;
		long a3 = 2L, b3 = 2L, expected3 = 1L;
		float a4 = 2.0f, b4 = 2.0f, expected4 = 1.0f;
		double a5 = 2, b5 = 2, expected5 = 1;
		double actual1 = calculator.quotient(a1,b1);
		double actual2 = calculator.quotient(a2,b2);
		double actual3 = calculator.quotient(a3,b3);
		double actual4 = calculator.quotient(a4,b4);
		double actual5 = calculator.quotient(a5,b5);
		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		assertEquals(expected3, actual3);
		assertEquals(expected4, actual4, 0.001);
		assertEquals(expected5, actual5, 0.001);
	}

	@Test
	void shouldThrowIllegalArgumentExceptionWhenZeroDivisor() {
		int a = 10, b = 0;
		assertThrows(IllegalArgumentException.class, () -> calculator.quotient(a,b));
	}

}