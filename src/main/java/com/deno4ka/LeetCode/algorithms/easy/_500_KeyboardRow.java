package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

see resources/american_keyboard.png

Example:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]

Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _500_KeyboardRow {

	public String[] findWords(String[] words) {
		List<Character> firstRow = Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
		List<Character> secondRow = Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
		List<Character> thirdRow = Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm');
//		char[] firstRow = new char[] {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
//		char[] secondRow = new char[] {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
//		char[] thirdRow = new char[] {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
		List<String> result = new ArrayList<>(words.length);
		for (int i = 0; i < words.length; i++) {
			char[] word = words[i].toLowerCase().toCharArray();
			for (int j = 0; j < word.length; j++) {
				if (firstRow.containsAll(Arrays.asList(word))) {
					result.add(word.toString());
				} else if (secondRow.containsAll(Arrays.asList(word))) {
					result.add(word.toString());
				} else if (thirdRow.containsAll(Arrays.asList(word))) {
					result.add(word.toString());
				}
			}
		}
		return result.toArray(new String[0]);
	}

}
