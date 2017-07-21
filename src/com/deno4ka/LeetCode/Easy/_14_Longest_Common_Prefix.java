package com.deno4ka.LeetCode.Easy;

// Write a function to find the longest common prefix string amongst an array of strings.

public class _14_Longest_Common_Prefix {

    public _14_Longest_Common_Prefix() {
        System.out.println(longestCommonPrefix(new String[] {}));
        System.out.println(longestCommonPrefix(new String[] {"hello"}));
        System.out.println(longestCommonPrefix(new String[] {"hello", "helicopter", "good", "goodness"}));
        System.out.println(longestCommonPrefix(new String[] {"success", "successfully", "hello", "helicopter", "good", "goodness"}));
        System.out.println(longestCommonPrefix(new String[] {"acd","acbd","acd"}));
    }

    private String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        if (strs.length == 0) {
            return longestCommonPrefix.toString();
        } else if (strs.length == 1) {
            return strs[0];
        } else if (strs.length > 1) {
            String first = strs[0];
            for (int i = 0; i < first.length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    String next = strs[j];
                    if (i < next.length() && first.toCharArray()[i] != next.toCharArray()[i]) {
                        return longestCommonPrefix.toString();
                    } else if (i >= next.length()) {
                        return longestCommonPrefix.toString();
                    }
                }
                longestCommonPrefix.append(first.toCharArray()[i]);
            }
        }
        return longestCommonPrefix.toString();
    }
}