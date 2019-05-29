package com.deno4ka.Other;

public class DoubleToFraction {

	public static void main(String[] args) {
//		printFraction(4.4d);
//		printFraction(4.0d);
//		printFraction(5.5d);
		printFraction(0.5d);
	}

	private static void printFraction(double test) {
		int multiplier = getMultiplier(test);
		int real;
		if (multiplier > 1) {
			real = (int)(test * multiplier);
			int greatestCommonDivisor = getGreatestCommonDivisor(real, multiplier);
			real /= greatestCommonDivisor;
			multiplier /= greatestCommonDivisor;
			System.out.println(test + " = " + real + "/" + multiplier);
		} else {
			real = (int)test;
			System.out.println(test + " = " + real + "/" + multiplier);
		}

	}

	private static int getMultiplier(double dbl) {
		int multiplier = 1;
		while (dbl % 1 != 0.0) {
			multiplier *= 10;
			dbl *= multiplier;
		}
		return multiplier;
	}

	private static int getGreatestCommonDivisor(int real, int multiplier) {
		if (multiplier == 1) {
			return real;
		} else {
			int greatestCommonDivisor = multiplier;
			while ((real % greatestCommonDivisor != 0) || (multiplier % greatestCommonDivisor != 0)) {
				greatestCommonDivisor--;
			}
			return greatestCommonDivisor;
		}
	}

}
