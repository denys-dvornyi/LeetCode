package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3:
Input: s = "abc"
Output: false

Constraints:
1 <= s.length <= 105
s consists of lowercase English letters.
*/

public class _680_ValidPalindrome2 {

	public boolean validPalindrome(String s) {
		if (s == null || s.isEmpty()) return false;
		if (s.length() == 2) return true;

		return false;
	}

}
