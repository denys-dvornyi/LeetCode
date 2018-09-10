package com.deno4ka.LeetCode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 For example:
 1 -> A
 2 -> B
 3 -> C
 ...
 26 -> Z
 27 -> AA
 28 -> AB
 ...

 Example 1:
 Input: 1
 Output: "A"

 Example 2:
 Input: 28
 Output: "AB"

 Example 3:
 Input: 701
 Output: "ZY"
 */

public class _168_excel_sheet_column_title {

	public _168_excel_sheet_column_title() {
//		System.out.println(convertToTitle(1) + " = A");
//		System.out.println(convertToTitle(24) + " = X");
//		System.out.println(convertToTitle(25) + " = Y");
//		System.out.println(convertToTitle(26) + " = Z");
//		System.out.println(convertToTitle(27) + " = AA");
//		System.out.println(convertToTitle(28) + " = AB");
//		System.out.println(convertToTitle(29) + " = AC");
//		System.out.println(convertToTitle(50) + " = AX");
//		System.out.println(convertToTitle(51) + " = AY");
//		System.out.println(convertToTitle(52) + " = AZ");
//		System.out.println(convertToTitle(53) + " = BA");
//		System.out.println(convertToTitle(78) + " = BZ");
//		System.out.println(convertToTitle(79) + " = CA");
//		System.out.println(convertToTitle(701) + " = ZY");
//		System.out.println(convertToTitle(702) + " = ZZ");
//		System.out.println(convertToTitle(703) + " = AAA");
//		System.out.println(convertToTitle(17602) + " = YZZ");
//		System.out.println(convertToTitle(18278) + " = ZZZ");
		System.out.println(convertToTitle(1000000001) + " = CFDGSXM");
	}

	// ASCII code A-Z 065-090
	public String convertToTitle(int n) {
		final int ASCII_CODE_A = 65;
		StringBuilder result = new StringBuilder();
		final int capacity = 26;
		int index = 0;
		List<Long> columns = new ArrayList<>();
		columns.add(1L);
		long sum = capacity;
		while (n > sum) {
			columns.add(columns.get(index) * capacity);
			index++;
			sum += columns.get(index) * capacity;
		}
		int[] chars = new int[index + 1];
		while (index >= 0) {
			int ch = n / columns.get(index).intValue();
			chars[index] = ch;
			n -= ch * columns.get(index);
			index--;
		}
		boolean zeroFound = true;
		while (zeroFound) {
			zeroFound = false;
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] <= 0) {
					zeroFound = true;
					chars[i] = chars[i] + capacity;
					chars[i + 1] = chars[i + 1] - 1;
				}
			}
		}
		for (int j = chars.length - 1; j >= 0; j--) {
			result.append((char) (ASCII_CODE_A + chars[j] - 1));
		}
		return result.toString();
	}

	// best from leet.code
//	public String convertToTitle(int n) {
//		StringBuilder res = new StringBuilder();
//		while(n>0){
//			res.append((n%26) != 0 ? (char)('A'- 1 + (n%26)) : (char)('Z'));
//			n= (n-1)/26;
//		}
//		return res.reverse().toString();
//	}

}