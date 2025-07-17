package com.deno4ka.LeetCode.algorithms.easy;

/*
Give a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's,
and all the 0's and all the 1's in these substrings are grouped consecutively.
Substrings that occur multiple times are counted the number of times they occur.

Example 1:
Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.

Example 2:
Input: s = "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.

Constraints:
1 <= s.length <= 105
s[i] is either '0' or '1'.
*/

public class _696_CountBinarySubstrings {

    //	Runtime: 19 ms, faster than 16.13% & Memory Usage: 49.2 MB, less than 7.05%
    public int countBinarySubstrings(String s) {
        if (s == null || s.length() < 2) return 0;
        int[] sequences = new int[s.length()];
        int sequencePointer = 0;
        int sequenceOfZeros = 0;
        int sequenceOfOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sequenceOfZeros++;
                if (sequenceOfOnes != 0) {
                    sequences[sequencePointer] = sequenceOfOnes;
                    sequencePointer++;
                    sequenceOfOnes = 0;
                }
            } else {
                sequenceOfOnes++;
                if (sequenceOfZeros != 0) {
                    sequences[sequencePointer] = sequenceOfZeros;
                    sequencePointer++;
                    sequenceOfZeros = 0;
                }
            }
        }
        if (sequenceOfOnes != 0) {
            sequences[sequencePointer] = sequenceOfOnes;
            sequencePointer++;
        } else if (sequenceOfZeros != 0) {
            sequences[sequencePointer] = sequenceOfZeros;
            sequencePointer++;
        }
        if (sequencePointer < 2) return 0;
        int result = 0;
        for (int j = 0; j < sequencePointer - 1; j++) {
            int first = sequences[j];
            int second = sequences[j + 1];
            int minSequence = Math.min(first, second);
            result += minSequence;
        }
        return result;
    }

//	fastest from leet.code (5 ms)
//	public int countBinarySubstrings(String s) {
//		char[] str = s.toCharArray();
//		int left=0, mid, right=0;
//
//		while(right<str.length && str[left] == str[right]) right++;
//		mid = right;
//
//		int ret = 0;
//		while(right<=str.length){
//			if(right == str.length || str[left] == str[right]){
//				ret += Math.min(mid - left, right - mid);
//				left = mid;
//				mid = right;
//			}
//			right++;
//		}
//		return ret;
//	}

}
