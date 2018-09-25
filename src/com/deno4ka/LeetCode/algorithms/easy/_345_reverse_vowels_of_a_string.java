package com.deno4ka.LeetCode.algorithms.easy;

/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Input: "hello"
Output: "holle"

Example 2:
Input: "leetcode"
Output: "leotcede"

Note:
The vowels does not include the letter "y".
*/

public class _345_reverse_vowels_of_a_string {

	public _345_reverse_vowels_of_a_string() {
		System.out.println(reverseVowels("hello")); // "holle"
		System.out.println(reverseVowels("leetcode")); // "leotcede"
		System.out.println(reverseVowels("aA")); // "Aa"
	}

	// (4ms/84.30%)
	public String reverseVowels(String s) {
		if (s == null || s.isEmpty() || s.length() == 1) return s;
		char[] vowels = new char[s.length()];
		char[] origChars = s.toCharArray();
		int vowelCounter = 0;
		for (int i = 0; i < origChars.length; i++) {
			if (isVowel(origChars[i])) {
				vowels[vowelCounter++] = origChars[i];
			}
		}
		for (int j = 0; j < origChars.length; j++) {
			if (isVowel(origChars[j])) {
				origChars[j] = vowels[--vowelCounter];
			}
		}
		return new String(origChars);
	}

	private boolean isVowel(char c) {
		return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o'  || c == 'O' || c == 'u' || c == 'U';
	}

}