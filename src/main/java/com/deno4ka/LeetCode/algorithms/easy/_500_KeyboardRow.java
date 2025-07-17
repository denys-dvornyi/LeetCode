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
import java.util.List;

public class _500_KeyboardRow {

    // Runtime: 0 ms, faster than 100.00%       Memory Usage: 34.3 MB, less than 100.00%
    public String[] findWords(String[] words) {
        char[] firstRow = new char[58];
        char[] secondRow = new char[58];
        char[] thirdRow = new char[58];
        initArrays(firstRow, secondRow, thirdRow);

        List<String> result = new ArrayList<>(words.length);
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            boolean isFirstRow = true;
            boolean isSecondRow = true;
            boolean isThirdRow = true;
            int isFirstRowCount = 0;
            int isSecondRowCount = 0;
            int isThirdRowCount = 0;
            for (int j = 0; j < word.length; j++) {
                if (firstRow[(int) word[j] - 65] != 1) {
                    isFirstRow = false;
                } else {
                    isFirstRowCount++;
                }
                if (secondRow[(int) word[j] - 65] != 1) {
                    isSecondRow = false;
                } else {
                    isSecondRowCount++;
                }
                if (thirdRow[(int) word[j] - 65] != 1) {
                    isThirdRow = false;
                } else {
                    isThirdRowCount++;
                }
            }
            if (isFirstRow && isFirstRowCount != 0 || isSecondRow && isSecondRowCount != 0 || isThirdRow && isThirdRowCount != 0) {
                result.add(words[i]);
            }
        }
        return result.toArray(new String[0]);
    }

    private void initArrays(char[] firstRow, char[] secondRow, char[] thirdRow) {
//		('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p')
        firstRow[(int) 'q' - 65] = 1;
        firstRow[(int) 'w' - 65] = 1;
        firstRow[(int) 'e' - 65] = 1;
        firstRow[(int) 'r' - 65] = 1;
        firstRow[(int) 't' - 65] = 1;
        firstRow[(int) 'y' - 65] = 1;
        firstRow[(int) 'u' - 65] = 1;
        firstRow[(int) 'i' - 65] = 1;
        firstRow[(int) 'o' - 65] = 1;
        firstRow[(int) 'p' - 65] = 1;
        firstRow[(int) 'Q' - 65] = 1;
        firstRow[(int) 'W' - 65] = 1;
        firstRow[(int) 'E' - 65] = 1;
        firstRow[(int) 'R' - 65] = 1;
        firstRow[(int) 'T' - 65] = 1;
        firstRow[(int) 'Y' - 65] = 1;
        firstRow[(int) 'U' - 65] = 1;
        firstRow[(int) 'I' - 65] = 1;
        firstRow[(int) 'O' - 65] = 1;
        firstRow[(int) 'P' - 65] = 1;
//		('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l')
        secondRow[(int) 'a' - 65] = 1;
        secondRow[(int) 's' - 65] = 1;
        secondRow[(int) 'd' - 65] = 1;
        secondRow[(int) 'f' - 65] = 1;
        secondRow[(int) 'g' - 65] = 1;
        secondRow[(int) 'h' - 65] = 1;
        secondRow[(int) 'j' - 65] = 1;
        secondRow[(int) 'k' - 65] = 1;
        secondRow[(int) 'l' - 65] = 1;
        secondRow[(int) 'A' - 65] = 1;
        secondRow[(int) 'S' - 65] = 1;
        secondRow[(int) 'D' - 65] = 1;
        secondRow[(int) 'F' - 65] = 1;
        secondRow[(int) 'G' - 65] = 1;
        secondRow[(int) 'H' - 65] = 1;
        secondRow[(int) 'J' - 65] = 1;
        secondRow[(int) 'K' - 65] = 1;
        secondRow[(int) 'L' - 65] = 1;
//		('z', 'x', 'c', 'v', 'b', 'n', 'm')
        thirdRow[(int) 'z' - 65] = 1;
        thirdRow[(int) 'x' - 65] = 1;
        thirdRow[(int) 'c' - 65] = 1;
        thirdRow[(int) 'v' - 65] = 1;
        thirdRow[(int) 'b' - 65] = 1;
        thirdRow[(int) 'n' - 65] = 1;
        thirdRow[(int) 'm' - 65] = 1;
        thirdRow[(int) 'Z' - 65] = 1;
        thirdRow[(int) 'X' - 65] = 1;
        thirdRow[(int) 'C' - 65] = 1;
        thirdRow[(int) 'V' - 65] = 1;
        thirdRow[(int) 'B' - 65] = 1;
        thirdRow[(int) 'N' - 65] = 1;
        thirdRow[(int) 'M' - 65] = 1;
    }

}
