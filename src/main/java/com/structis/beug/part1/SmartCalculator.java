package com.structis.beug.part1;

public class SmartCalculator {

	public static int add(String numbers) {
		
		String[] array = numbers.split(",");
		int sum = 0;
		
		for (String strNumber : array) {
			int number = Integer.parseInt(strNumber);
			
			sum += number;
		}
		
		return sum;
	}
}
