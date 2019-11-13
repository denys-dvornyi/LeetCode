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

	public String[] findRelativeRanks(int[] nums) {
		if (nums == null) return new String[] {};
		Map<Integer, String> ranks = new HashMap<Integer, String>() {{put(1, "Gold Medal"); put(2, "Silver Medal"); put(3, "Bronze Medal");}};
		List<String> result = new ArrayList<>(nums.length);
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			if (i < 3) {
				result.add(ranks.get(i + 1));
			} else {
				result.add(String.valueOf(nums[i]));
			}
		}
//		System.out.println(result);
		return result.toArray(new String[0]);
	}

}
