package com.deno4ka.LeetCode.algorithms.easy;

/*
You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent
 houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house,
 determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:
Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.

Example 2:
Input: [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
*/

public class _198_house_robber {

	public _198_house_robber() {
//		System.out.println(rob(new int[] {1,2,3,1}) + " = 4");
//		System.out.println(rob(new int[] {2,7,9,3,1}) + " = 12");
//		System.out.println(rob(new int[] {2,1,4,13,12}) + " = 18");
//		System.out.println(rob(new int[] {2,1,4,13,3,5,14,1}) + " = 29");
//		System.out.println(rob(new int[] {6,3,10,8,2,10,3,5,10,5,3}) + " = 39");
		System.out.println(rob(new int[] {8,9,9,4,10,5,6,9,7,9}) + " = 45");
	}

//	public int rob(int[] nums) {
//		int result = 0;
//		if (nums == null || nums.length == 0) {
//			return result;
//		} else if (nums.length == 1) {
//			return nums[0];
//		} else {
//			int maxEven = getMax(nums, 0);
//			int maxOdd = getMax(nums, 1);
//			int maxValue = 0;
//			while (maxValue >= 0) {
//				maxValue = -1;
//				int maxValueIndex = 0;
//				for (int i = 0; i < nums.length; i++) {
//					if (nums[i] > 0 && maxValue < nums[i]) {
//						maxValue = nums[i];
//						maxValueIndex = i;
//					}
//				}
//				if (maxValue > 0) {
//					int adjacentSum = 0;
//					nums[maxValueIndex] = -1;
//					if (maxValueIndex > 0) {
//						adjacentSum += nums[maxValueIndex - 1];
//						nums[maxValueIndex - 1] = -1;
//					}
//					if (maxValueIndex + 1 < nums.length) {
//						adjacentSum += nums[maxValueIndex + 1];
//						nums[maxValueIndex + 1] = -1;
//					}
//					if (maxValue >= adjacentSum) {
//						result += maxValue;
//					} else {
//						result += adjacentSum;
//						if (maxValueIndex > 1) {
//							nums[maxValueIndex - 2] = -1;
//						}
//						if (maxValueIndex + 2 < nums.length) {
//							nums[maxValueIndex + 2] = -1;
//						}
//					}
//				}
//			}
//			result = Math.max(Math.max(maxOdd, maxEven), result);
//			return result;
//		}
//	}

	// v 2.0 not working for {2,7,9,3,1}
//	public int rob(int[] nums) {
//		int result = 0;
//		if (nums == null || nums.length == 0) {
//			return result;
//		} else {
//			int maxValue = 0;
//			while (maxValue >= 0) {
//				maxValue = -1;
//				int maxValueIndex = 0;
//				for (int i = 0; i < nums.length; i++) {
//					if (nums[i] > 0 && maxValue < nums[i]) {
//						maxValue = nums[i];
//						maxValueIndex = i;
//					}
//				}
//				if (maxValue > 0) {
//					int adjacentSum = 0;
//					nums[maxValueIndex] = -1;
//					if (maxValueIndex > 0) {
//						adjacentSum += nums[maxValueIndex - 1];
//						nums[maxValueIndex - 1] = -1;
//					}
//					if (maxValueIndex + 1 < nums.length) {
//						adjacentSum += nums[maxValueIndex + 1];
//						nums[maxValueIndex + 1] = -1;
//					}
//					if (maxValue >= adjacentSum) {
//						result += maxValue;
//					} else {
//						result += adjacentSum;
//						if (maxValueIndex > 1) {
//							nums[maxValueIndex - 2] = -1;
//						}
//						if (maxValueIndex + 2 < nums.length) {
//							nums[maxValueIndex + 2] = -1;
//						}
//					}
//				}
//			}
//			return result;
//		}
//	}

	// v 3.0 not working for {8,9,9,4,10,5,6,9,7,9}
//	public int rob(int[] nums) {
//		int result = 0;
//		if (nums == null || nums.length == 0) {
//			return result;
//		} else {
//			int maxEven = getMax(nums, 0);
//			int maxOdd = getMax(nums, 1);
//			int maxValue = 0;
//			while (maxValue >= 0) {
//				maxValue = -1;
//				int maxValueIndex = 0;
//				for (int i = 0; i < nums.length; i++) {
//					if (nums[i] > 0 && maxValue < nums[i]) {
//						maxValue = nums[i];
//						maxValueIndex = i;
//					}
//				}
//				if (maxValue > 0) {
//					if (maxValueIndex + 1 < nums.length) {
//						if (maxValue == nums[maxValueIndex + 1]) {
//							maxValue
//						}
//					}
//
//					result += maxValue;
//					nums[maxValueIndex] = -1;
//					if (maxValueIndex > 0) {
//						nums[maxValueIndex - 1] = -1;
//					}
//					if (maxValueIndex + 1 < nums.length) {
//						nums[maxValueIndex + 1] = -1;
//					}
//				}
//			}
//			result = Math.max(Math.max(maxOdd, maxEven), result);
//			return result;
//		}
//	}

//	private int getMax(int[] nums, int index) {
//		int max = 0;
//		for (int i = index; i < nums.length; i += 2) {
//			max += nums[i];
//		}
//		return max;
//	}

	// from leet.code O(n) solution
//	public int rob(int[] num) {
//		int[][] dp = new int[num.length + 1][2];
//		for (int i = 1; i <= num.length; i++) {
//			dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
//			dp[i][1] = num[i - 1] + dp[i - 1][0];
//		}
//		return Math.max(dp[num.length][0], dp[num.length][1]);
//	}

	// best from leet.code space O(1)
	public int rob(int[] nums) {
		int preMax = 0, currMax = 0;
		for (int value : nums) {
			int tmp = currMax;
			currMax = Math.max(preMax + value, currMax);
			preMax = tmp;
		}
		return currMax;
	}

}