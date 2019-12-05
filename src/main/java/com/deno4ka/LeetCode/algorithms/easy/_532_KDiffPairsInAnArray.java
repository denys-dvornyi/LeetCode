package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
 Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:
Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:
Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Note:
The pairs (i, j) and (j, i) count as the same pair.
The length of the array won't exceed 10,000.
All the integers in the given input belong to the range: [-1e7, 1e7].
*/

import java.util.Arrays;

public class _532_KDiffPairsInAnArray {

	// Runtime: 16 ms, faster than 18.46% & Memory Usage: 40.3 MB, less than 84.21%
	public int findPairs(int[] nums, int k) {
		int result = 0;
		if (nums.length < 2) return result;
		else {
			Arrays.sort(nums);
			int prev = 0;
			for (int i = 0, j = 1; i < nums.length - 1;) {
				if (i == 0) prev = nums[i];
				else if (prev == nums[i]) {
					j = ++i + 1;
					continue;
				}
				if (j > nums.length - 1) {
					j = ++i + 1;
					continue;
				}
				int diff = Math.abs(nums[j] - nums[i]);
				if (diff < k) {
					j++;
					continue;
				} else if (diff == k) {
					prev = nums[i];
					j = ++i + 1;
					result++;
				} else {
					prev = nums[i];
					j = ++i + 1;
				}
			}
		}
		return result;
	}

}
