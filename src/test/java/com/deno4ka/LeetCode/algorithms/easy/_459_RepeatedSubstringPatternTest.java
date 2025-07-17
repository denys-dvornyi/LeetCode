package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Repeated Substring Pattern #459")
public class _459_RepeatedSubstringPatternTest {

    private final _459_RepeatedSubstringPattern repeatedSubstringPattern = new _459_RepeatedSubstringPattern();

    //	@Test
    void testNull() {
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(null));
    }

    //	@Test
    void testEmpty() {
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(""));
    }

    @Test
    void testOneLetterWord() {
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("a"));
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("b"));
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("z"));
    }

    @Test
    void testExampleOne() {
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("abab"));
    }

    @Test
    void testExampleTwo() {
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("aba"));
    }

    @Test
    void testExampleThree() {
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    void testExampleFour() {
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("abac"));
    }

    @Test
    void testExampleFive() {
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("ababab"));
    }

}
