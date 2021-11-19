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

//	Runtime: 0 ms, faster than 100.00% & Memory Usage: 37.2 MB, less than 54.26%
	public boolean isLongPressedName(String name, String typed) {
		if (name.equals(typed)) return true;
		if (name.length() > typed.length()) return false;
		int namePosition = 0;
		int typedPosition = 0;
		char prevNameChar = name.charAt(namePosition++);
		char prevTypedChar = typed.charAt(typedPosition++);
		if (prevNameChar != prevTypedChar) return false;
		while (namePosition < name.length() && typedPosition < typed.length()) {
			if (name.charAt(namePosition) == typed.charAt(typedPosition)) {
				prevNameChar = name.charAt(namePosition++);
				prevTypedChar = typed.charAt(typedPosition++);
			} else {
				if (prevNameChar == typed.charAt(typedPosition)) {
					typedPosition++;
				} else {
					return false;
				}
			}
		}
		if (namePosition < name.length()) {
			return false;
		}
		while (typedPosition < typed.length()) {
			if (typed.charAt(typedPosition++) != prevTypedChar) {
				return false;
			}
		}
		return true;
	}

}
