package com.Assessment.TDD_DEMO;

import static com.Assessment.TDD_DEMO.TddDemoApplication.Add;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddDemoApplicationTests {

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
}
