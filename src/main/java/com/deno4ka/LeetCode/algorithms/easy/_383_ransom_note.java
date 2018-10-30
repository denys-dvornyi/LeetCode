package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function
that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/

import java.util.HashMap;
import java.util.Map;

public class _383_ransom_note {

	public _383_ransom_note() {
		System.out.println(canConstruct("", ""));      // true
		System.out.println(canConstruct("a", "b"));    // false
		System.out.println(canConstruct("aa", "ab"));  // false
		System.out.println(canConstruct("aa", "aab")); // true
	}

	// (39ms/22.63%)
	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote != null && !ransomNote.isEmpty() && (magazine == null || magazine.isEmpty()) ) {
			return false;
		}
		if ( (ransomNote == null || ransomNote.isEmpty()) && (magazine == null || magazine.isEmpty()) ) {
			return true;
		}
		Map<Character, Integer> magazineLetters = new HashMap<>();
		for (char letter : magazine.toCharArray()) {
			if (!magazineLetters.containsKey(letter)) {
				magazineLetters.put(letter, 1);
			} else {
				magazineLetters.put(letter, magazineLetters.get(letter) + 1);
			}
		}
		for (char letter : ransomNote.toCharArray()) {
			Integer letterCount = magazineLetters.get(letter);
			if (letterCount == null) {
				return false;
			} else {
				if (Integer.valueOf(1).equals(letterCount)) {
					magazineLetters.remove(letter);
				} else {
					magazineLetters.put(letter, letterCount - 1);
				}
			}
		}
		return true;
	}

	// best from leet.code (6ms)
//	public boolean canConstruct(String ransomNote, String magazine) {
//		int[] index = new int[128];
//		for(char c: ransomNote.toCharArray()) {
//			int idx = magazine.indexOf(c, index[c]);
//			if(idx < 0) {
//				return false;
//			}
//			index[c] = idx + 1;
//		}
//		return true;
//	}

}