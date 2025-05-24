package com.service.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.service.EvenOrOdd;

class EvenOrOddTest {

	@ParameterizedTest
	@CsvSource ( value = {"10,even","7,odd","12,even","15,odd"})
	
	void testEvenOrOddNumber(Integer input, String expectedResult) {
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		String actualResult = evenOrOdd.evenOrOddNumber(input);
		assertEquals(expectedResult, actualResult);
	}

}
