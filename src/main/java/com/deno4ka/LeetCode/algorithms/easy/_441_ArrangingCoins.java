package com.deno4ka.LeetCode.algorithms.easy;

/*
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
Given n, find the total number of full staircase rows that can be formed.
n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:
n = 5
The coins can form the following rows:
¤
¤ ¤
¤ ¤
Because the 3rd row is incomplete, we return 2.

Example 2:
n = 8
The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤
Because the 4th row is incomplete, we return 3.
*/

public class _441_ArrangingCoins {

    public _441_ArrangingCoins() {
        System.out.println(arrangeCoins(5)); // 2
        System.out.println(arrangeCoins(8)); // 3
    }

    // (46ms/ 24.51%)
    public int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int step = 1;
            long sum = step;
            while (n - sum > step) {
                sum += ++step;
            }
            return step;
        }
    }

    // best from leetcode 23ms
//	public int arrangeCoins(int n) {
//		return (int) ((-1+Math.sqrt(1+8*(long)n))/2);
//	}

}