package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given an integer array nums and an integer k.
In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k].
You can apply this operation at most once for each index i.
The score of nums is the difference between the maximum and minimum elements in nums.
Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Example 1:
Input: nums = [1], k = 0
Output: 0
Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.

Example 2:
Input: nums = [0,10], k = 2
Output: 6
Explanation: Change nums to be [2, 8]. The score is max(nums) - min(nums) = 8 - 2 = 6.

Example 3:
Input: nums = [1,3,6], k = 3
Output: 0
Explanation: Change nums to be [4, 4, 4]. The score is max(nums) - min(nums) = 4 - 4 = 0.

Constraints:
1 <= nums.length <= 10(4)
0 <= nums[i] <= 10(4)
0 <= k <= 10(4)
*/

public class _908_SmallestRange1 {

    //	Runtime: 2 ms, faster than 80.43% & Memory Usage: 39.2 MB, less than 78.90%
    public int smallestRangeI(int[] nums, int k) {
        if (nums.length < 2) return 0;
        int minValue = 10_000;
        int maxValue = 0;
        for (int num : nums) {
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }
        int diff = maxValue - minValue;
        return diff > Math.abs(k) * 2 ? diff - Math.abs(k) * 2 : 0;
    }

//	Stream version
//	public int smallestRangeI(int[] nums, int k) {
//		if (nums.length < 2) return 0;
//		IntSummaryStatistics stat = IntStream.of(nums).summaryStatistics();
//		int diff = stat.getMax() - stat.getMin();
//		return diff > Math.abs(k) * 2 ? diff - Math.abs(k) * 2 : 0;
//	}

}
