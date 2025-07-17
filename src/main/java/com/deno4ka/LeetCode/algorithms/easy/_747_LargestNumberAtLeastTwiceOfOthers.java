package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given an integer array nums where the largest integer is unique.
Determine whether the largest element in the array is at least twice as much as every other number in the array.
If it is, return the index of the largest element, or return -1 otherwise.

Example 1:
Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.

Example 2:
Input: nums = [1,2,3,4]
Output: -1
Explanation: 4 is less than twice the value of 3, so we return -1.

Example 3:
Input: nums = [1]
Output: 0
Explanation: 1 is trivially at least twice the value as any other number because there are no other numbers.

Constraints:
1 <= nums.length <= 50
0 <= nums[i] <= 100
The largest element in nums is unique.
*/

public class _747_LargestNumberAtLeastTwiceOfOthers {

//	with two loops
//	Runtime: 0 ms, faster than 100.00% & Memory Usage: 37.1 MB, less than 52.02%
//	public int dominantIndex(int[] nums) {
//		if (nums == null || nums.length == 0) return -1;
//		if (nums.length == 1) return 0;
//		else {
//			int maxElementIndex = 0;
//			int maxElement = nums[maxElementIndex];
//			for (int i = 1; i < nums.length; i++) {
//				if (maxElement < nums[i]) {
//					maxElementIndex = i;
//					maxElement = nums[i];
//				}
//			}
//			for (int j = 0; j < nums.length; j++) {
//				if (j == maxElementIndex) continue; // skip if it's the max element of array
//				if (maxElement < nums[j] * 2) {
//					return -1;
//				}
//			}
//			return maxElementIndex;
//		}
//	}

    //	with prev maximum
//	Runtime: 0 ms, faster than 100.00% & Memory Usage: 37 MB, less than 59.13%
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        if (nums.length == 1) return 0;
        else {
            int prevMaxElement = Integer.MIN_VALUE;
            int maxElementIndex = 0;
            int maxElement = nums[maxElementIndex];
            for (int i = 1; i < nums.length; i++) {
                if (maxElement < nums[i]) {
                    prevMaxElement = maxElement;
                    maxElementIndex = i;
                    maxElement = nums[i];
                } else if (prevMaxElement < nums[i]) {
                    prevMaxElement = nums[i];
                }
            }
            if (prevMaxElement * 2 > maxElement) {
                return -1;
            } else {
                return maxElementIndex;
            }
        }
    }

//	with sorting array
//	Runtime: 1 ms, faster than 50.61% & Memory Usage: 36.9 MB, less than 59.13%
//	public int dominantIndex(int[] nums) {
//		if (nums == null || nums.length == 0) return -1;
//		if (nums.length == 1) return 0;
//		else {
//			int maxElementIndex = 0;
//			int maxElement = nums[maxElementIndex];
//			for (int i = 1; i < nums.length; i++) {
//				if (maxElement < nums[i]) {
//					maxElementIndex = i;
//					maxElement = nums[i];
//				}
//			}
//			Arrays.sort(nums);
//			if (nums[nums.length - 2] * 2 > maxElement) {
//				return -1;
//			} else {
//				return maxElementIndex;
//			}
//		}
//	}

}
