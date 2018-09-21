package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:
Input: [3,0,1]
Output: 2

Example 2:
Input: [9,6,4,2,3,5,7,0,1]
Output: 8

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/

import java.util.Arrays;

public class _268_missing_number {

	public _268_missing_number() {
		System.out.println(missingNumber(new int[]{0})); // 1
		System.out.println(missingNumber(new int[]{1})); // 0
		System.out.println(missingNumber(new int[]{1,2})); // 0
		System.out.println(missingNumber(new int[]{3,0,1})); // 2
		System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1})); // 8
		System.out.println(missingNumber(new int[]{0,1,2,3})); // 4
	}

	// (13ms/9.24%)
	public int missingNumber(int[] nums) {
		if (nums.length == 1) {
			if (nums[0] == 0) {
				return nums[0] + 1;
			} else {
				return nums[0] - 1;
			}
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] - nums[i] > 1) {
				return nums[i] + 1;
			}
		}
		if (nums[0] == 0) {
			return nums[nums.length - 1] + 1;
		} else {
			return 0;
		}
	}

	// best from leetcode (0ms/100%)
//	public int missingNumber(int[] nums) {
//		if (nums == null || nums.length == 0) {
//			return -1;
//		}
//
//		int n = nums.length;
//		int total = (1 + n) * n / 2;
//		int sum = 0;
//		for (int i : nums) {
//			sum += i;
//		}
//
//		return total - sum;
//	}

}