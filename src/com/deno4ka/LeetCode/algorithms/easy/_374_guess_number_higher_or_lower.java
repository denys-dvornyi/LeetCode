package com.deno4ka.LeetCode.algorithms.easy;

/*
We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked.
Every time you guess wrong, I'll tell you whether the number is higher or lower.
You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!

Example :
Input: n = 10, pick = 6
Output: 6

The guess API is defined in the parent class GuessGame.
@param num, your guess
@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
int guess(int num);
*/

public class _374_guess_number_higher_or_lower extends GuessGame {

	public _374_guess_number_higher_or_lower() {
		GUESSED_NUMBER = 6;
		System.out.println(guessNumber(10)); // 6
		GUESSED_NUMBER = 1;
		System.out.println(guessNumber(3)); // 1
	}

	// (1ms/37.56%) using binary search
	public int guessNumber(int n) {
		int min = 1;
		int max = n;
		int midl = 0;
		int result;
		while (min <= max) {
			midl = min + (max - min) / 2;
			result = super.guess(midl);
			if (result == 0) {
				return midl;
			}
			if (result == -1) {
				max = midl - 1;
			} else if (result == 1) {
				min = midl + 1;
			}
		}
		return midl;
	}



}

class GuessGame {
	public static int GUESSED_NUMBER;

	public int guess(int num) {
		if (num > GUESSED_NUMBER) {
			return -1;
		} else if (num < GUESSED_NUMBER) {
			return 1;
		}
		return 0;
	}
}