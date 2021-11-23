package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given an array of n strings strs, all of the same length.
The strings can be arranged such that there is one on each line, making a grid.
For example, strs = ["abc", "bce", "cae"] can be arranged as:
abc
bce
cae
You want to delete the columns that are not sorted lexicographically.
In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
Return the number of columns that you will delete.

Example 1:
Input: strs = ["cba","daf","ghi"]
Output: 1
Explanation: The grid looks as follows:
  cba
  daf
  ghi
Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.

Example 2:
Input: strs = ["a","b"]
Output: 0
Explanation: The grid looks as follows:
  a
  b
Column 0 is the only column and is sorted, so you will not delete any columns.

Example 3:
Input: strs = ["zyx","wvu","tsr"]
Output: 3
Explanation: The grid looks as follows:
  zyx
  wvu
  tsr
All 3 columns are not sorted, so you will delete all 3.

Constraints:
n == strs.length
1 <= n <= 100
1 <= strs[i].length <= 1000
strs[i] consists of lowercase English letters.
*/

public class _944_DeleteColumnsToMakeSorted {

//	Runtime: 21 ms, faster than 11.26% & Memory Usage: 50.1 MB, less than 6.67%
//	public int minDeletionSize(String[] strs) {
//		if (strs.length == 1) return 0;
//		int[][] charMatrix = new int[strs.length][strs[0].length()];
//		for (int i = 0; i < strs.length; i++) {
//			for (int j = 0; j < strs[0].length(); j++) {
//				charMatrix[i][j] = strs[i].charAt(j);
//			}
//		}
//		int result = 0;
//		for (int k = 0; k < charMatrix[0].length; k++) {
//			for (int l = 0; l < charMatrix.length - 1; l++) {
//				if (charMatrix[l][k] > charMatrix[l + 1][k]) {
//					result++;
//					break;
//				}
//			}
//		}
//		return result;
//	}

//	faster version
//	Runtime: 6 ms, faster than 91.49% & Memory Usage: 38.9 MB, less than 92.64%
	public int minDeletionSize(String[] strs) {
		if (strs.length == 1) return 0;
		int result = 0;
		for (int k = 0; k < strs[0].length(); k++) {
			for (int l = 0; l < strs.length - 1; l++) {
				if (strs[l].charAt(k) > strs[l + 1].charAt(k)) {
					result++;
					break;
				}
			}
		}
		return result;
	}

}
