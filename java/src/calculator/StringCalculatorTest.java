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
	
//	Step 3 - Allow the Add method to handle new lines.
	@Test
	public void shouldHandleNewLines() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}
	
//	Step 4 - Allow the Add method to handle an unknown amount of numbers.
	@Test
	public void shouldSupportCustomDelimiter() {
		assertEquals(3, StringCalculator.add("//,\\n1,2"));
	}
	
//	Step 4 - Allow the Add method to add values with default delimiter ';'
	@Test
	public void shouldSupportDefaultDelimiter() {
		assertEquals(14, StringCalculator.add("1;6;7"));
	}
	
//	Step 5 - Exception “negatives not allowed” 
	@Test
	public void shouldSupporExceptionNoNegatives() {
		try {
			StringCalculator.add("-1;6;7");
			fail("Exception fail");
		}catch(RuntimeException re){} 
	}
	
//	Step 5 - Exception “negatives not allowed” and output numbers
	@Test
	public void shouldSupporExceptionNoNegativesWithOutput() {
		try {
			StringCalculator.add("-1;-6;-7;8");
			fail("Exception fail");
		}catch(RuntimeException re){
			assertEquals(" Negatives not allowed: [-1, -6, -7]", re.getMessage());
		} 
	}
	

	
}

