package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given an integer array nums with the following properties:
nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.

Example 1:
Input: nums = [1,2,3,3]
Output: 3

Example 2:
Input: nums = [2,1,2,5,3,2]
Output: 2

Example 3:
Input: nums = [5,1,5,2,5,3,5,4]
Output: 5

Constraints:
2 <= n <= 5000
nums.length == 2 * n
0 <= nums[i] <= 10(4)
nums contains n + 1 unique elements and one of them is repeated exactly n times.
*/

public class _961_N_RepeatedElementInSize_2N_Array {

//	Runtime: 0 ms, faster than 100.00% & Memory Usage: 39.6 MB, less than 84.75%
	public int repeatedNTimes(int[] nums) {
//		if (nums == null || nums.length < 4 || nums.length % 2 == 1) return 0;
		int[] numCount = new int[10_001];
		for (int num : nums) {
			if (++numCount[num] > 1) return num;
		}
		return 0;
	}

}
