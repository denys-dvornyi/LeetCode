package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings.
 The longest uncommon subsequence is defined as the longest subsequence of one of these strings
  and this subsequence should not be any subsequence of the other strings.

A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements.
 Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.

The input will be two strings, and the output needs to be the length of the longest uncommon subsequence.
 If the longest uncommon subsequence doesn't exist, return -1.

Example 1:
Input: "aba", "cdc"
Output: 3
Explanation: The longest uncommon subsequence is "aba" (or "cdc"),
because "aba" is a subsequence of "aba",
but not a subsequence of any other strings in the group of two strings.

Note:
Both strings' lengths will not exceed 100.
Only letters from a ~ z will appear in input strings.
*/

public class _521_LongestUncommonSubsequence1 {

    // Runtime: 0 ms, faster than 100.00% and Memory Usage: 33.9 MB, less than 100.00%
    public int findLUSlength(String a, String b) {
        if (a == null && b == null) return -1;
        if (a.isEmpty() && b.isEmpty()) return -1;
        if (a == null || a.isEmpty() && b != null) return b.length();
        if (b == null || b.isEmpty() && a != null) return a.length();
        if (a.length() < b.length()) return b.length();
        if (b.length() < a.length()) return a.length();
        if (!a.equals(b) && a.length() == b.length()) return a.length();
        return -1;
    }

}
