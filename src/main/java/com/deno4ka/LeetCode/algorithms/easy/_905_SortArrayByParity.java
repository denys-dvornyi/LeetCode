package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.

Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
1 <= nums.length <= 5000
0 <= nums[i] <= 5000
*/

public class _905_SortArrayByParity {

//	Runtime: 1 ms, faster than 99.15% & Memory Usage: 39.9 MB, less than 52.70%
	public int[] sortArrayByParity(int[] nums) {
		if (nums.length <= 1) return nums;
		int[] result = new int[nums.length];
		int oddPosition = nums.length - 1;
		int evenPosition = 0;
		for (int num : nums) {
			if (num % 2 == 0) {
				result[evenPosition++] = num;
			} else {
				result[oddPosition--] = num;
			}
		}
		return result;
	}

}
