package ru.ugatu.ekaterina.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

	@Test
	public void additionTest() throws UnsupportedOperationException {
		assertEquals(300, Calculator.calc(150, 150, '+'));
	}

	@Test
	public void subtractionTest() throws UnsupportedOperationException {
		assertEquals(0, Calculator.calc(150, 150, '-'));
	}

	@Test
	public void multiplicationTest() throws UnsupportedOperationException {
		assertEquals(100, Calculator.calc(10, 10, '*'));
	}

	@Test
	public void divisionTest() throws UnsupportedOperationException {
		assertEquals(1, Calculator.calc(10, 10, '/'));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void unsupportedOperationTest() throws UnsupportedOperationException {
		Calculator.calc(100, 100, '%');
	}
}
