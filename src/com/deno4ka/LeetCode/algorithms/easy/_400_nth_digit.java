package com.deno4ka.LeetCode.algorithms.easy;

/*
Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
Note: n is positive and will fit within the range of a 32-bit signed integer (n < 231).

Example 1:
Input: 3
Output: 3

Example 2:
Input: 11
Output: 0

Explanation:
The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
*/

public class _400_nth_digit {

	public _400_nth_digit() {
		System.out.println(findNthDigit(3)); //3
		System.out.println(findNthDigit(11)); //0
	}

	public int findNthDigit(int n) {
		StringBuilder sb = new StringBuilder();
		int counter = 1;
		while (sb.length() < n) {
			sb.append(counter);
		}
		return (int)sb.charAt(n);
	}

}