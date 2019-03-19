package com.deno4ka.LeetCode.algorithms.easy;

/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/

import java.util.HashMap;
import java.util.Map;

public class _242_ValidAnagram {

	public _242_ValidAnagram() {
		System.out.println(isAnagram("anagram", "nagaram")); // true
		System.out.println(isAnagram("rat", "car")); // false
	}

	// (20ms/23.55%)
	public boolean isAnagram(String s, String t) {
		if (s.isEmpty() && t.isEmpty() || s.equals(t)) {
			return true;
		} else if (s.length() != t.length()) {
			return false;
		} else {
			Map<Character, Integer> firstStringMap = new HashMap<>();
			for (char symbol : s.toCharArray()) {
				if (!firstStringMap.containsKey(symbol)) {
					firstStringMap.put(symbol, 1);
				} else {
					firstStringMap.put(symbol, firstStringMap.get(symbol) + 1);
				}
			}
			for (char symbol : t.toCharArray()) {
				if (!firstStringMap.containsKey(symbol)) {
					return false;
				} else {
					int theSameSymbols = firstStringMap.get(symbol);
					if (theSameSymbols == 1) {
						firstStringMap.remove(symbol);
					} else {
						firstStringMap.put(symbol, --theSameSymbols);
					}
				}
			}
			return true;
		}
	}

}