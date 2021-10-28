package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string licensePlate and an array of strings words, find the shortest completing word in words.
A completing word is a word that contains all the letters in licensePlate.
Ignore numbers and spaces in licensePlate, and treat letters as case insensitive.
If a letter appears more than once in licensePlate, then it must appear in the word the same number of times or more.
For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case), and 'c' twice.
Possible completing words are "abccdef", "caaacab", and "cbca".
Return the shortest completing word in words. It is guaranteed an answer exists.
If there are multiple shortest completing words, return the first one that occurs in words.

Example 1:
Input: licensePlate = "1s3 PSt", words = ["step","steps","stripe","stepple"]
Output: "steps"
Explanation: licensePlate contains letters 's', 'p', 's' (ignoring case), and 't'.
"step" contains 't' and 'p', but only contains 1 's'.
"steps" contains 't', 'p', and both 's' characters.
"stripe" is missing an 's'.
"stepple" is missing an 's'.
Since "steps" is the only word containing all the letters, that is the answer.

Example 2:
Input: licensePlate = "1s3 456", words = ["looks","pest","stew","show"]
Output: "pest"
Explanation: licensePlate only contains the letter 's'. All the words contain 's', but among these "pest", "stew", and "show" are shortest. The answer is "pest" because it is the word that appears earliest of the 3.

Example 3:
Input: licensePlate = "Ah71752", words = ["suggest","letter","of","husband","easy","education","drug","prevent","writer","old"]
Output: "husband"

Example 4:
Input: licensePlate = "OgEu755", words = ["enough","these","play","wide","wonder","box","arrive","money","tax","thus"]
Output: "enough"

Example 5:
Input: licensePlate = "iMSlpe4", words = ["claim","consumer","student","camera","public","never","wonder","simple","thought","use"]
Output: "simple"

Constraints:
1 <= licensePlate.length <= 7
licensePlate contains digits, letters (uppercase or lowercase), or space ' '.
1 <= words.length <= 1000
1 <= words[i].length <= 15
words[i] consists of lower case English letters.
*/

import java.util.Arrays;

public class _748_ShortestCompletingWord {

//	Runtime: 5 ms, faster than 70.24% & Memory Usage: 39.3 MB, less than 84.45%
	public String shortestCompletingWord(String licensePlate, String[] words) {
		char[] licensePlateLetters = new char[licensePlate.length()];
		int licencePlateLettersCount = 0;
		final int DIFF_BETWEEN_UPPERCASE_AND_LOWERCASE = 'a' - 'A';
		for (char c : licensePlate.toCharArray()) {
			if ((c >= 'a' && c <= 'z')) {
				licensePlateLetters[licencePlateLettersCount++] = c;
			} else if ((c >= 'A' && c <= 'Z')) {
				licensePlateLetters[licencePlateLettersCount++] = (char) ((int) c + DIFF_BETWEEN_UPPERCASE_AND_LOWERCASE);
			}
		}
		licensePlateLetters = Arrays.copyOfRange(licensePlateLetters, 0, licencePlateLettersCount);
		Arrays.sort(licensePlateLetters);
		String shortestCompletingWord = null;
		for (String w : words) {
			char[] wordChars = w.toCharArray();
			Arrays.sort(wordChars);
			int i = 0;
			for (int j = 0; i < licensePlateLetters.length && j < wordChars.length; ) {
				if (licensePlateLetters[i] == wordChars[j]) {
					i++;
					j++;
				} else {
					j++;
				}
			}
			if (i == licensePlateLetters.length) {
				if (shortestCompletingWord == null) {
					shortestCompletingWord = w;
				} else if (shortestCompletingWord.length() > w.length()) {
					shortestCompletingWord = w;
				}
			}
		}
		return shortestCompletingWord;
	}

}
