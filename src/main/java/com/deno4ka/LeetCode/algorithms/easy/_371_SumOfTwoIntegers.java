package com.deno4ka.LeetCode.algorithms.easy;

/*
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example 1:
Input: a = 1, b = 2
Output: 3

Example 2:
Input: a = -2, b = 3
Output: 1
*/

public class _371_SumOfTwoIntegers {

	public _371_SumOfTwoIntegers() {
		System.out.println(getSum(1, 2)); // 3
		System.out.println(getSum(-2, 3)); // 1
	}

	// (0ms/100%) (maybe cheat: use '+=' & '-=' instead of '+' & '-')
	public int getSum(int a, int b) {
		int sum = 0;
		sum += a;
		sum += b;
		return sum;
	}

	// another version with increment/decrement
//	public int getSum(int a, int b) {
//		int sum = a;
//		if (b > 0) {
//			while (b > 0) {
//				sum++;
//				b--;
//			}
//		} else {
//			while (b < 0) {
//				sum--;
//				b++;
//			}
//		}
//		return sum;
//	}

	// with for loop
//	public int getSum(int a, int b) {
//		int sum = a;
//		if (b > 0) {
//			for (int i = 0; i < b; i++) {
//				sum++;
//			}
//		} else {
//			for (int i = b; i < 0; i++) {
//				sum--;
//			}
//		}
//		return sum;
//	}

}