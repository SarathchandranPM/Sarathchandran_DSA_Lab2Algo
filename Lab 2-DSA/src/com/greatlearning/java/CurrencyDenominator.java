package com.greatlearning.java;

public class CurrencyDenominator {
	static int[] sortedDenominator = { 100, 50, 20, 10 };
	static int target = 760;

	public static void main(String[] args) {
		for (int index = 0; index < sortedDenominator.length; index++) {
			if (target >= sortedDenominator[index]) {
				int denominator = sortedDenominator[index];
				int numberOfNotes = target / denominator;
				System.out.println(numberOfNotes + " X of denominator :: " + denominator);
				target = target % denominator;
			}

		}
		if (target !=0) {
			System.out.println("Remaining change is " + target);
		}
	}
}
