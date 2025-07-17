package com.deno4ka.LeetCode.algorithms.easy;

/*
The array-form of an integer num is an array representing its digits in left to right order.
For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Example 1:
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234

Example 2:
Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455

Example 3:
Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021

Example 4:
Input: num = [9,9,9,9,9,9,9,9,9,9], k = 1
Output: [1,0,0,0,0,0,0,0,0,0,0]
Explanation: 9999999999 + 1 = 10000000000

Constraints:
1 <= num.length <= 10(4)
0 <= num[i] <= 9
num does not contain any leading zeros except for the zero itself.
1 <= k <= 10(4)
*/

import java.util.ArrayList;
import java.util.List;

//  not easy...
public class _989_AddToArrayFormOfInteger {

    //	removed Stream of int[] to List (two times faster)
//	v.2 Runtime: 3 ms, faster than 93.33% & Memory Usage: 40.2 MB, less than 90.51%
    public List<Integer> addToArrayForm(int[] num, int k) {
        int[] kNums = new int[5]; // k <= 10(4)
        int kPointer = kNums.length - 1;
        while (k > 0) {
            kNums[kPointer--] = k % 10;
            k /= 10;
        }
        kPointer++;
        if (kPointer != 0) {
            int[] tmp = new int[5 - kPointer];
            System.arraycopy(kNums, kPointer, tmp, 0, kNums.length - kPointer);
            kNums = tmp;
        }
        int resultLength = Math.max(num.length, kNums.length);
        int[] result = new int[resultLength];
        int arrayOverflow = 0;

        int numDiff = result.length - num.length;
        int kDiff = result.length - kNums.length;

        for (int i = result.length - 1; i >= 0; i--) {
            int tmp;
            if (num.length > i - numDiff && kNums.length > i - kDiff) {
                if (i - numDiff >= 0 && i - kDiff >= 0) {
                    tmp = num[i - numDiff] + kNums[i - kDiff] + arrayOverflow;
                } else if (i - numDiff < 0 && i - kDiff >= 0) {
                    tmp = kNums[i - kDiff] + arrayOverflow;
                } else if (i - numDiff >= 0 && i - kDiff < 0) {
                    tmp = num[i - numDiff] + arrayOverflow;
                } else {
                    tmp = arrayOverflow;
                }
            } else {
                tmp = arrayOverflow;
            }
            arrayOverflow = tmp / 10;
            if (tmp > 9) {
                tmp %= 10;
            }
            result[i] = tmp;
        }

        List<Integer> resultList;
        if (arrayOverflow > 0) {
            resultList = new ArrayList<>(resultLength + 1);
            resultList.add(arrayOverflow);
        } else {
            resultList = new ArrayList<>(resultLength);
        }
        for (int n : result) {
            resultList.add(n);
        }
        return resultList;
    }

//  v1. Runtime: 6 ms, faster than 50.92% & Memory Usage: 40.3 MB, less than 82.00%
//	public List<Integer> addToArrayForm(int[] num, int k) {
//		int[] kNums = new int[5]; // k <= 10(4)
//		int kPointer = kNums.length - 1;
//		while (k > 0) {
//			kNums[kPointer--] = k % 10;
//			k /= 10;
//		}
//		kPointer++;
//		if (kPointer != 0) {
//			int[] tmp = new int[5 - kPointer];
//			System.arraycopy(kNums, kPointer, tmp, 0, kNums.length - kPointer);
//			kNums = tmp;
//		}
//		int resultLength = Math.max(num.length, kNums.length);
//		int[] result = new int[resultLength];
//		int arrayOverflow = 0;
//
//		int numDiff = result.length - num.length;
//		int kDiff = result.length - kNums.length;
//
//		for (int i = result.length - 1; i >= 0; i--) {
//			int tmp;
//			if (num.length > i - numDiff && kNums.length > i - kDiff) {
//				if (i - numDiff >= 0 && i - kDiff >= 0) {
//					tmp = num[i - numDiff] + kNums[i - kDiff] + arrayOverflow;
//				} else if (i - numDiff < 0 && i - kDiff >= 0) {
//					tmp = kNums[i - kDiff] + arrayOverflow;
//				} else if (i - numDiff >= 0 && i - kDiff < 0) {
//					tmp = num[i - numDiff] + arrayOverflow;
//				} else {
//					tmp = arrayOverflow;
//				}
//			} else {
//				tmp = arrayOverflow;
//			}
//			arrayOverflow = tmp / 10;
//			if (tmp > 9) {
//				tmp %= 10;
//			}
//			result[i] = tmp;
//		}
//
//		if (arrayOverflow > 0) {
//			int[] tmp = new int[result.length + 1];
//			System.arraycopy(result, 0, tmp, 1, result.length);
//			result = tmp;
//			result[0] = arrayOverflow;
//		}
//		return Arrays.stream(result).boxed().collect(Collectors.toList());
//	}

}
