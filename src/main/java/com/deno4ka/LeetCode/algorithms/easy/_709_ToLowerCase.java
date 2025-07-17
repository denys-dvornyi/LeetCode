package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1:
Input: s = "Hello"
Output: "hello"

Example 2:
Input: s = "here"
Output: "here"

Example 3:
Input: s = "LOVELY"
Output: "lovely"

Constraints:
1 <= s.length <= 100
s consists of printable ASCII characters.
*/

public class _709_ToLowerCase {

    final int A_CHAR = 'A';
    final int Z_CHAR = 'Z';
    final int DIFF = (int) 'a' - (int) 'A';

    //	Runtime: 0 ms, faster than 100.00% & Memory Usage: 37.6 MB, less than 39.97%
    public String toLowerCase(String s) {
        if (s == null || s.isEmpty()) return s;
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if ((int) c >= A_CHAR && (int) c <= Z_CHAR) {
                sb.append((char) (((int) c) + DIFF));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
