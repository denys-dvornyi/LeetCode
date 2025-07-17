package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned.
It is guaranteed there is at least one word that is not banned, and that the answer is unique.
The words in paragraph are case-insensitive and the answer should be returned in lowercase.

Example 1:
Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation:
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"),
and that "hit" isn't the answer even though it occurs more because it is banned.

Example 2:
Input: paragraph = "a.", banned = []
Output: "a"

Constraints:
1 <= paragraph.length <= 1000
paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".
0 <= banned.length <= 100
1 <= banned[i].length <= 10
banned[i] consists of only lowercase English letters.
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _819_MostCommonWord {

    //	Runtime: 10 ms, faster than 84.82% & Memory Usage: 39.4 MB, less than 62.66%
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph
                .replaceAll("[!?',;.]", " ")
                .toLowerCase().split(" ");
        Map<String, Integer> wordsFrequency = new HashMap<>(words.length);
        for (String word : words) {
            if (word.length() > 0) {
                wordsFrequency.put(word, wordsFrequency.computeIfAbsent(word, count -> 0) + 1);
            }
        }
        String mostFrequentWord = "";
        int mostFrequent = 0;
        for (Map.Entry<String, Integer> pair : wordsFrequency.entrySet()) {
            if (!bannedWords.contains(pair.getKey()) && pair.getValue() > mostFrequent) {
                mostFrequent = pair.getValue();
                mostFrequentWord = pair.getKey();
            }
        }
        return mostFrequentWord;
    }

}
