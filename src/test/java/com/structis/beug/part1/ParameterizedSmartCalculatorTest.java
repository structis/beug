package com.structis.beug.part1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedSmartCalculatorTest {
	
	@Parameter(0)
	public String numbers;
	
	@Parameter(1)
	public int expected;
	
	@Parameters(name = "{index}: testAdd({0}+{1})")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        		{"0", 0},
        		{"1,2,2", 5},
        		{"5,2,3", 10},
        		{"10,1,2,2", 15}
        });
    }
    
	@Test
	public void testScenarioNominal() {
		// Arrange

		// Act
		int result = SmartCalculator.add(numbers);

		// Assert
		assertEquals(expected, result);
	}
}
