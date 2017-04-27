package com.structis.beug.part1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.structis.beug.part1.exceptions.IllegalCharacterException;
import com.structis.beug.part1.exceptions.NegativeNumberException;

/**
 * 
 * @author Z.DRISSI
 * 
 */
public class SmartCalculatorTest {

    @Test
    public void testScenarioNominal() {
        // Arrange
        String numbers = "1,2,3";

        // Act
        int result = SmartCalculator.somme(numbers);

        // Assert
        assertEquals(1 + 2 + 3, result);
    }

    @Test(expected = NegativeNumberException.class)
    public void testNombreNegatif() {

        // Arrange
        String numbers = "1,2,-3";

        // Act
        SmartCalculator.somme(numbers);

        // Assert
    }

    @Test(expected = IllegalCharacterException.class)
    public void testCaractereIllegal() {

        // Arrange
        String numbers = "1,2,X";

        // Act
        SmartCalculator.somme(numbers);

        // Assert
    }

    @Test
    public void testChaineVide() {

        // Arrange
        String numbers = "";

        // Act
        int result = SmartCalculator.somme(numbers);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testNumbresAvecChaineVide() {

        // Arrange
        String numbers = "1,2,3,4,,5";

        // Act
        int result = SmartCalculator.somme(numbers);

        // Assert
        assertEquals(1 + 2 + 3 + 4 + 5, result);
    }

    @Test
    public void testNombreSupAMille() {

        // Arrange
        String numbers = "1,2,3,4,5,1000";

        // Act
        int result = SmartCalculator.somme(numbers);

        // Assert
        assertEquals(15, result);
    }
}
