package com.deno4ka.LeetCode.algorithms.easy;

/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer,
 replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1
 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 Those numbers for which this process ends in 1 are happy numbers.
Example:

Input: 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
*/

import java.util.HashSet;
import java.util.Set;

public class _202_happy_number {

	private Set<Integer> checkedNumbers = new HashSet<>();

	public _202_happy_number() {
//		System.out.println(isHappy(19));
//		System.out.println(isHappy(9));
//		System.out.println(isHappy(537));
	}

	public boolean isHappy(int n) {
		try {
			if (checkedNumbers.contains(n)) {
				return false;
			} else {
				checkedNumbers.add(n);
			}
			if (n < 0) {
				return false;
			} else {
				int result = 0;
				do {
					int module = n % 10;
					result += (int) Math.pow(module, 2);
					n = (n - module) / 10 ;
				}
				while (n > 0);
				if (result == 1) {
					return true;
				} else {
					return isHappy(result);
				}
			}
		} catch (StackOverflowError e) {
			e.printStackTrace();
			return false;
		}
	}

}