package com.structis.beug.part1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * - Créer une simple calculatrice avec une méthode ajouter(),
 * 
 * - La méthode prend plusieurs nombres entiers séparés par des virgules,
 * 
 * - Si un nombre est négatif => Lancer une exception du type
 * NegativeNumberException
 * 
 * - Si la chaine contient un caractère qui n'est pas un chiffre => Lancer une
 * exception du type IllegalArgumentException
 * 
 * - Si la chaine est vide, retourner 0,
 * 
 * - Un nombre vide est un zéro,
 * 
 * - Les nombres supérieurs à 1000 seront igonorés.
 * 
 * @author Z.DRISSI
 * 
 */
@RunWith(Parameterized.class)
public class SmartCalculatorTest {
	
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
	
	@Test
	public void test() {
		System.out.println(expected);
	}

}
