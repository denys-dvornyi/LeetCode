package com.deno4ka.LeetCode.algorithms.easy;

/*
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:
'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...".
We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.

Example 1:
Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".

Example 2:
Input: words = ["a"]
Output: 1

Constraints:
1 <= words.length <= 100
1 <= words[i].length <= 12
words[i] consists of lowercase English letters.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _804_UniqueMorseCodeWords {

	private static final String[] morseCodes = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	private static final char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//	private static final Map<Character, String> morseCodeTable = new HashMap<>(alphabet.length);
	private static final String[] morseCodeArray = new String[(int) 'z' + 1];

	static {
		for (int i = 0; i < morseCodes.length; i++) {
			morseCodeArray[alphabet[i]] = morseCodes[i];
		}
//		for (int i = 0; i < alphabet.length; i++) {
//			morseCodeTable.put(alphabet[i], morseCodes[i]);
//		}
	}

//	Runtime: 1 ms, faster than 100.00% & Memory Usage: 37 MB, less than 80.23%
	public int uniqueMorseRepresentations(String[] words) {
		if (words.length == 1) {
			return 1;
		} else {
			Set<String> uniqueMorseCodeWords = new HashSet<>(words.length);
			for (String word : words) {
				StringBuilder wordAsMorseCode = new StringBuilder();
				for (char c : word.toCharArray()) {
					wordAsMorseCode.append(morseCodeArray[c]);
				}
				uniqueMorseCodeWords.add(wordAsMorseCode.toString());
			}
			return uniqueMorseCodeWords.size();
		}
	}

//	Runtime: 2 ms, faster than 71.58% & Memory Usage: 36.9 MB, less than 80.23%
//	public int uniqueMorseRepresentations(String[] words) {
//		if (words.length == 1) {
//			return 1;
//		} else {
//			Set<String> uniqueMorseCodeWords = new HashSet<>(words.length);
//			for (String word : words) {
//				StringBuilder wordAsMorseCode = new StringBuilder();
//				for (Character c : word.toCharArray()) {
//					wordAsMorseCode.append(morseCodeTable.get(c));
//				}
//				uniqueMorseCodeWords.add(wordAsMorseCode.toString());
//			}
//			return uniqueMorseCodeWords.size();
//		}
//	}

}
