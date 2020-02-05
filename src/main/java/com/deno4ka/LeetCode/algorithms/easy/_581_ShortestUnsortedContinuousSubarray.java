package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
 then the whole array will be sorted in ascending order, too.
You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

Note:
Then length of the input array is in range [1, 10,000].
The input array may contain duplicates, so ascending order here means <=.
*/

import java.util.Arrays;

public class _581_ShortestUnsortedContinuousSubarray {

	// Runtime: 6 ms, faster than 58.10% & Memory Usage: 41.6 MB, less than 19.23%
	public int findUnsortedSubarray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int[] sortedNums = new int[nums.length];
		System.arraycopy(nums, 0, sortedNums, 0, nums.length);
		Arrays.sort(sortedNums);
		int sortedNumbersFromBegin = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == sortedNums[i]) {
				sortedNumbersFromBegin++;
			} else {
				break;
			}
		}
		int sortedNumbersFromEnd = 0;
		for (int j = nums.length - 1; j >= sortedNumbersFromBegin; j--) {
			if (nums[j] == sortedNums[j]) {
				sortedNumbersFromEnd++;
			} else {
				break;
			}
		}
		return nums.length - sortedNumbersFromBegin - sortedNumbersFromEnd;
	}

}
