package com.deno4ka.LeetCode.algorithms.easy;

/*
An array is monotonic if it is either monotone increasing or monotone decreasing.
An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true

Example 2:
Input: nums = [6,5,4,4]
Output: true

Example 3:
Input: nums = [1,3,2]
Output: false

Example 4:
Input: nums = [1,2,4,5]
Output: true

Example 5:
Input: nums = [1,1,1]
Output: true

Constraints:
1 <= nums.length <= 10(5)
-10(5) <= nums[i] <= 10(5)
*/

public class _896_MonotonicArray {

    //	Runtime: 1 ms, faster than 100.00% & Memory Usage: 48.6 MB, less than 46.64%
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) return true;
        int prev = nums[0];
        Boolean isIncreasing = null;
        for (int i = 1; i < nums.length; i++) {
            if (isIncreasing == null) {
                if (nums[i] > prev) {
                    isIncreasing = true;
                } else if (nums[i] < prev) {
                    isIncreasing = false;
                }
            } else {
                if ((isIncreasing && nums[i] < prev) || (!isIncreasing && nums[i] > prev)) {
                    return false;
                }
            }
            prev = nums[i];
        }
        return true;
    }

}
