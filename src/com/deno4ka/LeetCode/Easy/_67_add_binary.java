package com.deno4ka.LeetCode.Easy;

//Given two binary strings, return their sum (also a binary string).
//For example,
//a = "111"
//b = "011"
//Return "100".

public class _67_add_binary {

    public _67_add_binary() {
        System.out.println(addBinary(null, null));
        System.out.println(addBinary(null, ""));
        System.out.println(addBinary("", null));
        System.out.println(addBinary("", ""));
        System.out.println(addBinary("0", "0"));
    }

    private String addBinary(String a, String b) {
        if (a == null || b == null) return null;
        else if (a.isEmpty() && b.isEmpty()) return "";
        else if (a.isEmpty()) return b;
        else if (b.isEmpty()) return a;
        else {
            char[] charsA, charsB;
            if (a.length() >= b.length()) {
                charsA = a.toCharArray();
                charsB = b.toCharArray();
            } else {
                charsA = b.toCharArray();
                charsB = a.toCharArray();
            }
            char[] result = new char[] {};
            char overflow = '0';
            for (int i = 0; i < charsA.length; i++) {
                if (charsA[i] == '1' && charsB[i] == '1') {
                    if (overflow == '0') {
                        charsA[i] = '0';
                        overflow = '1';
                    } else {
                        charsA[i] = '1';
                    }
                }

            }
            return "";
        }
    }

}