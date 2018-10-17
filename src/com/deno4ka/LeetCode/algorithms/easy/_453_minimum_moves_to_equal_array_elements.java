package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal,
where a move is incrementing n - 1 elements by 1.

Example:
Input: [1,2,3]
Output: 3

Explanation:
Only three moves are needed (remember each move increments two elements):
[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
*/

public class _453_minimum_moves_to_equal_array_elements {

	private int min;
	private int max;

	public _453_minimum_moves_to_equal_array_elements() {
		System.out.println(minMoves(new int[]{3,3,3})); // 0
		System.out.println(minMoves(new int[]{1,2,3})); // 3
		System.out.println(minMoves(new int[]{1,2})); // 1
		System.out.println(minMoves(new int[]{1,3})); // 2
		System.out.println(minMoves(new int[]{1,2,3,4})); // 6
		System.out.println(minMoves(new int[]{1,2147483647})); //
		System.out.println(minMoves(new int[]{1,1,2147483647})); //
	}

	// Time Limit Exceeded
	public int minMoves(int[] nums) {
		int movesCounter = 0;
		if (nums.length == 2 && nums[0] != nums[1]) {
			movesCounter = nums[1] - nums[0];
		} else {
			getMinAndMaxValues(nums);
			while (min != max) {
				incrementByOne(nums);
				movesCounter++;
			}
		}
		return movesCounter;
	}

	private void getMinAndMaxValues(int[] nums) {
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for (int num : nums) {
			if (min > num) {
				min = num;
			}
			if (max < num) {
				max = num;
			}
		}
	}

	private void incrementByOne(int[] nums) {
		int maxSkiped = 0;
		for (int i = 0; i < nums.length; i++) {
			if (maxSkiped == 0 && nums[i] == max) {
				maxSkiped++;
			} else if (maxSkiped != 0 && nums[i] == max) {
				maxSkiped++;
				nums[i]++;
			} else {
				nums[i]++;
			}
		}
		if (maxSkiped > 1) {
			max++;
		}
		min++;
	}

}