package com.deno4ka.LeetCode.algorithms.easy;

/*
We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.

Example:
Input: 28
Output: True
Explanation: 28 = 1 + 2 + 4 + 7 + 14

Note: The input number n will not exceed 100,000,000. (1e8)
*/

import java.util.ArrayList;
import java.util.List;

public class _507_PerfectNumber {

    // Runtime: 1401 ms, faster than 5.03% and Memory Usage: 33.9 MB, less than 5.88%
    public boolean checkPerfectNumber(int num) {
        List<Integer> positiveDivisors = new ArrayList<>();
        if (num < 6) return false;
        int divisor = num / 2;
        while (divisor > 0) {
            if (num % divisor == 0) {
                positiveDivisors.add(divisor);
            }
            divisor--;
        }
        return positiveDivisors.stream().mapToInt(Integer::intValue).sum() == num;
    }

    // best from leet.code -> cheat!!!
//	public boolean checkPerfectNumber(int num) {
//		final Set<Integer> perfectNums = new HashSet<>();
//		perfectNums.add(6);
//		perfectNums.add(28);
//		perfectNums.add(496);
//		perfectNums.add(8128);
//		perfectNums.add(33550336);
//		return perfectNums.contains(num);
//	}

}
