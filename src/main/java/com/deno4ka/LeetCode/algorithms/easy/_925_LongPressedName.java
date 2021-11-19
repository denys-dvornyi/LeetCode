package com.deno4ka.LeetCode.algorithms.easy;

/*
Your friend is typing his name into a keyboard.
Sometimes, when typing a character `c`, the key might get long pressed, and the character will be typed 1 or more times.
You examine the typed characters of the keyboard.
Return `true` if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

Example 1:
Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.

Example 2:
Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.

Example 3:
Input: name = "leelee", typed = "lleeelee"
Output: true

Example 4:
Input: name = "laiden", typed = "laiden"
Output: true
Explanation: It's not necessary to long press any character.

Constraints:
1 <= name.length <= 1000
1 <= typed.length <= 1000
name and typed contain only lowercase English letters.
*/

public class _925_LongPressedName {

	public boolean isLongPressedName(String name, String typed) {
		if (name.equals(typed)) return true;
		if (name.length() > typed.length()) return false;

		return false;
	}

}
