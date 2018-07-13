package com.deno4ka.LeetCode.Easy;

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
		System.out.println(rob(new int[] {1,2,3,1}) + " = 4");
		System.out.println(rob(new int[] {2,7,9,3,1}) + " = 12");
		System.out.println(rob(new int[] {2,1,4,13,12}) + " = 18");
		System.out.println(rob(new int[] {2,1,4,13,3,5,14,1}) + " = 29");
	}

	public int rob(int[] nums) {
		int result = 0;
		if (nums == null || nums.length == 0) {
			return result;
		} else {

			int maxValue = 0;
			while (maxValue >= 0) {
				maxValue = -1;
				int maxValueIndex = 0;
				for (int i = 0; i < nums.length; i++) {
					if (nums[i] > 0 && maxValue < nums[i]) {
						maxValue = nums[i];
						maxValueIndex = i;
					}
				}
				if (maxValue > 0) {
					int adjacentSum = 0;
					nums[maxValueIndex] = -1;
					if (maxValueIndex > 0) {
						adjacentSum += nums[maxValueIndex - 1];
						nums[maxValueIndex - 1] = -1;
					}
					if (maxValueIndex + 1 < nums.length) {
						adjacentSum += nums[maxValueIndex + 1];
						nums[maxValueIndex + 1] = -1;
					}
					if (maxValue >= adjacentSum) {
						result += maxValue;
					} else {
						result += adjacentSum;
						if (maxValueIndex > 1) {
							nums[maxValueIndex - 2] = -1;
						}
						if (maxValueIndex + 2 < nums.length) {
							nums[maxValueIndex + 2] = -1;
						}
					}
				}
			}
			return result;
		}
	}

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

	// v 1.0 not working for {2,1,4,13,12}
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
//			return result;
//		}
//	}

}