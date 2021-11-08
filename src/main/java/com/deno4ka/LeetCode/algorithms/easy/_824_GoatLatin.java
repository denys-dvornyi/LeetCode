package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.
We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:
If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
For example, the word "apple" becomes "applema".
If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
Return the final sentence representing the conversion from sentence to Goat Latin.

Example 1:
Input: sentence = "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

Example 2:
Input: sentence = "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

Constraints:
1 <= sentence.length <= 150
sentence consists of English letters and spaces.
sentence has no leading or trailing spaces.
All the words in sentence are separated by a single space.
*/

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _824_GoatLatin {

	private static final Set<Character> VOWELS = Stream.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').collect(Collectors.toSet());

//	Runtime: 2 ms, faster than 89.32% & Memory Usage: 37.7 MB, less than 75.49%
	public String toGoatLatin(String sentence) {
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			StringBuilder goatWord = new StringBuilder();
			if (VOWELS.contains(words[i].charAt(0))) {
				goatWord.append(words[i]).append("ma");
			} else {
				goatWord.append(words[i].substring(1)).append(words[i].charAt(0)).append("ma");
			}
			for (int j = -1; j < i; j++) {
				goatWord.append("a");
			}
			words[i] = goatWord.toString();
		}
		return String.join(" ", words);
	}

}
