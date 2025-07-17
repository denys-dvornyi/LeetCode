package com.deno4ka.LeetCode.algorithms.easy;

/*
In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order.
The order of the alphabet is some permutation of lowercase letters.
Given a sequence of words written in the alien language, and the order of the alphabet,
return true if and only if the given words are sorted lexicographically in this alien language.

Example 1:
Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

Example 2:
Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

Example 3:
Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).

Constraints:
1 <= words.length <= 100
1 <= words[i].length <= 20
order.length == 26
All characters in words[i] and order are English lowercase letters.
*/

public class _953_VerifyingAnAlienDictionary {

//	less memory more computations...
//	Runtime: 1 ms, faster than 55.16% & Memory Usage: 39.2 MB, less than 26.96%
//	public boolean isAlienSorted(String[] words, String order) {
//		if (words == null || words.length < 2) return true;
//		int[] alienOrder = new int[26]; // 26 letters in English alphabet
//		for (int i = 0; i < order.length(); i++) {
//			alienOrder[order.charAt(i) - 'a'] = i;
//		}
//		for (int j = 0; j < words.length - 1; j++) {
//			if ( compareStrings(words[j], words[j + 1], alienOrder) > 0) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	private int compareStrings(String word, String other, int[] order) {
//		int lim = Math.min(word.length(), other.length());
//		for(int k = 0; k < lim; ++k) {
//			if (order[word.charAt(k) - 'a'] != order[other.charAt(k) - 'a']) {
//				return order[word.charAt(k) - 'a'] - order[other.charAt(k) - 'a'];
//			}
//		}
//		return word.length() - other.length();
//	}

    //	more memory less computations
//	Runtime: 0 ms, faster than 100.00% & Memory Usage: 39 MB, less than 57.68%
    public boolean isAlienSorted(String[] words, String order) {
        if (words == null || words.length < 2) return true;
        int[] alienOrder = new int[123]; // int value of 'a' is 97, int value of 'z' is 122
        for (int i = 0; i < order.length(); i++) {
            alienOrder[order.charAt(i)] = i;
        }
        for (int j = 0; j < words.length - 1; j++) {
            if (compareStrings(words[j], words[j + 1], alienOrder) > 0) {
                return false;
            }
        }
        return true;
    }

    private int compareStrings(String word, String other, int[] order) {
        int lim = Math.min(word.length(), other.length());
        for (int k = 0; k < lim; ++k) {
            if (order[word.charAt(k)] != order[other.charAt(k)]) {
                return order[word.charAt(k)] - order[other.charAt(k)];
            }
        }
        return word.length() - other.length();
    }

}
