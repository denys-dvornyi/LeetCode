package com.deno4ka.LeetCode.Easy;

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.
For the purpose of this problem, we define empty string as valid palindrome.
*/

public class _125_valid_palindrome {

    public _125_valid_palindrome() {
//        System.out.println(isPalindrome(null));
//        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
    }

    private boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        } else {
            char[] charsTmp = s.toLowerCase().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charsTmp.length; i++) {
                if (Character.isLetter(charsTmp[i])) {
                    sb.append(charsTmp[i]);
                }
            }
            char[] letterOnly = sb.toString().toCharArray();
            for (int j = 0; j < letterOnly.length; j++) {
                if (letterOnly[j] != letterOnly[letterOnly.length-1-j]) {
                    return false;
                }
            }
            return true;
        }
    }

}