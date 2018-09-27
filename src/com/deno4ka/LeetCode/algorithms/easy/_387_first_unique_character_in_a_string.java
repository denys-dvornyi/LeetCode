package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.
*/


import java.util.LinkedHashMap;
import java.util.Map;

public class _387_first_unique_character_in_a_string {

	public _387_first_unique_character_in_a_string() {
		System.out.println(firstUniqChar("leetcode")); // 0
		System.out.println(firstUniqChar("loveleetcode")); // 2
	}

	// with Map slow
//	public int firstUniqChar(String s) {
//		if (s == null || s.isEmpty()) {
//			return -1;
//		} else if (s.length() == 1) {
//			return 0;
//		} else {
//			Map<Character, Integer> letters = new LinkedHashMap<>();
//			for (char letter : s.toCharArray()) {
//				letters.merge(letter, 1, (a, b) -> a + b);
//			}
//			for (int i = 0; i < s.length(); i++) {
//				char letter = s.charAt(i);
//				if (Integer.valueOf(1).equals(letters.get(letter))) {
//					return i;
//				}
//			}
//			return -1;
//		}
//	}

	// with array (11ms/93.70%)
	public int firstUniqChar(String s) {
		if (s == null || s.isEmpty()) {
			return -1;
		} else if (s.length() == 1) {
			return 0;
		} else {
			int[] letters = new int[128];
			char[] strArr = s.toCharArray();
			for (char letter : strArr) {
				letters[letter]++;
			}
			for (int i = 0; i < strArr.length; i++) {
				if (letters[strArr[i]] == 1) {
					return s.indexOf(strArr[i]);
				}
			}
			return -1;
		}
	}

}