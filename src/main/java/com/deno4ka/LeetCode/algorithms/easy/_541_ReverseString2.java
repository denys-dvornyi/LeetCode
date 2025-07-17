package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string.
If there are less than k characters left, reverse all of them.
If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.

Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
*/

public class _541_ReverseString2 {

    // Runtime: 2 ms, faster than 32.33% & Memory Usage: 37.3 MB, less than 100.00%
    public String reverseStr(String s, int k) {
        if (k == 0) return s;
        char[] chars = s.toCharArray();
        if (k > s.length()) {
            k = s.length();
        }
        for (int j = 0; j < chars.length; j += 2 * k) {
            int middle = 0;
            for (int i = j; i < j + k && middle < k / 2; i++, middle++) {
                if (k + j - middle - 1 > chars.length) {
                    k = chars.length - j;
                }
                char tmp = chars[Math.abs(k + j - middle - 1)];
                chars[Math.abs(k + j - middle - 1)] = chars[i];
                chars[i] = tmp;
            }
        }
        return new String(chars);
    }

}
