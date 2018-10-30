package com.deno4ka.LeetCode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/*
Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
For numbers which are multiples of both three and five output “FizzBuzz”.

Example:
n = 15,
Return:
["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
*/

public class _412_fizz_buzz {

	public _412_fizz_buzz() {
		System.out.println(fizzBuzz(15)); // ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
	}

	// (3ms/50.39%)
	public List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<>(n);
		final String FIZZ = "Fizz"; // %3
		final String BUZZ = "Buzz"; // %5
		final String FIZZ_BUZZ = "FizzBuzz"; // %3 && %5
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add(FIZZ_BUZZ);
			} else if (i % 3 == 0) {
				result.add(FIZZ);
			} else if (i % 5 == 0) {
				result.add(BUZZ);
			} else {
				result.add(String.valueOf(i));
			}
		}
		return result;
	}

}