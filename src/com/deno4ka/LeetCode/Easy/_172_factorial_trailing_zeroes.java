package com.deno4ka.LeetCode.Easy;

/*
Given an integer n, return the number of trailing zeroes in n!.

Example 1:
Input: 3
Output: 0
Explanation: 3! = 6, no trailing zero.

Example 2:
Input: 5
Output: 1
Explanation: 5! = 120, one trailing zero.

Note: Your solution should be in logarithmic time complexity.
*/

import java.math.BigInteger;

public class _172_factorial_trailing_zeroes {

	public _172_factorial_trailing_zeroes() {
//		System.out.println(" | " + trailingZeroes(24)); // 24! (4)
//		System.out.println(" | " + trailingZeroes(25)); // 25! (6)
//		System.out.println(" | " + trailingZeroes(124)); // 124! (28)
//		System.out.println(" | " + trailingZeroes(125)); // 125! (31)
	}

	// v 2.0 (31ms)
	public int trailingZeroes(int n) {
		if (n == 0) return 0;
		else {
			int x = n / 5;
			n /= 5;
			while (n >= 5) {
				x += n / 5;
				n /= 5;
			}
			return x;
		}
	}

	// v 1.0 too long time :(
//	public int trailingZeroes(int n) {
//		System.out.print(n + " | ");
//		if (n == 0) return 0;
//		else {
//			BigInteger sum = new BigInteger("1");
//			int counter = 1;
//			while (counter <= n) {
//				sum = sum.multiply(BigInteger.valueOf(counter++));
//			}
//			int trailingZeroes = 0;
//			System.out.print(sum);
//			while (sum.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
//				trailingZeroes++;
//				sum = sum.divide(BigInteger.TEN);
//			}
//			return trailingZeroes;
//		}
//	}

	// best from leet.code (1ms)
//	public int trailingZeroes(int n) {
//		return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
//	}

}