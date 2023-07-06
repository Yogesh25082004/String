package com.string.calc.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.string.calc.main.Calculator;

class StringCalculatorTest {

	//Starting with empty string
	@Test
	void testingEmptyString() {
		assertEquals(0,Calculator.add(""));
	}

}
