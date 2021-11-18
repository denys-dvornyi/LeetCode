package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string s, reverse the string according to the following rules:
All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1:
Input: s = "ab-cd"
Output: "dc-ba"

Example 2:
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

Example 3:
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

Constraints:
1 <= s.length <= 100
s consists of characters with ASCII values in the range [33, 122].
s does not contain '\"' or '\\'.
*/

public class _917_ReverseOnlyLetters {

//	Runtime: 0 ms, faster than 100.00% & Memory Usage: 37.2 MB, less than 81.28%
	public String reverseOnlyLetters(String s) {
		if (s.length() < 2) return s;
		char[] symbols = s.toCharArray();
		int begin = 0;
		int end = symbols.length - 1;
		while (begin <= end) {
			if ( !( (symbols[begin] >= 'a' && symbols[begin] <= 'z') || (symbols[begin] >= 'A' && symbols[begin] <= 'Z')) ) {
				begin++; // skip reverse because NOT a letter
			} else if ( !( (symbols[end] >= 'a' && symbols[end] <= 'z') || (symbols[end] >= 'A' && symbols[end] <= 'Z')) ) {
				end--; // skip reverse because NOT a letter
			} else {
				if (begin != end) { // swap symbols because they are both letters
					char tmp = symbols[begin];
					symbols[begin] = symbols[end];
					symbols[end] = tmp;
				}
				begin++;
				end--;
			}
		}
		return new String(symbols);
	}

}
