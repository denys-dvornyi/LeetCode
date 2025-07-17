package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
And you need to output the maximum average value.

Example 1:
Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75

Note:
1 <= k <= n <= 30,000.
Elements of the given array will be in the range [-10,000, 10,000].
*/

public class _643_MaximumAverageSubarray1 {

    // Runtime: 937 ms, faster than 7.10% & Memory Usage: 43.2 MB, less than 7.17%
//	public double findMaxAverage(int[] nums, int k) {
//		double result = -Double.MAX_VALUE;
//		for (int i = 0; i <= nums.length - k; i++) {
//			int totalSum = 0;
//			for (int j = i; j < i + k; j++) {
//				totalSum += nums[j];
//			}
//			double average = (double) totalSum / k;
//			if (result < average) {
//				result = average;
//			}
//		}
//		return result;
//	}

    // v2.0 Runtime: 2 ms, faster than 94.08% & Memory Usage: 43.1 MB, less than 6.95%
    public double findMaxAverage(int[] nums, int k) {
        double result = -Double.MAX_VALUE;
        long totalSum = 0;
        double doubleLength = k;
        for (int i = 0; i < k; i++) {
            totalSum += nums[i];
        }
        double tmpAverage = totalSum / doubleLength;
        if (result < tmpAverage) {
            result = tmpAverage;
        }
        for (int j = k; j < nums.length; j++) {
            totalSum = totalSum + nums[j] - nums[j - k];
            tmpAverage = totalSum / doubleLength;
            if (result < tmpAverage) {
                result = tmpAverage;
            }
        }
        return result;
    }

    // best from leet.code
//	public double findMaxAverage(int[] nums, int k) {
//		double sum = 0;
//		for(int i = 0; i < k;i++)
//			sum += nums[i];
//		double res = sum;
//		for(int i = k; i < nums.length; i++){
//			sum += nums[i] - nums[i - k];
//			res = Math.max(res, sum);
//		}
//		return res / k;
//	}

}
