package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a column title as appear in an Excel sheet, return its corresponding column number.
For example:
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
    ...

Example 1:
Input: "A"
Output: 1

Example 2:
Input: "AB"
Output: 28

Example 3:
Input: "ZY"
Output: 701
*/

public class _171_ExcelSheetColumnNumber {

    public _171_ExcelSheetColumnNumber() {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }

    public int titleToNumber(String s) {
        final int OFFSET = 64;
        int[] ints = new StringBuilder(s).reverse().chars().toArray();
        int result = 0;
        long index = 1;
        for (int i = 0; i < ints.length; i++) {
            result += (ints[i] - OFFSET) * index;
            index *= 26;
        }
        return result;
    }

    // best from leet.code
//	public int titleToNumber(String s) {
//		int num = 0;
//		int exp = 1;
//
//		for(int i = s.length() - 1; i >= 0; --i){
//			num += (s.charAt(i) - 'A' + 1) * exp;
//			exp *= 26;
//		}
//
//		return num;
//	}

}