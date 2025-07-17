package com.deno4ka.LeetCode.algorithms.easy;

/*
A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

Example 1:
Input: s = "IDID"
Output: [0,4,1,3,2]

Example 2:
Input: s = "III"
Output: [0,1,2,3]

Example 3:
Input: s = "DDI"
Output: [3,2,0,1]

Constraints:
1 <= s.length <= 10(5)
s[i] is either 'I' or 'D'.
*/

//  not easy...
public class _942_DIStringMatch {

    //	Runtime: 2 ms, faster than 96.33% & Memory Usage: 45.6 MB, less than 16.89%
    public int[] diStringMatch(String s) {
        final int STR_LEN = s.length();
        int start = 0;
        int end = s.length();
        int[] result = new int[STR_LEN + 1];
        for (int i = 0; i < STR_LEN; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = start++;
            } else {
                result[i] = end--;
            }
        }
        result[STR_LEN] = start;
        return result;
    }

//	Wrong Answer: array with duplicate value
//	public int[] diStringMatch(String s) {
//		final int STR_LEN = s.length();
//		int[] result = new int[STR_LEN + 1];
//		for (int j = 0; j <= STR_LEN; j++) {
//			result[0] = j;
//			int i = 1;
//			for ( ; i <= STR_LEN; i++) {
//				if (s.charAt(i - 1) == 'I') {
//					if (result[i - 1] + 1 > STR_LEN) break;
//					result[i] = result[i - 1] + 1;
//				} else {
//					if (result[i - 1] - 1 < 0) break;
//					result[i] = result[i - 1] - 1;
//				}
//			}
//			if (i == STR_LEN + 1) break; // can go till the end of array
//		}
//		return result;
//	}

}
