package com.deno4ka.LeetCode.algorithms.easy;

/*
We define a harmounious array as an array where the difference between its maximum value and its minimum value is exactly 1.
Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.

Example 1:
Input: [1,3,2,2,5,2,3,7]
Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].

Note: The length of the input array will not exceed 20,000.
*/

public class _594_LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        if (nums.length == 1) return 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmpPositive = 0;
            int tmpNegative = 0;
            boolean diffFound = false;
            for (int j = i + 1; j < nums.length; j++) {
                int diff = nums[i] - nums[j];
                if (diff == -1 || diff == 0) {
                    tmpNegative++;
                }
                if (diff == 1 || diff == 0) {
                    tmpPositive++;
                }
                if (!diffFound && diff == -1 || diff == 1) {
                    diffFound = true;
                }
            }
            if (!diffFound) {
                tmpPositive = 0;
                tmpNegative = 0;
            } else {
                tmpPositive++;
                tmpNegative++;
                if (max < tmpPositive) {
                    max = tmpPositive;
                }
                if (max < tmpNegative) {
                    max = tmpNegative;
                }
            }
        }
        return max;
    }

}
