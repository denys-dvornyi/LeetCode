package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a characters array letters that is sorted in non-decreasing order and a character target,
return the smallest character in the array that is larger than target.
Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"

Example 3:
Input: letters = ["c","f","j"], target = "d"
Output: "f"

Example 4:
Input: letters = ["c","f","j"], target = "g"
Output: "j"

Example 5:
Input: letters = ["c","f","j"], target = "j"
Output: "c"

Constraints:
2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.
*/

public class _744_FindSmallestLetterGreaterThanTarget {

//	Runtime: 0 ms, faster than 100.00% & Memory Usage: 39.3 MB, less than 55.26%
	public char nextGreatestLetter(char[] letters, char target) {
		if (letters == null || letters.length < 2) return target;
		if (target < letters[0] || target >= letters[letters.length - 1]) {
			return letters[0];
		}
		for (char letter : letters) {
			if (target < letter) {
				return letter;
			}
		}
		return letters[0];
	}

}
