package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string s and a string t, check if s is subsequence of t.
A subsequence of a string is a new string which is formed from the original string
by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
(ie, "ace" is a subsequence of "abcde" while "aec" is not).

Follow up:
If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence.
In this scenario, how would you change your code?

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false

Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
Both strings consists only of lowercase characters.
*/

public class _392_IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (s.length() > t.length()) return false;
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        int startFrom = 0;
        for (int i = 0; i < charsS.length; i++) {
            boolean charIsFound = false;
            for (int j = startFrom; j < charsT.length; j++) {
                if (charsS[i] == charsT[j]) {
                    charIsFound = true;
                    startFrom = j + 1;
                    break;
                }
            }
            if (!charIsFound) {
                return false;
            } else if (i == charsS.length - 1) {
                return true;
            }
        }
        return false;
    }

}
