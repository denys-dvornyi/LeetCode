package com.deno4ka.LeetCode.algorithms.easy;

/*
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
Please note that the string does not contain any non-printable characters.

Example:
Input: "Hello, my name is John"
Output: 5
*/

public class _434_NumberOfSegmentsInAString {

    public _434_NumberOfSegmentsInAString() {
        System.out.println(countSegments(null)); // 0
        System.out.println(countSegments("")); // 0
        System.out.println(countSegments("   ")); // 0
        System.out.println(countSegments("Hello, my name is John")); // 5
    }

    // (2ms/71.97%)
    public int countSegments(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        } else {
            final char SPACE = ' ';
            int counter = 0;
            char prevChar = 0;
            boolean spaceDetected = false;
            for (int i = 0; i < s.length(); i++) {
                char letter = s.charAt(i);
                if (i == 0) {
                    prevChar = letter;
                    if (letter == SPACE) {
                        spaceDetected = true;
                    }
                    continue;
                } else if (prevChar != SPACE && letter == SPACE) {
                    counter++;
                    spaceDetected = true;
                } else if (prevChar == SPACE && letter != SPACE) {
                    spaceDetected = false;
                }
                prevChar = letter;
            }
            if (!spaceDetected) {
                counter++;
            }
            return counter;
        }
    }

}