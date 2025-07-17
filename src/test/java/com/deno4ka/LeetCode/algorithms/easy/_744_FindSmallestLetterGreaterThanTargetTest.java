package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _744_FindSmallestLetterGreaterThanTargetTest {

    private final _744_FindSmallestLetterGreaterThanTarget greaterThanTarget = new _744_FindSmallestLetterGreaterThanTarget();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new char[]{'a', 'b'}, 'z', 'a'),
                Arguments.of(new char[]{'c', 'f', 'j'}, 'a', 'c'),
                Arguments.of(new char[]{'c', 'f', 'j'}, 'c', 'f'),
                Arguments.of(new char[]{'c', 'f', 'j'}, 'd', 'f'),
                Arguments.of(new char[]{'c', 'f', 'j'}, 'g', 'j'),
                Arguments.of(new char[]{'c', 'f', 'j'}, 'j', 'c'),
                Arguments.of(new char[]{'c', 'f', 'f', 'f', 'j'}, 'f', 'j'),
                Arguments.of(new char[]{'c', 'f', 'f', 'f', 'j'}, 'e', 'f')
        );
    }

    @DisplayName("Return the smallest character in the array that is larger than target")
    @ParameterizedTest(name = "test #{index}: letters \"{0}\", target \"{1}\", expected character \"{2}\"")
    @MethodSource({"useCases"})
    public void nextGreatestLetter(char[] letters, char target, char expected) {
        Assertions.assertEquals(expected, greaterThanTarget.nextGreatestLetter(letters, target));
    }

}
