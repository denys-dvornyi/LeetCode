package com.deno4ka.LeetCode.algorithms.easy;

/*
Write a function that takes a string as input and returns the string reversed.

Example 1:
Input: "hello"
Output: "olleh"

Example 2:
Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"
*/

import java.util.Arrays;

public class _344_reverse_string {

	public _344_reverse_string() {
		System.out.println(reverseString("hello")); // "olleh"
		System.out.println(reverseString("A man, a plan, a canal: Panama")); // "amanaP :lanac a ,nalp a ,nam A"
	}

	// (2ms/81.98%)
	public String reverseString(String s) {
		if (s == null || s.isEmpty() || s.length() == 1) {
			return s;
		}
		char[] strAsChars = s.toCharArray();
		for (int i = 0; i < strAsChars.length / 2; i++) {
			char tmp = strAsChars[i];
			strAsChars[i] = strAsChars[strAsChars.length - 1 - i];
			strAsChars[strAsChars.length - 1 - i] = tmp;
		}
		return new String(strAsChars);
	}

}