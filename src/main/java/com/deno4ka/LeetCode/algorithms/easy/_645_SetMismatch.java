package com.deno4ka.LeetCode.algorithms.easy;

/*
You have a set of integers s, which originally contains all the numbers from 1 to n.
Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]

Constraints:
2 <= nums.length <= 104
1 <= nums[i] <= 104
*/

public class _645_SetMismatch {

//	Runtime: 1 ms, faster than 100.00% & Memory Usage: 40.4 MB, less than 70.35%
//  v3
	public int[] findErrorNums(int[] nums) {
		final int MAX_ELEMENTS = 10_001;
		int[] result = new int[2];
		if (nums == null || nums.length < 2 || nums.length > MAX_ELEMENTS) return result;
		boolean[] numbers = new boolean[MAX_ELEMENTS];
		for (int num : nums) {
			if (numbers[num]) { // find duplicate number
				result[0] = num;
			} else {
				numbers[num] = true;
			}
		}
		for (int i = 1; i <= nums.length; i++) {
			if (!numbers[i]) { // find absent number
				result[1] = i;
				break;
			}
		}
		return result;
	}

//	v2
//	public int[] findErrorNums(int[] nums) {
//		if (nums == null || nums.length < 2 || nums.length > 10_000) return new int[] {};
//		for (int i = 0; i < nums.length; i++) {
//			int diff = nums[i] - i;
//			if (diff == 2) {
//				return new int[] {i + 2, i + 1};
//			} else if (diff == 0) {
//				return new int[] {i, i + 1};
//			}
//		}
//		return new int[] {};
//	}

//	v1
//	public int[] findErrorNums(int[] nums) {
//		if (nums == null || nums.length < 2 || nums.length > 10_000) return new int[] {};
//		int[] result = new int[2];
//		int prevNum = nums[0];
//		int i = 1;
//		for (; i < nums.length; i++) {
//			if (prevNum == nums[i]) {
//				result[0] = nums[i];
//				result[1] = nums[i] +1;
//				return result;
//			} else {
//				prevNum = nums[i];
//			}
//		}
//		return new int[] {};
//	}

}
