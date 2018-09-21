package com.deno4ka.LeetCode.algorithms.easy;

/*
Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

Example 1:
Input: 6
Output: true
Explanation: 6 = 2 × 3

Example 2:
Input: 8
Output: true
Explanation: 8 = 2 × 2 × 2

Example 3:
Input: 14
Output: false
Explanation: 14 is not ugly since it includes another prime factor 7.

Note:
1 is typically treated as an ugly number.
Input is within the 32-bit signed integer range: [−231,  231 − 1].
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _263_ugly_number {

	private List<Integer> uglyPrimes;

	public _263_ugly_number() {
		System.out.println(isUgly(4)); //true
		System.out.println(isUgly(6)); //true
		System.out.println(isUgly(7)); //false
		System.out.println(isUgly(8)); //true
		System.out.println(isUgly(14)); //false
		System.out.println(isUgly(937351770)); //false
		System.out.println(isUgly(214797179)); //false
	}

	// best from leetcode (0ms/100%)
	public boolean isUgly(int num) {
		if (num <= 0) return false;
		if (num == 1) return true;
		while (num % 2 == 0)
			num >>= 1; // equals n/=2
		while (num % 3 == 0)
			num /= 3;
		while (num % 5 == 0)
			num /= 5;
		return num == 1;
	}

	// Time Limit Exceeded :(
//	public boolean isUgly(int num) {
//		if (num < 1) return false;
//		if (num == 1) return true;
//
//		for (int uglyPrime : uglyPrimes) {
//			int uglyModule = num % uglyPrime;
//			if (uglyModule == 0) {
//				return false;
//			}
//		}
//		return true;
//	}

	private List<Integer> getUglyPrimes() {
		int max = Integer.MAX_VALUE / 64;
		List<Integer> primes = new ArrayList<>();
		boolean[] numbers = new boolean[max + 1];
		Arrays.fill(numbers, true);
		for (int i = 2; i * i <= max; i++) {
			if (numbers[i]) {
				for (int j = i; i * j <= max; j++)
				{
					numbers[i * j] = false;
				}
			}
		}
		for (int k = 2; k <= max; k++) {
			if (numbers[k] && k != 2 && k != 3 && k != 5) {
				primes.add(k);
			}
		}
		return primes;
	}

}