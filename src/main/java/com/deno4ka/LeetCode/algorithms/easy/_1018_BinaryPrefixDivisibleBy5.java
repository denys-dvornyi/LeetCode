package com.deno4ka.LeetCode.algorithms.easy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

public class _1018_BinaryPrefixDivisibleBy5 {

	final int ONES = 0;
	final int TWOS = 1;
	final int FOURS = 2;
	final int SIXES = 3;
	final int EIGHTS = 4;

	public List<Boolean> prefixesDivBy5(int[] nums) {
		List<Boolean> result = new ArrayList<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			int[] endings = new int[5];
			for (int j = i; j >= 0; j--) {
				if (nums[j] == 1) {
					if (j == i && nums[j] == 1) {
						endings[ONES]++;
					} else {
						if (j % 4 == 1) {
							endings[TWOS]++;
						} else if (j % 4 == 2) {
							endings[FOURS]++;
						} else if (j % 4 == 3) {
							endings[EIGHTS]++;
						} else if (j % 4 == 0) {
							endings[SIXES]++;
						}
					}
				}
			}
			for (int k = 0; k < 3; ) {
				if (k == ONES) {
					if (endings[k] > 0) {
						endings[k]--;
						if (endings[FOURS] > 0) {
							endings[FOURS]--;
						} else {
							result.add(false);
							k++;
						}
					} else {
						k++;
					}
				} else if (k == TWOS) {
					if (endings[k] > 0) {
						endings[k]--;
						if (endings[EIGHTS] > 0) {
							endings[EIGHTS]--;
						} else {
							result.add(false);
							k++;
						}
					} else {
						k++;
					}
				} else if (k == FOURS) {
					if (endings[k] > 0) {
						endings[k]--;
						if (endings[SIXES] > 0) {
							endings[SIXES]--;
						} else {
							result.add(false);
							k++;
						}
					} else {
						k++;
					}
				}
			}
			result.add(true);
		}

		return result;
	}

//  BigInteger is not allowed for leet.code
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

}
