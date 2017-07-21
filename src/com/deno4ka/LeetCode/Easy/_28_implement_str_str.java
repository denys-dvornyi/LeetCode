package com.deno4ka.LeetCode.Easy;

// Implement strStr().
// Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class _28_implement_str_str {

    public _28_implement_str_str() {
        System.out.println(strStr("a", ""));                      // -1
//        System.out.println(strStr("aaa", "aaaa"));                      // -1
//        System.out.println(strStr("baa", "aaa"));                       // -1
//        System.out.println(strStr("electrocardiography", "lec"));       // 1
//        System.out.println(strStr("electrocardiography", "card"));      // 7
//        System.out.println(strStr("electrocardiography", "graph"));     // 13
//        System.out.println(strStr("electrocardiograph", "electro"));    // 0
//        System.out.println(strStr("electrocardiograph", "eletro"));     // -1
//        System.out.println(strStr("", ""));                             // 0
//        System.out.println(strStr("abc", ""));                          // -1
//        System.out.println(strStr("", "abc"));                          // -1
    }

    private int strStr(String haystack, String needle) {
        if (haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        } else if (!haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        } else if (haystack.length() < needle.length()) {
            return -1;
        }
        char[] Haystack = haystack.toCharArray();
        char[] Needle = needle.toCharArray();
        boolean found;
        for (int i = 0; i < Haystack.length && Haystack.length - i >= Needle.length; i++) {
            if (Haystack[i] == Needle[0]) {
                found = true;
                for (int j = 0; j < Needle.length; j++) {
                    if (Haystack[i + j] != Needle[j]) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return i;
                }
            }
        }
        return -1;
    }

}