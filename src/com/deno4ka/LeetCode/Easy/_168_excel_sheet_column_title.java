package com.deno4ka.LeetCode.Easy;

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
		System.out.println(convertToTitle(52) + " = AZ");
//		System.out.println(convertToTitle(53) + " = BA");
//		System.out.println(convertToTitle(78) + " = BZ");
//		System.out.println(convertToTitle(79) + " = CA");
//		System.out.println(convertToTitle(701) + " = ZY");
//		System.out.println(convertToTitle(702) + " = ZZ");
//		System.out.println(convertToTitle(703) + " = AAA");
	}

	// ASCII code A-Z 065-090
	public String convertToTitle(int n) {
		final int ASCII_CODE_A = 65;
		final int ASCII_CODE_Z = 90;
		StringBuilder result = new StringBuilder();
		if (n < 27) {
			result.append((char)(ASCII_CODE_A + n - 1));
		} else {
			int col = 0;
			do {
				int column = n % 26;
				if (col == 0) {
					result.insert(0, (char)(ASCII_CODE_A + column - 1));
					n -= column;
				} else {
					result.insert(0, (char)(ASCII_CODE_A + column));
					n = 26 * column;
				}
				col++;
			} while (n > 0);
		}
		return result.toString();
	}

}

//		if (n < 27) {
//			result = new char[1];
//			result[0] = (char)(ASCII_CODE + n);
//		} else {
//			result = new char[2];
//			int column = n % 26;
//			if (column == 0) {
//				result[0] = (char) (ASCII_CODE - 1 + (n / 26));
//				result[1] = (char) (ASCII_CODE + 26);
//			} else {
//				result[0] = (char) (ASCII_CODE + (n / 26));
//				result[1] = (char) (ASCII_CODE + column);
//			}