package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
The order of output does not matter.

Example 1:
Input:
s: "cbaebabacd" p: "abc"
Output:
[0, 6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:
Input:
s: "abab" p: "ab"
Output:
[0, 1, 2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
*/

import java.util.ArrayList;
import java.util.List;

public class _438_find_all_anagrams_in_a_string {

	public _438_find_all_anagrams_in_a_string() {
		System.out.println(findAnagrams(null, null));
		System.out.println(findAnagrams(null, ""));
		System.out.println(findAnagrams("", null));
		System.out.println(findAnagrams("cbaebabacd", "abc")); // [0, 6]
		System.out.println(findAnagrams("abab", "ab")); // [0, 1, 2]
	}

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> anagrams = new ArrayList<>();

		return anagrams;
	}

}