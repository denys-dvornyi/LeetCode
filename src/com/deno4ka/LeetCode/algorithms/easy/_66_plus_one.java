package com.deno4ka.LeetCode.algorithms.easy;

public class _66_plus_one {

    public _66_plus_one() {
        printArray(plusOne(new int[] {1,2,3})); //[1,2,4]
        printArray(plusOne(new int[] {9,9,9})); //[9,9,9]
    }

    private int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return null;
        int lastDigit = digits.length - 1;
        digits[lastDigit]++;
        while (digits[lastDigit] > 9 ) {
            digits[lastDigit] = 0;
            lastDigit--;
            if (lastDigit < 0) {
                int[] tmp = new int[digits.length + 1];
                tmp[0] = 1;
                for (int i = 1; i < tmp.length; i++) {
                    tmp[i] = digits[i-1];
                }
                return tmp;
            }
            digits[lastDigit]++;
        }
        return digits;
    }

    private void printArray(int[] digits) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < digits.length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(digits[i]);
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

}