package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array of characters, compress it in-place.
The length after compression must always be smaller than or equal to the original array.
Every element of the array should be a character (not int) of length 1.
After you are done modifying the input array in-place, return the new length of the array.

Follow up:
Could you solve it using only O(1) extra space?

Example 1:
Input:
['a','a','b','b','c','c','c']
Output:
Return 6, and the first 6 characters of the input array should be: ['a','2','b','2','c','3']
Explanation:
'aa' is replaced by 'a2'. 'bb' is replaced by 'b2'. 'ccc' is replaced by 'c3'.

Example 2:
Input:
['a']
Output:
Return 1, and the first 1 characters of the input array should be: ['a']
Explanation:
Nothing is replaced.

Example 3:
Input:
['a','b','b','b','b','b','b','b','b','b','b','b','b']
Output:
Return 4, and the first 4 characters of the input array should be: ['a','b','1','2'].
Explanation:
Since the character 'a' does not repeat, it is not compressed. 'bbbbbbbbbbbb' is replaced by 'b12'.
Notice each digit has it's own entry in the array.

Note:
All characters have an ASCII value in [35, 126].
1 <= len(chars) <= 1000.
*/

public class _443_StringCompression {

	public _443_StringCompression() {
//		StringBuilder sb = new StringBuilder();
//		int counter = 0;
//		for (int i = 35; i <= 126; i++) {
//			sb.append((char)i).append(" ");
//			counter++;
//		}
//		System.out.println(sb.toString() + counter);

//		System.out.println(compress(null));
//		System.out.println(compress(new char[]{}));
//		System.out.println(compress(new char[]{'a','a','b','b','c','c','c'})); // 6 ['a','2','b','2','c','3']
//		System.out.println(compress(new char[]{'a'})); // 1 ['a']
//		System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'})); // 4 ['a','b','1','2']
//		System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'})); // 4 ['a','b','1','2']
	}

	// (4ms/100%)
	public int compress(char[] chars) {
		if (chars == null || chars.length == 0) {
			return 0;
		} else if (chars.length == 1) {
			return 1;
		} else {
			int pointer = 0;
			char prevChar = chars[0];
			int counter = 1;
			for (int i = 1; i < chars.length; i++) {
				char currentChar = chars[i];
				if (currentChar == prevChar) {
					counter++;
				} else {
					pointer = compressAndGetPosition(chars, pointer, counter, prevChar);
					counter = 1;
				}
				prevChar = currentChar;
			}
			pointer = compressAndGetPosition(chars, pointer, counter, prevChar);
			return pointer;
		}
	}

	private int compressAndGetPosition(char[] chars, int pointer, int counter, char prevChar) {
		if (counter == 1) {
			chars[pointer++] = prevChar;
		} else if (counter < 10) {
			chars[pointer++] = prevChar;
			chars[pointer++] = Character.forDigit(counter, 10);
		} else {
			chars[pointer++] = prevChar;
			while (counter > 9) {
				int digit = counter / 10;
				chars[pointer++] = Character.forDigit(digit, 10);
				counter -= digit * 10;
			}
			chars[pointer++] = Character.forDigit(counter, 10);
		}
		return pointer;
	}

	// not in-place Wrong Answer Output:["a","a","b","b","c","c"] Expected:["a","2","b","2","c","3"]
//	public int compress(char[] chars) {
//		if (chars == null || chars.length == 0) {
//			return 0;
//		} else if (chars.length == 1) {
//			return 1;
//		} else {
//			int result = 0;
//			char prevChar = chars[0];
//			int counter = 1;
//			for (int i = 1; i < chars.length; i++) {
//				char pointer = chars[i];
//				if (pointer == prevChar) {
//					counter++;
//				} else {
//					result += calcSymbols(counter);
//					counter = 1;
//				}
//				prevChar = pointer;
//			}
//			result += calcSymbols(counter);
//			return result;
//		}
//	}

//	private int calcSymbols(int counter) {
//		if (counter == 1) {
//			return 1;
//		} else if (counter < 10) {
//			return 2;
//		} else {
//			int digits = 1;
//			while (counter > 9) {
//				counter /= 10;
//				digits++;
//			}
//			return digits + 1;
//		}
//	}

}