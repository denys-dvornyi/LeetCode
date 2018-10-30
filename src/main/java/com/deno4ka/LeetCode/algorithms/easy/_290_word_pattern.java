package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:
Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false

Example 4:
Input: pattern = "abba", str = "dog dog dog dog"
Output: false

Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
*/

import java.util.HashMap;
import java.util.Map;

public class _290_word_pattern {

	public _290_word_pattern() {
		System.out.println(wordPattern("abba", "dog cat cat dog")); // true
		System.out.println(wordPattern("abba", "dog cat cat fish")); // false
		System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
		System.out.println(wordPattern("abba", "dog dog dog dog")); // false
	}

	// (1ms/98.33%)
	public boolean wordPattern(String pattern, String str) {
		if ((pattern == null || pattern.length() == 0) && (str == null || str.length() == 0)) {
			return true;
		} else if ((pattern == null || pattern.length() == 0) && str != null && str.length() > 0) {
			return false;
		} else if ((str == null || str.length() == 0) && pattern != null && pattern.length() > 0) {
			return false;
		} else {
			String[] words = str.split(" ");
			if (words.length != pattern.length()) {
				return false;
			} else {
				Map<Character, String> patternMap = new HashMap<>();
				for (int i = 0; i < pattern.length(); i++) {
					if (!patternMap.containsKey(pattern.charAt(i)) && !patternMap.containsValue(words[i])) {
						patternMap.put(pattern.charAt(i), words[i]);
					}
				}
				for (int j = 0; j < pattern.length(); j++) {
					String patternWord = patternMap.get(pattern.charAt(j));
					if (patternWord == null || !patternWord.equals(words[j])) {
						return false;
					}
				}
				return true;
			}
		}
	}

}