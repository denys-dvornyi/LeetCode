package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
Note:
All letters in hexadecimal (a-f) must be in lowercase.
The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0';
otherwise, the first character in the hexadecimal string will not be the zero character.
The given number is guaranteed to fit within the range of a 32-bit signed integer.
You must not use any method provided by the library which converts/formats the number to hex directly.

Example 1:
Input: 26
Output: "1a"

Example 2:
Input: -1
Output: "ffffffff"
*/

public class _405_convert_a_number_to_hexadecimal {

	public _405_convert_a_number_to_hexadecimal() {
		System.out.println(toHex(16)); // "10"
		System.out.println(toHex(26)); // "1a"
		System.out.println(toHex(256)); // "100"
		System.out.println(toHex(111111)); // "1b207"
		System.out.println(toHex(-1)); // "ffffffff"
		System.out.println(toHex(-16)); // "fffffff0"
		System.out.println(toHex(-17)); // "ffffffef"
		System.out.println(toHex(-256)); // "ffffff00"
	}

	// (4ms/100%)
	public String toHex(int num) {
		if (num == 0) return "0";
		else if (num > 0) {
			int maxHex = (int)Math.pow(16, 7);
			StringBuilder intToHex = new StringBuilder();
			while (num >= 0 && maxHex > 0) {
				if (maxHex > num && num != 0) {
					maxHex /= 16;
					if (intToHex.length() > 0) {
						intToHex.append("0");
					}
				} else {
					int hexPrefix = num / maxHex;
					num = num - hexPrefix * maxHex;
					intToHex.append(intToHex(hexPrefix));
					maxHex /= 16;
				}
			}
			return intToHex.toString();
		} else {
			// TODO: implement 'Two's complement' method
			long maxHex = (long)Math.pow(16, 8);
			StringBuilder intToHex = new StringBuilder();
			long unsignedDecimal = maxHex + num;
			while (unsignedDecimal >= 0 && maxHex > 0) {
				if (maxHex > unsignedDecimal && unsignedDecimal != 0) {
					maxHex /= 16;
					if (intToHex.length() > 0) {
						intToHex.append("0");
					}
				} else {
					int hexPrefix = (int)(unsignedDecimal / maxHex);
					unsignedDecimal = unsignedDecimal - hexPrefix * maxHex;
					intToHex.append(intToHex(hexPrefix));
					maxHex /= 16;
				}
			}
			return intToHex.toString();
		}
	}

	private String intToHex(int digit) {
		String result = "";
		if (digit < 10) {
			result = String.valueOf(digit);
		} else {
			switch (digit) {
				case 10: result = "a"; break;
				case 11: result = "b"; break;
				case 12: result = "c"; break;
				case 13: result = "d"; break;
				case 14: result = "e"; break;
				case 15: result = "f"; break;
			}
		}
		return result;
	}

	// best from leetcode using bit operators
	// We need to use '>>>' to handle negative number
	// MIN_VALUE:   10000000000000000000000000000000
	// >> 1:        11000000000000000000000000000000
	// >>>1:        01000000000000000000000000000000
//	public String toHex(int num) {
//		char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
//		if(num == 0)
//			return "0";
//		String result = "";
//		while(num != 0){
//			result = map[(num & 15)] + result;
//			num = (num >>> 4);
//		}
//		return result;
//	}

}