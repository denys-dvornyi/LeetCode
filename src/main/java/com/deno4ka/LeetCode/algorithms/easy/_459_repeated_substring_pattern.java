package com.deno4ka.LeetCode.algorithms.easy;

/**
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.

Example 2:
Input: "aba"
Output: False

Example 3:
Input: "abcabcabcabc"
Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
*/

public class _459_repeated_substring_pattern {

	public _459_repeated_substring_pattern() {}

	public boolean repeatedSubstringPattern(String s) {
		if (s == null || s.length() < 2) {
			return false;
		} else {
			boolean result = false;
			int size = 1;
			for (int i = 0; !result && i < s.length() / 2; i++) {
				if (s.length() % size == 0) {
					String subString = s.substring(0, size);
					boolean repeatedSubstringFound = true;
					for (int j = size; repeatedSubstringFound && j <= s.length() - size; j+=size) {
						if (!subString.equals(s.substring(j, j + size))) {
							repeatedSubstringFound = false;
						}
					}
					if (repeatedSubstringFound) {
						result = true;
					}
				}
				size++;
			}
			return result;
		}
	}

}