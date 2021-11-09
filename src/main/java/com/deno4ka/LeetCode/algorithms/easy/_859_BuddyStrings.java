package com.deno4ka.LeetCode.algorithms.easy;

/*
Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

Example 1:
Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

Example 2:
Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.

Example 3:
Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

Example 4:
Input: s = "aaaaaaabc", goal = "aaaaaaacb"
Output: true

Constraints:
1 <= s.length, goal.length <= 2*10(4)
s and goal consist of lowercase letters.
*/

import java.util.Locale;

public class _859_BuddyStrings {

//	Runtime: 1 ms, faster than 98.63% & Memory Usage: 39.1 MB, less than 58.14%
	public boolean buddyStrings(String s, String goal) {
		if (s.length() != goal.length()) return false;
		if (s.equals(goal)) {
			int[] lettersFrequency = new int[26];
			final int VALUE_OF_A = 'a';
			for (char c : s.toCharArray()) {
				int charValue = (int) c - VALUE_OF_A;
				lettersFrequency[charValue]++;
				if (lettersFrequency[charValue] > 1) {
					return true;
				}
			}
			return false;
		}
		int mismatchLetters = 0;
		int[] mismatchIndexes = new int[2];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != goal.charAt(i)) {
				if (mismatchLetters == 2) {
					return false;
				} else {
					mismatchIndexes[mismatchLetters++] = i;
				}
			}
		}
		char[] goalSymbols = goal.toCharArray();
		// swap mismatch characters
		char tmp = goalSymbols[mismatchIndexes[1]];
		goalSymbols[mismatchIndexes[1]] = goalSymbols[mismatchIndexes[0]];
		goalSymbols[mismatchIndexes[0]] = tmp;
		return s.equals(new String(goalSymbols));
	}

//	Time Limit Exceeded
//	public boolean buddyStrings(String s, String goal) {
//		int mismatchIndex = -1;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) != goal.charAt(i)) {
//				mismatchIndex = i;
//				break;
//			}
//		}
//		if (mismatchIndex > 0) {
//			s = s.substring(mismatchIndex);
//			goal = goal.substring(mismatchIndex);
//		}
//		char[] goalChars = goal.toCharArray();
//		for (int j = 0; j < goalChars.length; j++) {
//			for (int k = j + 1; k < goalChars.length; k++) {
//				swapElements(goalChars, j, k);
//				if (s.equals(new String(goalChars))) {
//					return true;
//				} else {
//					swapElements(goalChars, j, k);
//				}
//			}
//		}
//		return false;
//	}

//	private void swapElements(char[] arrayToSwap, int from, int to) {
//		char tmp = arrayToSwap[to];
//		arrayToSwap[to] = arrayToSwap[from];
//		arrayToSwap[from] = tmp;
//	}

}
