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
}