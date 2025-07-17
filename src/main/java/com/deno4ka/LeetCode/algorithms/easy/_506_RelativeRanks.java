package com.deno4ka.LeetCode.algorithms.easy;

/*
Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
 who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
For the left two athletes, you just need to output their relative ranks according to their scores.

Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _506_RelativeRanks {

    //	 Runtime: 110 ms, faster than 5.05% and Memory Usage: 39.7 MB, less than 100.00%
    public String[] findRelativeRanks(int[] nums) {
        if (nums == null) return new String[]{};
        Map<Integer, String> ranks = new HashMap<Integer, String>() {{
            put(1, "Gold Medal");
            put(2, "Silver Medal");
            put(3, "Bronze Medal");
        }};
        List<String> result = new ArrayList<>(nums.length);
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        for (int num : nums) {
            for (int i = sortedNums.length - 1; i >= 0; i--) {
                if (num == sortedNums[i]) {
                    if (i > sortedNums.length - 1 - 3) {
                        result.add(ranks.get(sortedNums.length - 1 - i + 1));
                    } else {
                        result.add(String.valueOf(sortedNums.length - i));
                    }
                }
            }
        }
//		System.out.println(result);
        return result.toArray(new String[0]);
    }

    // best from leet.code 1ms
//	public String[] findRelativeRanks(int[] nums) {
//		int maxValue = 0;
//		for (int i = 0; i < nums.length; i ++) {
//			if (nums[i] > maxValue) {
//				maxValue = nums[i];
//			}
//		}
//
//		int[] bucket = new int[maxValue+1];
//
//		for (int i = 0; i < nums.length; i ++) {
//			bucket[nums[i]] = i+1;
//		}
//
//		int place = 1;
//		String[] answer = new String[nums.length];
//		for (int i = bucket.length-1; i >= 0; i --) {
//			if (bucket[i] != 0) {
//				if (place <= 3) {
//					if (place == 3) {
//						answer[bucket[i]-1] = "Bronze Medal";
//					}
//					else if (place == 2) {
//						answer[bucket[i]-1] = "Silver Medal";
//					}
//					else {
//						answer[bucket[i]-1] = "Gold Medal";
//					}
//				}
//				else {
//					answer[bucket[i]-1] = place+"";
//				}
//				place++;
//			}
//		}
//
//		return answer;
//	}

}
