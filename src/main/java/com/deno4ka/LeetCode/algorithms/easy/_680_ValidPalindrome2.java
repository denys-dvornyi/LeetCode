package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3:
Input: s = "abc"
Output: false

Constraints:
1 <= s.length <= 105
s consists of lowercase English letters.
*/

public class _680_ValidPalindrome2 {

    //	v4 Runtime: 15 ms, faster than 13.22% & Memory Usage: 51.8 MB, less than 18.90%
    public boolean validPalindrome(String s) {
        if (s == null || s.isEmpty()) return false;
        if (s.length() == 2) return true;
        int leftShift = 0;
        int rightShift = 0;
        boolean leftShiftFailed = false;
        boolean rightShiftFailed = false;
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i + leftShift) != s.charAt(length - 1 - i - rightShift)) {
                leftShift = 1;
                if (s.charAt(i + leftShift) != s.charAt(length - 1 - i - rightShift)) {
                    leftShiftFailed = true;
                    leftShift = 0;
                    break;
                }
            }
        }
        if (!leftShiftFailed) return true;
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i + leftShift) != s.charAt(length - 1 - i - rightShift)) {
                rightShift = 1;
                if (s.charAt(i + leftShift) != s.charAt(length - 1 - i - rightShift)) {
                    rightShiftFailed = true;
                    break;
                }
            }
        }
        return !rightShiftFailed;
    }

//	v3 Runtime: 20 ms, faster than 7.74% & Memory Usage: 53.3 MB, less than 5.05
//	public boolean validPalindrome(String s) {
//		if (s == null || s.isEmpty()) return false;
//		if (s.length() == 2) return true;
//		char[] chars = s.toCharArray();
//		int leftShift = 0;
//		int rightShift = 0;
//		boolean leftShiftFailed = false;
//		boolean rightShiftFailed = false;
//		int length = chars.length;
//		for (int i = 0; i < length / 2; i++) {
//			if (chars[i + leftShift] != chars[length - 1 - i - rightShift]) {
//				leftShift = 1;
//				if (chars[i + leftShift] != chars[length - 1 - i - rightShift]) {
//					leftShiftFailed = true;
//					leftShift = 0;
//					break;
//				}
//			}
//		}
//		if (!leftShiftFailed) return true;
//		for (int i = 0; i < length / 2; i++) {
//			if (chars[i + leftShift] != chars[length - 1 - i - rightShift]) {
//				rightShift = 1;
//				if (chars[i + leftShift] != chars[length - 1 - i - rightShift]) {
//					rightShiftFailed = true;
//					rightShift = 0;
//					break;
//				}
//			}
//		}
//		return !rightShiftFailed;
//	}

//	v2 Time Limit Exceeded (389 / 467 test cases passed)
//	public boolean validPalindrome(String s) {
//		if (s == null || s.isEmpty()) return false;
//		if (s.length() == 2) return true;
//		char[] chars = s.toCharArray();
//		for (int i = 0; i < chars.length; i++) {
//			char[] subarray = new char[chars.length - 1];
//			int shift = 0;
//			for (int j = 0; j < subarray.length; j++) {
//				if (j == i) shift = 1;
//				subarray[j] = chars[j + shift];
//			}
//			boolean isPalindrome = true;
//			for (int k = 0; k < subarray.length / 2; k++) {
//				if (subarray[k] != subarray[subarray.length - 1 - k]) {
//					isPalindrome = false;
//					break;
//				}
//			}
//			if (isPalindrome) return true;
//		}
//		return false;
//	}

//  v1 Time Limit Exceeded (376 / 467 test cases passed)
//	public boolean validPalindrome(String s) {
//		if (s == null || s.isEmpty()) return false;
//		if (s.length() == 2) return true;
//		char[] chars = s.toCharArray();
//		for (int i = 0; i < chars.length; i++) {
//			char[] subarray = new char[chars.length - 1];
//			int shift = 0;
//			for (int j = 0; j < subarray.length; j++) {
//				if (j == i) shift = 1;
//				subarray[j] = chars[j + shift];
//			}
//			if (new String(subarray).equals(new StringBuilder(new String(subarray)).reverse().toString())) {
//				return true;
//			}
//		}
//		return false;
//	}

//	best from leet.code (4ms)
//	public boolean validPalindrome(String s) {
//		int left = 0;
//		int right = s.length() - 1;
//
//		while (left < right && s.charAt(left) == s.charAt(right)) {
//			left++;
//			right--;
//		}
//
//		if (left >= right || isPal(s, left + 1, right) || isPal(s, left, right - 1)) return true;
//		return false;
//	}
//
//	private boolean isPal(String s, int left, int right) {
//		while (left < right && s.charAt(left) == s.charAt(right)) {
//			left++;
//			right--;
//		}
//		return left >= right;
//	}

}
