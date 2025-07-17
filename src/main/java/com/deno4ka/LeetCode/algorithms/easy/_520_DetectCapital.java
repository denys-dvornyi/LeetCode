package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.

Example 1:
Input: "USA"
Output: True

Example 2:
Input: "FlaG"
Output: False
*/

public class _520_DetectCapital {

    // Runtime: 1 ms, faster than 100.00% and Memory Usage: 34.6 MB, less than 100.00%
    public boolean detectCapitalUse(String word) {
        if (word == null) return true;
        if (word.length() < 2) return true;
        char[] chars = word.toCharArray();
        boolean firstCapital = false;
        boolean secondCapital = false;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                firstCapital = isCapital(chars[i]);
            } else if (i == 1) {
                secondCapital = isCapital(chars[i]);
                if (!firstCapital && secondCapital) {
                    return false;
                }
            } else if (firstCapital && secondCapital && !isCapital(chars[i])) {
                return false;
            } else if (firstCapital && !secondCapital && isCapital(chars[i])) {
                return false;
            } else if (!firstCapital && isCapital(chars[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean isCapital(char c) {
        return (int) c >= 65 && (int) c <= 90;
    }

}
