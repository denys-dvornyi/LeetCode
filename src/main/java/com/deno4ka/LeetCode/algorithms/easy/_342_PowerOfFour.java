package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:
Input: 16
Output: true

Example 2:
Input: 5
Output: false

Follow up: Could you solve it without loops/recursion?
*/

public class _342_PowerOfFour {

	public _342_PowerOfFour() {
		System.out.println(isPowerOfFour(16)); // true
		System.out.println(isPowerOfFour(5));  // false
	}

	// (1ms/100%)
	public boolean isPowerOfFour(int num) {
		if (num == 0) return false;
		if (num == 1) return true;
		if (num % 4 == 0) return isPowerOfFour(num / 4);
		return false;
	}

}