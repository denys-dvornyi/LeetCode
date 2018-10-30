package com.deno4ka.LeetCode.algorithms.easy;

/*
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.
*/

import java.util.HashMap;
import java.util.Map;

public class _205_isomorphic_strings {

	public _205_isomorphic_strings() {
		System.out.println(isIsomorphic("egg", "add")); // true
		System.out.println(isIsomorphic("foo", "bar")); // false
		System.out.println(isIsomorphic("paper", "title")); // true
		System.out.println(isIsomorphic(null, "not null")); // false
		System.out.println(isIsomorphic("not null", null)); // false
		System.out.println(isIsomorphic(null, null)); // false
		System.out.println(isIsomorphic("long", "very long")); // false
		System.out.println(isIsomorphic("cool", "good")); // true
		System.out.println(isIsomorphic("ab", "aa")); // false
	}

	public boolean isIsomorphic(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		} else {
			Map<Character, Character> characterMap = new HashMap<>();
			char[] charsS = s.toCharArray();
			char[] charsT = t.toCharArray();
			for (int i = 0; i < charsS.length; i++) {
				if (!characterMap.containsKey(charsS[i])) {
					if (characterMap.containsValue(charsT[i])) {
						return false;
					} else {
						characterMap.put(charsS[i], charsT[i]);
					}
				} else {
					if (characterMap.get(charsS[i]) != charsT[i]) {
						return false;
					}
				}
			}
			return true;
		}
	}

}