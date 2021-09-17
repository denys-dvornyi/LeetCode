package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

Example 1:
Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101

Example 2:
Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.

Example 3:
Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.

Example 4:
Input: n = 10
Output: true
Explanation: The binary representation of 10 is: 1010.

Example 5:
Input: n = 3
Output: false

Constraints:
1 <= n <= 231 - 1
*/

public class _693_BinaryNumberWithAlternatingBits {

//	v2 (Runtime: 0 ms, faster than 100.00% & Memory Usage: 37.7 MB, less than 23.25%)
	public boolean hasAlternatingBits(int n) {
		if (n <= 2) return true;
		int powerOfTwo = 1;
		int power = 0;
		int sum = 1;
		while (n > sum) {
			powerOfTwo *= 2;
			power++;
			sum += powerOfTwo;
		}
		int[] binaryNum = new int[power+1];
		for (int i = 0; power >= 0; i++) {
			if (n >= powerOfTwo) {
				n -= powerOfTwo;
				binaryNum[i] = 1;
			} else {
				binaryNum[i] = 0;
			}
			powerOfTwo /= 2;
			power--;
		}
		for (int i = 1; i < binaryNum.length; i++) {
			if (binaryNum[i - 1] == binaryNum[i]) {
				return false;
			}
		}
		return true;
	}

//	v1 (Runtime: 1 ms, faster than 22.55% & Memory Usage: 37.4 MB, less than 25.35%)
//	public boolean hasAlternatingBits(int n) {
//		if (n <= 2) return true;
//		String binaryString = Integer.toBinaryString(n);
//		for (int i = 1; i < binaryString.length(); i++) {
//			if (binaryString.charAt(i - 1) == binaryString.charAt(i)) {
//				return false;
//			}
//		}
//		return true;
//	}

}
