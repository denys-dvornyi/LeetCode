package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:
Input: 38
Output: 2

Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
Follow up: Could you do it without any loop/recursion in O(1) runtime?
*/

public class _258_AddDigits {

	public _258_AddDigits() {
		System.out.println(addDigits(38)); // 2
		System.out.println(addDigits(999999999)); // 9
	}

	// (5ms/2.21%)
	public int addDigits(int num) {
		if (num < 10) {
			return num;
		} else {
			int sum = num;
			while (sum > 9) {
				String numberStr = String.valueOf(sum);
				sum = 0;
				for (char n : numberStr.toCharArray()) {
					sum += Integer.parseInt(String.valueOf(n));
				}
			}
			return sum;
		}
	}

	// v 1.0 Time Limit Exceeded
//	public int addDigits(int num) {
//		if (num < 10) {
//			return num;
//		} else {
//			while (num > 9) {
//				int module = 10;
//				int sum = 0;
//				while (num > module) {
//					int moduleDigit = num % module;
//					sum += moduleDigit;
//					num = (num - moduleDigit) / 10;
//					module *= 10;
//				}
//				sum += num;
//				num = sum;
//			}
//			return num;
//		}
//	}

	// best from leetcode (1ms/76.96)
//	public int addDigits(int num) {
//		if(num >= 0 && num <= 9)
//			return num;
//		int sum = 0;
//		while(num > 0)
//		{
//			sum += num % 10;
//			num /= 10;
//		}
//		return addDigits(sum);
//
//	}

}