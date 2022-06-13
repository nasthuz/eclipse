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
	
}
