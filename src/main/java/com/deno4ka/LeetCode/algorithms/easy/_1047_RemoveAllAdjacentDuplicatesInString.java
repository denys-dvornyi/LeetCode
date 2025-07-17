package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given a string s consisting of lowercase English letters.
A duplicate removal consists of choosing two adjacent and equal letters and removing them.
We repeatedly make duplicate removals on s until we no longer can.
Return the final string after all such duplicate removals have been made.
It can be proven that the answer is unique.

Example 1:
Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

Example 2:
Input: s = "azxxzy"
Output: "ay"

Constraints:
1 <= s.length <= 10(5)
s consists of lowercase English letters.
*/

import java.util.Stack;
import java.util.stream.Collectors;

public class _1047_RemoveAllAdjacentDuplicatesInString {

    //	Runtime: 65 ms, faster than 21.13% & Memory Usage: 58.8 MB, less than 15.05%
    public String removeDuplicates(String s) {
        if (s.length() == 1) return s;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty() && s.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }

        }
        return stack.stream().map(Object::toString).collect(Collectors.joining());
    }

//	best from leet.code 3ms
//	public String removeDuplicates(String s) {
//		if (s.length() == 1) return s;
//		char[] chars = s.toCharArray();
//		int cursor = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (cursor > 0 && chars[cursor - 1] ==  chars[i]) {
//				cursor--;
//			} else {
//				chars[cursor++] = chars[i];
//			}
//
//		}
//		return new String(chars, 0, cursor);
//	}

}
