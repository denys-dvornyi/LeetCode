package com.deno4ka.LeetCode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/*
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates).
You may return the answer in any order.

Example 1:
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]

Example 2:
Input: words = ["cool","lock","cook"]
Output: ["c","o"]

Constraints:
1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists of lowercase English letters.
*/

public class _1002_FindCommonCharacters {

//	Runtime: 6 ms, faster than 67.61% & Memory Usage: 40.9 MB, less than 17.44%
	public List<String> commonChars(String[] words) {
		int[][] wordsChars = new int[words.length][123];
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				wordsChars[i][words[i].charAt(j)]++;
			}
		}
		List<String> result = new ArrayList<>(100);
		for (int i = 'a'; i <= (int)'z'; i++) {
			int minOccurrence = 100;
			for (int[] wordsChar : wordsChars) {
				minOccurrence = Math.min(minOccurrence, wordsChar[i]);
			}
			for (int k = 0; k < minOccurrence; k++) {
				 result.add(String.valueOf((char)i));
			}
		}
		return result;
	}

}
