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

public class _283_MoveZeroes {

    public _283_MoveZeroes() {
//		int[] nums = new int[]{0,1,0,3,12};
//		moveZeroes(nums); // 1,3,12,0,0

        int[] nums = new int[]{0, 0, 1};
        moveZeroes(nums); // [1,0,0]
        System.out.println(Arrays.toString(nums));
    }

    // (34ms/4.34%)
    public void moveZeroes(int[] nums) {
//		int iterationCount = 0;
        if (nums != null && nums.length > 1) {
            int lastPositionForZero = nums.length - 1;
            for (int i = 0; i < lastPositionForZero; ) {
                if (nums[i] == 0) {
                    for (int j = i; j < lastPositionForZero; j++) {
                        int tmp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = tmp;
//						iterationCount++;
                    }
                    lastPositionForZero--;
                }
                if (nums[i] != 0) {
                    i++;
                }
            }
        }
//		System.out.println("iterationCount: " + iterationCount);
    }

    // best from leetcode (1ms)
//	public void moveZeroes(int[] nums) {
//		int zeroCounter = 0;
//		int notZeroPointer = 0;
//		int i;
//		for (i = 0; i < nums.length; i++) {
//			if (nums[i] != 0) {
//				nums[notZeroPointer++] = nums[i];
//			} else {
//				zeroCounter++;
//			}
//		}
//		i = nums.length - 1;
//		while (zeroCounter > 0) {
//			nums[i--] = 0;
//			zeroCounter--;
//		}
//	}

}