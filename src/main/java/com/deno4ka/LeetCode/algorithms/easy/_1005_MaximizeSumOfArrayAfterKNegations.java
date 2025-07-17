package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an integer array nums and an integer k, modify the array in the following way:
choose an index i and replace nums[i] with -nums[i].
You should apply this process exactly k times. You may choose the same index i multiple times.
Return the largest possible sum of the array after modifying it in this way.

Example 1:
Input: nums = [4,2,3], k = 1
Output: 5
Explanation: Choose index 1 and nums becomes [4,-2,3].

Example 2:
Input: nums = [3,-1,0,2], k = 3
Output: 6
Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2].

Example 3:
Input: nums = [2,-3,-1,5,-4], k = 2
Output: 13
Explanation: Choose indices (1, 4) and nums becomes [2,3,-1,5,4].

Constraints:
1 <= nums.length <= 10(4)
-100 <= nums[i] <= 100
1 <= k <= 10(4)
*/

import java.util.Arrays;

public class _1005_MaximizeSumOfArrayAfterKNegations {

    //	Runtime: 6 ms, faster than 22.36% && Memory Usage: 39.7 MB, less than 17.68%
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        if (nums[0] > -1) {
            if (k % 2 == 1) {
                nums[0] = -nums[0];
            }
        } else {
            for (int i = 0; i < k; i++) {
                int minPositiveNumber = 100;
                int minPositiveNumberIndex = 0;
                boolean isNegationed = false;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] < 0) {
                        nums[j] = -nums[j];
                        isNegationed = true;
                        break;
                    } else {
                        if (minPositiveNumber > nums[j]) {
                            minPositiveNumber = nums[j];
                            minPositiveNumberIndex = j;
                        }
                    }
                }
                if (!isNegationed) {
                    nums[minPositiveNumberIndex] = -nums[minPositiveNumberIndex];
                }
            }
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

//	best from leet.code 1ms solution
//	public int largestSumAfterKNegations(int[] nums, int k) {
//		Arrays.sort(nums);
//		for(int i=0; k>0 && i<nums.length && nums[i] < 0; i++, k--){
//			nums[i] = -nums[i];
//		}
//		int res = 0, min = Integer.MAX_VALUE;
//		for(int i: nums){
//			min = Math.min(min, i);
//			res += i;
//		}
//		if(k%2 == 0) return res;
//		return res - min*2;
//	}

}
