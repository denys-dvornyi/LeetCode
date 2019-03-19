package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.
For the purpose of this problem, we define empty string as valid palindrome.
*/

public class _125_ValidPalindrome {

    public _125_ValidPalindrome() {
//        System.out.println(isPalindrome(null));
//        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
        System.out.println(isPalindrome("0P")); // false
    }

    private boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        } else {
            char[] charsTmp = s.toLowerCase().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charsTmp.length; i++) {
                if (Character.isLetterOrDigit(charsTmp[i])) {
                    sb.append(charsTmp[i]);
                }
            }
            char[] alphanumeric = sb.toString().toCharArray();
            int midl = alphanumeric.length / 2;
            for (int j = 0; j < midl; j++) {
                if (alphanumeric[j] != alphanumeric[alphanumeric.length-1-j]) {
                    return false;
                }
            }
            return true;
        }
    }

}