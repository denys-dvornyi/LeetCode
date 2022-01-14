package com.deno4ka.LeetCode.algorithms.easy;

/*
A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

Example 1:
Input: s = "(()())(())"
Output: "()()()"
Explanation:
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

Example 2:
Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation:
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

Example 3:
Input: s = "()()"
Output: ""
Explanation:
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".

Constraints:
1 <= s.length <= 10(5)
s[i] is either '(' or ')'.
s is a valid parentheses string.
*/

public class _1021_RemoveOutermostParentheses {

//	Runtime: 8 ms, faster than 34.20% & Memory Usage: 39.7 MB, less than 23.55%
	public String removeOuterParentheses(String s) {
		StringBuilder sb = new StringBuilder();
		int leftParentheses = 0;
		int rightParentheses = 0;
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			if (leftParentheses == 0 && rightParentheses == 0) {
				start = i;
			}
			if (s.charAt(i) == '(') {
				leftParentheses++;
			} else {
				rightParentheses++;
			}
			if (leftParentheses > 0 && rightParentheses > 0 && leftParentheses == rightParentheses) {
				if (leftParentheses > 1) {
					sb.append(s, start + 1, i);
				}
				leftParentheses = 0;
				rightParentheses = 0;
			}
		}
		if (leftParentheses > 1 && rightParentheses > 1 && leftParentheses == rightParentheses) {
			sb.append(s, start + 1, s.length());
		}
		return sb.toString();
	}

}
