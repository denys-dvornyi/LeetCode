package com.deno4ka.LeetCode.algorithms.easy;

/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:
The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/

public class _415_add_strings {

	public _415_add_strings() {
//		System.out.println(addStrings("9", "9")); // "18"
//		System.out.println(addStrings("99", "1")); // "100"
//		System.out.println(addStrings("123", "123")); // "246"
//		System.out.println(addStrings("999", "111")); // "1110"
//		System.out.println(addStrings("123", "456")); // "579"
//		System.out.println(addStrings("1", "99")); // "100"
//		System.out.println(addStrings("999", "1")); // "1000"
	}

	// (19ms/54.48%)
	public String addStrings(String num1, String num2) {
		if (num1 == null && num2 == null) {
			return null;
		} else if (num1 == null || num1.isEmpty()) {
			return num2;
		} else if (num2 == null || num2.isEmpty()) {
			return num1;
		} else {
			int[] num1Digits = new int[num1.length()];
			int[] num2Digits = new int[num2.length()];
			for (int i = 0; i < num1.length(); i++) { // reverse string1
				num1Digits[i] = Character.getNumericValue(num1.charAt(num1.length() - 1 - i));
			}
			for (int j = 0; j < num2.length(); j++) { // reverse string2
				num2Digits[j] = Character.getNumericValue(num2.charAt(num2.length() - 1 - j));
			}
			// I don't want to swap strings -> so duplicate code
			if (num1Digits.length >= num2Digits.length) {
				int size = num1Digits.length;
				int[] resultNumbers = new int[size];
				int inMemory = 0;
				for (int k = 0; k < size; k++) {
					if (k < num2Digits.length) {
						int tmp = num1Digits[k] + num2Digits[k] + inMemory;
						if (tmp >= 10) {
							inMemory = 1;
							resultNumbers[k] = tmp - 10;
						} else {
							inMemory = 0;
							resultNumbers[k] = tmp;
						}
					} else {
						int tmp = num1Digits[k] + inMemory;
						if (tmp >= 10) {
							inMemory = 1;
							resultNumbers[k] = tmp - 10;
						} else {
							inMemory = 0;
							resultNumbers[k] = tmp;
						}
					}
				}
				StringBuilder resultString = new StringBuilder();
				if (inMemory > 0) {
					resultString.append(inMemory);
				}
				for (int m = resultNumbers.length - 1; m >= 0; m--) {
					resultString.append(resultNumbers[m]);
				}
				return resultString.toString();
			} else {
				int size = num2Digits.length;
				int[] resultNumbers = new int[size];
				int inMemory = 0;
				for (int k = 0; k < size; k++) {
					if (k < num1Digits.length) {
						int tmp = num2Digits[k] + num1Digits[k] + inMemory;
						if (tmp >= 10) {
							inMemory = 1;
							resultNumbers[k] = tmp - 10;
						} else {
							inMemory = 0;
							resultNumbers[k] = tmp;
						}
					} else {
						int tmp = num2Digits[k] + inMemory;
						if (tmp >= 10) {
							inMemory = 1;
							resultNumbers[k] = tmp - 10;
						} else {
							inMemory = 0;
							resultNumbers[k] = tmp;
						}
					}
				}
				StringBuilder resultString = new StringBuilder();
				if (inMemory > 0) {
					resultString.append(inMemory);
				}
				for (int m = resultNumbers.length - 1; m >= 0; m--) {
					resultString.append(resultNumbers[m]);
				}
				return resultString.toString();
			}
		}
	}

}