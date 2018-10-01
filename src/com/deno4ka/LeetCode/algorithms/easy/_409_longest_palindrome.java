package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
This is case sensitive, for example "Aa" is not considered a palindrome here.
Note:
Assume the length of given string will not exceed 1,010.

Example:
Input: "abccccdd"
Output: 7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
*/

import java.util.HashMap;

public class _409_longest_palindrome {

	public _409_longest_palindrome() {
		System.out.println(longestPalindrome("abccccdd")); // 7
		System.out.println(longestPalindrome("ccc")); // 3
	}

	// (17ms/19%)
	public int longestPalindrome(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		} else if (s.length() == 1) {
			return 1;
		} else {
			HashMap<Character, Integer> letters = new HashMap<>();
			for (char letter : s.toCharArray()) {
				if (!letters.containsKey(letter)) {
					letters.put(letter, 1);
				} else {
					letters.put(letter, letters.get(letter) + 1);
				}
			}
			boolean singleChar = false;
			int palindromeSize = 0;
			for (int letterCount : letters.values()) {
				if (letterCount == 1 && !singleChar) {
					singleChar = true;
				} else if (letterCount % 2 == 1) {
					palindromeSize += letterCount - 1;
					if (!singleChar) {
						singleChar = true;
					}
				} else {
					palindromeSize += letterCount;
				}
			}
			if (singleChar) {
				palindromeSize++;
			}
			return palindromeSize;
		}
	}

	// best from leetcode (5ms)
//	public int longestPalindrome(String s) {
//		int[] record = new int[256];
//		for (char c : s.toCharArray()) {
//			record[c]++;
//		}
//		int result = 0;
//		boolean findOdd = false;
//		for (int count : record) {
//			if (count % 2 == 0) {
//				result += count;
//			} else {
//				result += count - 1;
//				findOdd = true;
//			}
//		}
//		return findOdd ? result + 1 : result;
//	}

}