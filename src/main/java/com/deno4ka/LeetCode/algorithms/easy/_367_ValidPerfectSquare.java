package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.
Note: Do not use any built-in library function such as sqrt.

Example 1:
Input: 16
Output: true

Example 2:
Input: 14
Output: false
*/

public class _367_ValidPerfectSquare {

    public _367_ValidPerfectSquare() {
        System.out.println(isPerfectSquare(0)); // false
        System.out.println(isPerfectSquare(1)); // true
        System.out.println(isPerfectSquare(16)); // true
        System.out.println(isPerfectSquare(14)); // false
        System.out.println(isPerfectSquare(2147483647)); // false
    }

    // (0ms/100%)
    public boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }
        int min = 1;
        int max = 46340; // maximum square root number for int value
        int midl = min + (max - min) / 2; // binary search
        long perfectSquare;
        do {
            perfectSquare = midl * midl;
            if (perfectSquare == num) {
                return true;
            } else if (perfectSquare < num) {
                min = midl + 1;
                midl = min + (max - min) / 2;
            } else if (perfectSquare > num) {
                max = midl - 1;
                midl = min + (max - min) / 2;
            }
        }
        while (min < max);
        perfectSquare = midl * midl;
        return perfectSquare == num;
    }

}