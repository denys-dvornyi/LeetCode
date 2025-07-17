package com.deno4ka.LeetCode.algorithms.easy;

/*
Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Example 1:
Input: 11
Output: 3
Explanation: Integer 11 has binary representation 00000000000000000000000000001011

Example 2:
Input: 128
Output: 1
Explanation: Integer 128 has binary representation 00000000000000000000000010000000
*/

public class _191_NumberOf1Bits {

    public _191_NumberOf1Bits() {
        System.out.println(hammingWeight(11) + " = 3"); // 3
        System.out.println(hammingWeight(128) + " = 1"); // 1
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int hammingWeightCount = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') {
                hammingWeightCount++;
            }
        }
        return hammingWeightCount;
    }

    // best from leet.code
//	public int hammingWeight(int n) {
//		int count = 0;
//		while (n != 0) {
//			count += n & 1;
//			n = n >>> 1;
//		}
//		return count;
//	}

}