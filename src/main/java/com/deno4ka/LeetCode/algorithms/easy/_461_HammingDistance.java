package com.deno4ka.LeetCode.algorithms.easy;

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:
Input: x = 1, y = 4
Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/

public class _461_HammingDistance {

    // Runtime: 5 ms, faster than 92.72% | Memory Usage: 37.2 MB, less than 5.34%
    public int hammingDistance(int x, int y) {
        int result = 0;
        if (x != y) {
            StringBuilder binaryX = new StringBuilder(Integer.toBinaryString(x));
            StringBuilder binaryY = new StringBuilder(Integer.toBinaryString(y));
            while (binaryX.length() < binaryY.length()) {
                binaryX.insert(0, "0");
            }
            while (binaryY.length() < binaryX.length()) {
                binaryY.insert(0, "0");
            }
            for (int i = 0; i < binaryX.length(); i++) {
                if (binaryX.charAt(i) != binaryY.charAt(i)) {
                    result++;
                }
            }
        }
        return result;
    }

    // best from leet.code (4ms)
//	public int hammingDistance(int x, int y) {
//		int val = x^y;
//		return Integer.bitCount(val);
//	}

}