package com.deno4ka.Other;

public class FirstNonRepeatedCharacterInTheString {

    public FirstNonRepeatedCharacterInTheString() {
        System.out.println(getFirstNonRepeatedCharacterInTheString(null));
        System.out.println(getFirstNonRepeatedCharacterInTheString(""));
        System.out.println(getFirstNonRepeatedCharacterInTheString("Teste"));
        System.out.println(getFirstNonRepeatedCharacterInTheString("Characterht"));
    }

    private Character getFirstNonRepeatedCharacterInTheString(String test) {
        Character result = null;
        if (test == null || test.isEmpty()) {
            return result;
        } else {
            char[] chars = test.toLowerCase().toCharArray();
            char nonRepeated;
            for (int i = 0; i < chars.length; i++) {
                int repeatCounter = 0;
                for (int j = 0; j < chars.length; j++) {
                    if (i != j && chars[i] == chars[j]) {
                       repeatCounter++;
                       break;
                    }
                }
                if (repeatCounter == 0) {
                    result = chars[i];
                    return result;
                }
            }
            return result;
        }
    }
}