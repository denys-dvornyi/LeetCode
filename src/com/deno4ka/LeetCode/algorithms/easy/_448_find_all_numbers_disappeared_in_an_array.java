package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
Find all the elements of [1, n] inclusive that do not appear in this array.
Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:
Input: [4,3,2,7,8,2,3,1]
Output: [5,6]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _448_find_all_numbers_disappeared_in_an_array {

	public _448_find_all_numbers_disappeared_in_an_array() {
		System.out.println(findDisappearedNumbers(null)); // empty
		System.out.println(findDisappearedNumbers(new int[]{})); // empty
		System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1})); // [5,6]
		System.out.println(findDisappearedNumbers(new int[]{2,2})); // [1]
		System.out.println(findDisappearedNumbers(new int[]{1,1,2,2})); // [3,4]
		System.out.println(findDisappearedNumbers(new int[]{1,1})); // [2]
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		if (nums != null) {
			int length = nums.length;
			if (length > 0) {
				Arrays.sort(nums);
				for (int i = 0; i < length; i++) {
					if (i == 0 && nums[i] != 1) {
						int absentNumber = 1;
						result.add(absentNumber++);
						while (absentNumber < nums[0]) {
							result.add(absentNumber++);
						}
					} else if (i == length - 1) {
						if (nums[length - 1] != length) {
							int absentNumber = nums[length - 1] + 1;
							result.add(absentNumber++);
							while (absentNumber < length) {
								result.add(absentNumber++);
							}
						}
					} else if (nums[i] != nums[i+1] && (nums[i+1] - nums[i]) > 1) {
						int absentNumber = nums[i] + 1;
						result.add(absentNumber++);
						while (absentNumber < nums[i+1]) {
							result.add(absentNumber++);
						}
					}
				}
//				if (nums[length - 1] != length) {
//					result.add(length);
//				}
			}
		}
		return result;
	}

}