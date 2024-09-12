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
}
