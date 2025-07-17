package com.deno4ka.LeetCode.algorithms.easy;

/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.

Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true

Example 2:
Input: s = "abcde", goal = "abced"
Output: false

Constraints:
1 <= s.length, goal.length <= 100
s and goal consist of lowercase English letters.
*/

public class _796_RotateString {

    //	Runtime: 0 ms, faster than 100.00% & Memory Usage: 36.6 MB, less than 96.90%
    public boolean rotateString(String s, String goal) {
        if (s.length() == 1 && goal.length() == 1) {
            return s.equals(goal);
        } else if (s.length() > goal.length()) {
            return false;
        } else {
            boolean startFound = false;
            int shift = 0;
            int i = 0, j = 0;
            while (i < s.length() && shift < goal.length()) {
                int goalPosition = j + shift;
                if (goalPosition >= goal.length()) {
                    goalPosition -= goal.length();
                }
                if (s.charAt(i) == goal.charAt(goalPosition)) {
                    if (i == s.length() - 1) {
                        return true;
                    }
                    j++;
                    i++;
                    if (!startFound) {
                        startFound = true;
                    }
                } else {
                    i = 0;
                    j = 0;
                    shift++;
                    if (startFound) {
                        startFound = false;
                    }
                }
            }
        }
        return false;
    }

}
