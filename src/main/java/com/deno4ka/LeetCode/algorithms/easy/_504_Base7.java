package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"

Example 2:
Input: -7
Output: "-10"

Note: The input will be in range of [-1e7, 1e7].
*/

public class _504_Base7 {

    // Runtime: 1 ms, faster than 96.47% and Memory Usage: 34.2 MB, less than 100.00%
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder base7Result = new StringBuilder();
        int[] base7List = new int[9];
        int base7 = 1;
        int cursor = 0;
        while (base7 < 10_000_000) {
            base7List[cursor++] = base7;
            base7 *= 7;
        }
        boolean isNegative = false;
        if (num < 0) {
            num *= -1;
            base7Result.append("-");
            isNegative = true;
        }
        for (int i = base7List.length - 1; i >= 0; i--) {
            if (num >= base7List[i]) {
                int module = num / base7List[i];
                base7Result.append(module);
                num -= base7List[i] * module;
            } else {
                if (!isNegative && base7Result.length() > 0 || isNegative && base7Result.length() > 1) {
                    base7Result.append("0");
                }
            }
        }
        return base7Result.toString();
    }

}
