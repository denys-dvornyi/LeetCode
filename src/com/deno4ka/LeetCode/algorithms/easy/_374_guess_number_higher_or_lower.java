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
	}

	public int guessNumber(int n) {
		int min = 1;
		int max = Integer.MAX_VALUE;
		int midl;
		int result = super.guess(n);
		if (result == 0) {
			return n;
		} else if (result == -1) {
			max = n - 1;
			midl = min + (max - min) / 2;
			return guessNumber(midl);
		} else if (result == 1) {
			min = n + 1;
			midl = min + (max - min) / 2;
			return guessNumber(midl);
		}
		return n;
	}

}

class GuessGame {
	public static int GUESSED_NUMBER;

	public int guess(int num) {
		if (num > GUESSED_NUMBER) {
			return 1;
		} else if (num < GUESSED_NUMBER) {
			return -1;
		}
		return 0;
	}
}