package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.

Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: Cheapest is: start on cost[1], pay that cost, and go to the top.

Example 2:
Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: Cheapest is: start on cost[0], and only step on 1s, skipping cost[3].

Constraints:
2 <= cost.length <= 1000
0 <= cost[i] <= 999
*/

public class _746_MinCostClimbingStairs {

	//v 1.0 Time Limit Exceeded (259 / 283 test cases passed)
	public int minCostClimbingStairs(int[] cost) {
//		if (cost == null || cost.length == 0) return 0; // // unreal by constraints
//		if (cost.length == 1) return cost[0];   // unreal by constraints
		return Math.min(climb(0, 0, cost), climb(0, 1, cost));
	}

	private int climb(int sum, int position, int[] cost) {
		if (position >= cost.length) return 0;
		sum += cost[position] + Math.min(climb(sum, position + 1, cost), climb(sum, position + 2, cost));
		return sum;
	}

//	from leet.code O(n) (Runtime: 1 ms, faster than 84.29% & Memory Usage: 40.8 MB, less than 14.91%)
//	public int minCostClimbingStairs(int[] cost) {
//		for (int i = 2; i < cost.length; i++) {
//			cost[i] += Math.min(cost[i - 1], cost[i - 2]);
//		}
//		return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
//	}

}
