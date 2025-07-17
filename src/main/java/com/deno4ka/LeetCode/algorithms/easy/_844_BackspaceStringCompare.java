package com.deno4ka.LeetCode.algorithms.easy;

/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:
Input: s = "a##c", t = "#a#c"
Output: true
Explanation: Both s and t become "c".

Example 4:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

Constraints:
1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.

Follow up: Can you solve it in O(n) time and O(1) space?
*/

public class _844_BackspaceStringCompare {

    //	Runtime: 0 ms, faster than 100.00% & Memory Usage: 37.2 MB, less than 73.85%
    public boolean backspaceCompare(String s, String t) {
        StringBuilder first = new StringBuilder();
        int backspaces = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) != '#') {
                if (backspaces == 0) {
                    first.append(s.charAt(i));
                } else {
                    backspaces--;
                }
            } else {
                backspaces++;
            }
        }
        backspaces = 0;
        StringBuilder second = new StringBuilder();
        for (int j = t.length() - 1; j > -1; j--) {
            if (t.charAt(j) != '#') {
                if (backspaces == 0) {
                    second.append(t.charAt(j));
                } else {
                    backspaces--;
                }
            } else {
                backspaces++;
            }
        }
        return first.toString().equals(second.toString());
    }

}
