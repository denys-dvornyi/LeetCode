package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an integer, write a function to determine if it is a power of three.

Example 1:
Input: 27
Output: true

Example 2:
Input: 0
Output: false

Example 3:
Input: 9
Output: true

Example 4:
Input: 45
Output: false

Follow up:
Could you do it without using any loop / recursion?
*/

public class _326_PowerOfThree {

    public _326_PowerOfThree() {
//		System.out.println(isPowerOfThree(27)); // true
//		System.out.println(isPowerOfThree(0));  // false
//		System.out.println(isPowerOfThree(9));  // true
//		System.out.println(isPowerOfThree(45)); // false
        System.out.println(isPowerOfThree(2147483647)); // false
    }

    // (29ms/5.60%)
    public boolean isPowerOfThree(int n) {
        int pow = 0;
        long powOfThree;
        do {
            powOfThree = (long) Math.pow(3, pow++);
            if (powOfThree == n) {
                return true;
            }
        }
        while (powOfThree < n);
        return false;
    }

    // best from leetcode (12ms)
//	public boolean isPowerOfThree(int n) {
//		if (n == 0) return false;
//		if (n == 1) return true;
//		if (n % 3 == 0) return isPowerOfThree(n / 3);
//		return false;
//	}

}