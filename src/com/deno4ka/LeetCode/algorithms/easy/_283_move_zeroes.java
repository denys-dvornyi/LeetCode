package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

import java.util.Arrays;

public class _283_move_zeroes {

	public _283_move_zeroes() {
		int[] nums = new int[]{0,1,0,3,12};
		moveZeroes(nums); // 1,3,12,0,0
		System.out.println(Arrays.toString(nums));
	}

	public void moveZeroes(int[] nums) {
		if (nums != null && nums.length > 0) {

		}
	}

}