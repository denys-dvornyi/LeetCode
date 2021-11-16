package com.deno4ka.LeetCode.algorithms.easy;

/*
A sentence is a string of single-space separated words where each word consists only of lowercase letters.
A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

Example 1:
Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]

Example 2:
Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]

Constraints:
1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _884_UncommonWordsFromTwoSentences {

//	Runtime: 2 ms, faster than 87.58% & Memory Usage: 39 MB, less than 74.60%
	public String[] uncommonFromSentences(String s1, String s2) {
		String[] s1Words = s1.split(" ");
		String[] s2Words = s2.split(" ");
		String[] result = new String[s1Words.length + s2Words.length];
		Map<String, Integer> words = new HashMap<>(s1Words.length + s2Words.length);
		for (String word : s1Words) {
			words.put(word, words.computeIfAbsent(word, count -> 0) + 1);
		}
		for (String word : s2Words) {
			words.put(word, words.computeIfAbsent(word, count -> 0) + 1);
		}
		int uncommonWordCount = 0;
		for (Map.Entry<String, Integer> entry : words.entrySet()) {
			if (entry.getValue() == 1) {
				result[uncommonWordCount++] = entry.getKey();
			}
		}
		return Arrays.copyOfRange(result, 0, uncommonWordCount);
	}

}
