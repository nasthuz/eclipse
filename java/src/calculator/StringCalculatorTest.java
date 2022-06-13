package calculator;

import static org.junit.Assert.*;
import org.junit.Test;


public class StringCalculatorTest {
//	Step 1 - should return sum of 2 numbers
	@Test
	public void shouldReturnResultOf2String() {
		assertEquals(3, StringCalculator.add("1,2,3"));
	}
	
//	Step 1 - should return sum of 2 numbers
	@Test
	public void shouldReturnSumOfTwoVal() {
		assertEquals(5, StringCalculator.add("2,3"));
	}
	
	
//	Step 1 - should return 0 if string is empty
	@Test
	public void shouldReturnZeroNotEmpty() {
		assertEquals(1, StringCalculator.add(",1"));
	}
	
//	Step 2 - Allow the Add method to handle an unknown amount of numbers.
	@Test
	public void shouldHandleUnknownAmountOfNumbers() {
		assertEquals(10, StringCalculator.add("1,1,1,1,1,1,1,1,1,1"));
	}
	
//	Step 3 - Allow the Add method to handle an unknown amount of numbers.
	@Test
	public void shouldHandleNewLines() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}
	
}
