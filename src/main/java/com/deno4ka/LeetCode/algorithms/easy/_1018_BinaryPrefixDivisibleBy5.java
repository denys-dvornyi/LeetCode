package com.deno4ka.LeetCode.algorithms.easy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
You are given a binary array nums (0-indexed).
We define xi as the number whose binary representation is the subarray nums[0..i] (from most-significant-bit to least-significant-bit).
For example, if nums = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
Return an array of booleans answer where answer[i] is true if xi is divisible by 5.

Example 1:
Input: nums = [0,1,1]
Output: [true,false,false]
Explanation: The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
Only the first number is divisible by 5, so answer[0] is true.

Example 2:
Input: nums = [1,1,1]
Output: [false,false,false]

Example 3:
Input: nums = [0,1,1,1,1,1]
Output: [true,false,false,false,true,false]

Example 4:
Input: nums = [1,1,1,0,1]
Output: [false,false,false,false,false]

Constraints:
1 <= nums.length <= 10(5)
nums[i] is 0 or 1.
*/

//  not easy...
public class _1018_BinaryPrefixDivisibleBy5 {

	final int ONES = 0;
	final int TWOS = 1;
	final int FOURS = 2;
	final int EIGHTS = 3;
	final int SIXES = 4;

	final Map<Integer, Integer> ENDINGS = new HashMap<>() {{
		put(ONES, 1);
		put(TWOS, 2);
		put(FOURS, 4);
		put(SIXES, 6);
		put(EIGHTS, 8);
	}};

//  v.3 Runtime: 10 ms, faster than 5.84% & Memory Usage: 47.3 MB, less than 25.29%
	public List<Boolean> prefixesDivBy5(int[] nums) {
		List<Boolean> result = new ArrayList<>(nums.length);
		int[] endings = new int[5];
		for (int num : nums) {
			endings[0] += endings[4];
			System.arraycopy(endings, 0, endings, 1, 4);
			endings[0] = num;
			int sum = 0;
			for (int k = 0; k < endings.length; k++) {
				sum += endings[k] * ENDINGS.get(k);
			}
			result.add(sum % 5 == 0);
		}
		return result;
	}

//	v.2 Time Limit Exceeded (24 / 24 test cases passed, but took too long.)
//	public List<Boolean> prefixesDivBy5(int[] nums) {
//		List<Boolean> result = new ArrayList<>(nums.length);
//		for (int i = 0; i < nums.length; i++) {
//			int[] endings = new int[5];
//			int index = 0;
//			for (int j = i; j >= 0; j--, index++) {
//				if (nums[j] == 1) {
//					if (j == i) {
//						endings[ONES]++;
//					} else {
//						if (index % 4 == 1) {
//							endings[TWOS]++;
//						} else if (index % 4 == 2) {
//							endings[FOURS]++;
//						} else if (index % 4 == 3) {
//							endings[EIGHTS]++;
//						} else if (index % 4 == 0) {
//							endings[SIXES]++;
//						}
//					}
//				}
//			}
//			int sum = 0;
//			for (int k = 0; k < endings.length; k++) {
//				sum += endings[k] * ENDINGS.get(k);
//			}
//			result.add(sum % 5 == 0);
//		}
//
//		return result;
//	}

//  v.1 BigInteger is not allowed for leet.code
//	public List<Boolean> prefixesDivBy5(int[] nums) {
//		List<Boolean> result = new ArrayList<>(nums.length);
//		final BigInteger FIVE = new BigInteger("5");
//		for (int i = 0; i < nums.length; i++) {
//			BigInteger number = BigInteger.ZERO;
//			BigInteger powTwo = BigInteger.ONE;
//			for (int j = i; j >= 0; j--) {
//				 if (nums[j] != 0) {
//					 number = number.add(powTwo);
//				 }
//				powTwo = powTwo.multiply(BigInteger.TWO);
//			}
//			result.add(number.mod(FIVE).compareTo(BigInteger.ZERO) == 0);
//		}
//		return result;
//	}

//	best from leet.code 2ms
//	public List<Boolean> prefixesDivBy5(int[] nums) {
//		int reminder = 0;
//		var result = new ArrayList<Boolean>();
//		for (int i : nums) {
//			reminder = (reminder * 2 + i) % 5;
//			result.add(reminder == 0);
//		}
//		return result;
//	}

}
