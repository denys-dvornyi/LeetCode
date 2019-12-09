package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.
*/

public class _557_ReverseWordsInAString3 {

	// Runtime: 3 ms, faster than 95.97% & Memory Usage: 38.3 MB, less than 98.25%
	public String reverseWords(String s) {
		if (s == null || s.length() < 2) {
			return s;
		}
		char[] string = s.toCharArray();
		char[] tmp = new char[string.length];
		int index = 0;
		int revertIndex = 0;
		for (int i = 0; i < string.length; i++) {
			if (string[i] != ' ') {
				tmp[index] = string[i];
				index++;
			} else {
				while (revertIndex < index) {
					string[i - index + revertIndex] = tmp[index - 1 - revertIndex];
					revertIndex++;
				}
				index = 0;
				revertIndex = 0;
			}
		}
		revertIndex = 0;
		while (revertIndex < index) {
			string[string.length - index + revertIndex] = tmp[index - 1 - revertIndex];
			revertIndex++;
		}
		return new String(string);
	}

}
