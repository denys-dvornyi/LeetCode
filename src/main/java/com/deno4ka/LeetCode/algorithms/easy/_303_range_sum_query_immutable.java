package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]
sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3

Note:
You may assume that the array does not change.
There are many calls to sumRange function.

Your NumArray object will be instantiated and called as such:
NumArray obj = new NumArray(nums);
int param_1 = obj.sumRange(i,j);
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _303_range_sum_query_immutable {

	private int[] sums;
	private int[] nums;
	private Map<String, Integer> sumRanges = new HashMap<>();

	public _303_range_sum_query_immutable() {
		nums = new int[] {-2, 0, 3, -5, 2, -1};
		System.out.println(sumRange(0, 2)); // 1
		System.out.println(sumRange(2, 5)); // -1
		System.out.println(sumRange(0, 5)); // -3
	}

	public _303_range_sum_query_immutable(int[] nums) {
		this.nums = nums;

		sums = Arrays.copyOf(nums, nums.length);
		for (int x = 1; x < nums.length; x++) {
			sums[x] += sums[x - 1];
		}
	}

	// (920ms/2.76%)
	public int sumRange(int i, int j) {
		String sumRangeKey = i + ":" + j;
		if (sumRanges.containsKey(sumRangeKey)) {
			return sumRanges.get(sumRangeKey);
		} else {
			int sum = 0;
			for (int start = i; start <= j; start++) {
				sum += nums[start];
			}
			sumRanges.put(sumRangeKey, sum);
			return sum;
		}
	}

	// best from leetcode (217ms)
//	public int sumRange(int i, int j)
//	{
//		if (i == 0)
//			return sums[j];
//
//		return sums[j] - sums[i - 1];
//	}

}