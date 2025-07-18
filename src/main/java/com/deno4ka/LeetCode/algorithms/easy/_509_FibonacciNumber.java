package com.deno4ka.LeetCode.algorithms.easy;

/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

Example 1:
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

Note:
0 ≤ N ≤ 30.
*/

public class _509_FibonacciNumber {

    // Runtime: 9 ms, faster than 26.57% and Memory Usage: 32.9 MB, less than 5.51%
    public int fib(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fib(N - 1) + fib(N - 2);
    }

    // best from leet.code
//	public int fib(int N) {
//		if (N <= 0) {
//			return 0;
//		} else if (N == 1) {
//			return 1;
//		}
//		int pre = 0, cur = 1;
//		for (int i = 2; i <= N; i++) {
//			cur += pre;
//			pre = cur - pre;
//		}
//		return cur;
//	}

}
