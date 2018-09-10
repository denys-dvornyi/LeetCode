package com.deno4ka.LeetCode.algorithms.easy;

//Given two binary strings, return their sum (also a binary string).
//For example,
//a = "111"
//b = "011"
//Return "100".

public class _67_add_binary {

    public _67_add_binary() {
//        System.out.println(addBinary(null, null));
//        System.out.println(addBinary(null, ""));
//        System.out.println(addBinary("", null));
//        System.out.println(addBinary("", ""));
//        System.out.println(addBinary("0", "0"));      //0
//        System.out.println(addBinary("0", "1"));      //1
//        System.out.println(addBinary("1", "1"));      //10
//        System.out.println(addBinary("11", "11"));      //110
//        System.out.println(addBinary("1010", "1011"));      //"10101"
        System.out.println(addBinary("100", "110010"));      //"110110"
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
            char[] result = new char[charsA.length];
            int overflow = 0;
            for (int i = 0; i < charsA.length; i++) {
                if (i < charsB.length) {
                    int x = Integer.parseInt(String.valueOf(charsA[charsA.length - 1 - i]));
                    int y = Integer.parseInt(String.valueOf(charsB[charsB.length - 1 - i]));
                    int z = x + y + overflow;
                    if (z == 0) {
                        result[result.length - 1 - i] = '0';
                    } else if (z == 1) {
                        result[result.length - 1 - i] = '1';
                        if (overflow > 0) overflow = 0;
                    } else if (z == 2) {
                        result[result.length - 1 - i] = '0';
                        overflow = 1;
                    } else if (z == 3) {
                        result[result.length - 1 - i] = '1';
                        overflow = 1;
                    }
                } else {
                    if (overflow > 0) {
                        int x = Integer.parseInt(String.valueOf(charsA[charsA.length - 1 - i]));
                        int z = x + overflow;
                        if (z == 1) {
                            result[result.length - 1 - i] = '1';
                            overflow = 0;
                        } else if (z == 2) {
                            result[result.length - 1 - i] = '0';
                            overflow = 1;
                        }
                    } else {
                        result[result.length - 1 - i] = charsA[charsA.length - 1 - i];
                    }
                }
            }
            if (overflow > 0) {
                return "1" + new String(result);
            }
            return new String(result);
        }
    }

}