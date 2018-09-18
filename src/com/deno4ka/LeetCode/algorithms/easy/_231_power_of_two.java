package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an integer, write a function to determine if it is a power of two.

Example 1:
Input: 1
Output: true
Explanation: 2in0 = 1

Example 2:
Input: 16
Output: true
Explanation: 2in4 = 16

Example 3:
Input: 218
Output: false
*/

public class _231_power_of_two {

	public _231_power_of_two() {
		System.out.println(isPowerOfTwo(1)); // true
		System.out.println(isPowerOfTwo(16)); // true
		System.out.println(isPowerOfTwo(218)); // false
		System.out.println(isPowerOfTwo(2147483647)); // false
	}

	// (3ms/3.8%)
	public boolean isPowerOfTwo(int n) {
		int TWO = 2;
		if (n < 0) {
			return false;
		} else {
			int pow = 0;
			double twoInPow;
			do {
				twoInPow = Math.pow(TWO, pow);
				if (twoInPow == n) {
					return true;
				}
				pow++;
			}
			while (twoInPow <= n);
			return false;
		}
	}

}