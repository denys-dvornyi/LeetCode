package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.

Example 1:
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11

Example 2:
Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.

Example 3:
Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0

Constraints:
1 <= nums.length <= 104
-1000 <= nums[i] <= 1000

Note: This question is the same as 1991:
https://leetcode.com/problems/find-the-middle-index-in-array/
*/

public class _724_FindPivotIndex {

    //	Runtime: 1 ms, faster than 100.00% & Memory Usage: 39.9 MB, less than 45.83%
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int leftSum = 0;
        int rightSum = 0;
        int pivotIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        while (leftSum != rightSum && pivotIndex < nums.length - 1) {
            leftSum += nums[pivotIndex];
            rightSum -= nums[pivotIndex + 1];
            pivotIndex++;
        }
        if (leftSum == rightSum) return pivotIndex;
        else return -1;
    }

}
