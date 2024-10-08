package com.Assessment.TDD_DEMO;

import static com.Assessment.TDD_DEMO.TddDemoApplication.Add;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddDemoApplicationTests {
	/**
	 * I have not tested for negative scenarios where given string is invalid, as it
	 * is mentioned not required to do so
	 **/
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Add(""));
	}

	@Test
	public void testSingleNumber() {
		assertEquals(1, Add("1"));
	}

	@Test
	public void testMultipleCommaSepratedNumbers() {
		assertEquals(6, Add("1,2,3"));
	}

	@Test
	public void testNewlineDelimiter() {
		assertEquals(10, Add("1\n2,3\n4"));
	}

	@Test
	public void testCustomDelimiter() {
		assertEquals(6, Add("//;\n1;2\n3"));
	}

	@Test
	public void testNegativeNumberThrowsException() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			Add("1,-2,-3");
		});
		assertEquals("negatives not allowed: [-2, -3]", exception.getMessage());
	}
	
	@Test
	public void testIgnoreNumbersGreaterThan1000() {
	    assertEquals(2, Add("2,1001"));  // 1001 should be ignored
	}
}

