package com.deno4ka.LeetCode.algorithms.easy;

/*
Count the number of prime numbers less than a non-negative number, n.

Example:
Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _204_count_primes {

	public _204_count_primes() {
		System.out.println(countPrimes(2)); // 0
		System.out.println(countPrimes(3)); // 1
		System.out.println(countPrimes(10)); // 4
		System.out.println(countPrimes(499979)); // 41537
	}

	// runtime: 25ms
	public int countPrimes(int n) {
		if (n < 2) {
			return 0;
		} else {
			boolean[] numbers = new boolean[n + 1];
			Arrays.fill(numbers, true);

			long cycleCounter = 0;

			for (int i = 2; i * i < n; i++) {
				if (numbers[i]) {
					for (int j = i; j+i < n + 1; j += i) {
						if (numbers[j + i]) {
							numbers[j + i] = false;
							cycleCounter++;
						}
					}
				}
			}

			int primesCounter = 0;
			for (int k = 2; k < n; k++) {
				if (numbers[k]) {
					primesCounter++;
				}
			}
			System.out.println("cycleCounter: " + cycleCounter); // 5638156
			return primesCounter;
		}
	}

	// v_1.0 Time Limit Exceeded
//	public int countPrimes(int n) {
//		if (n < 2) {
//			return 0;
//		} else {
//			List<Integer> primes = new ArrayList<>();
//			for (int i = 2; i < n; i++) {
//				boolean isPrime = true;
//				for (int j = i-1; j > 1; j--) {
//					if (i % j == 0) {
//						isPrime = false;
//					}
//				}
//				if (isPrime) {
//					primes.add(i);
//				}
//			}
//			return primes.size();
//		}
//	}

}