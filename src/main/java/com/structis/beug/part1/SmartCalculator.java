package com.structis.beug.part1;

import org.apache.commons.lang.StringUtils;

import com.structis.beug.part1.exceptions.IllegalCharacterException;
import com.structis.beug.part1.exceptions.NegativeNumberException;

public class SmartCalculator {

    public static int somme(final String numbers) {

        String[] arrayNumbers = StringUtils.split(numbers, ",");
        int sum = 0;

        try {
            for (String number : arrayNumbers) {

                int converted = Integer.parseInt(number);

                if (converted < 0) {
                    throw new NegativeNumberException("Negative number supplied");
                }

                if (converted >= 1000) {
                    continue;
                }

                sum += converted;

            }
        } catch (NumberFormatException e) {
            throw new IllegalCharacterException("Illegal character");
        }

        return sum;
    }
}
