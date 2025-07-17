package com.deno4ka.LeetCode.algorithms.easy;

//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//If the last word does not exist, return 0.
//Note: A word is defined as a character sequence consists of non-space characters only.
//For example,
//Given s = "Hello World",
//return 5.

public class _58_LengthOfLastWord {

    public _58_LengthOfLastWord() {
//        System.out.println(lengthOfLastWord(null));   //0
//        System.out.println(lengthOfLastWord(""));     //0
//        System.out.println(lengthOfLastWord("Hello World"));  //5
//        System.out.println(lengthOfLastWord("Hello World "));   //0
//        System.out.println(lengthOfLastWord("Hello World ,"));  //1
        System.out.println(lengthOfLastWord("a ")); //1
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) return 0;
        else {
            int length = 0;
            char[] chars = s.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                if (chars[i] == ' ' && length > 0) {
                    return length;
                } else if (chars[i] == ' ' && length == 0) {
                    continue;
                } else {
                    length++;
                }
            }
            return length;
        }
    }

}