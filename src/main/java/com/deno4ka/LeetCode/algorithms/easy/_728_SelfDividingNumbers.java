package com.deno4ka.LeetCode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/*
A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.
Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

Example 1:
Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

Example 2:
Input: left = 47, right = 85
Output: [48,55,66,77]

Constraints:
1 <= left <= right <= 10(4th)
*/

public class _728_SelfDividingNumbers {

    //	Runtime: 3 ms, faster than 42.00% & Memory Usage: 39.1 MB, less than 12.71%
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left < 1 || right > 10_000 || left > right) return result;
        for (int i = left; i <= right; i++) {
            boolean isContainZero = false;
            int size = 5; // number is equals or less than 10 in the 4th power, so it has maximum 5 digits
            int[] numbers = new int[size];
            int num = i;
            while (num > 0) {
                int module = num % 10;
                if (module == 0) {
                    isContainZero = true;
                    break;
                }
                numbers[--size] = module;
                num /= 10;
            }
            if (!isContainZero) {
                num = i;
                boolean isDivisible = true;
                while (size < 5) {
                    if (num % numbers[size++] != 0) {
                        isDivisible = false;
                        break;
                    }
                }
                if (isDivisible) result.add(num);
            }
        }
        return result;
    }

}
