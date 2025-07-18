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
		double result = calculator.sum(1,2);
		assertEquals(3, result, 0.01);
	}

	@Test
	void shouldReturnCorrectDifference() {
		double a = 1, b = 2, expected = -1;
		double actual = calculator.difference(a,b);
		assertEquals(expected, actual, 0.01);
	}

	@Test
	void shouldReturnCorrectProduct() {
		double a = 1, b = 2, expected = 2;
		double result = calculator.product(a,b);
		assertEquals(2, result, 0.01);
	}
}