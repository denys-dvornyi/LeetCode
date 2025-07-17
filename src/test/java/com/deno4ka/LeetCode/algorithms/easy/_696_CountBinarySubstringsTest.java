package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _696_CountBinarySubstringsTest {

    private final _696_CountBinarySubstrings countBinarySubstrings = new _696_CountBinarySubstrings();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of("01", 1),
                Arguments.of("00110011", 6),
                Arguments.of("10101", 4),
                Arguments.of("11110", 1),
                Arguments.of("0111", 1),
                Arguments.of("11011", 2),
                Arguments.of("001000", 2),
                Arguments.of("011011", 3),
                Arguments.of("101110", 3),
                Arguments.of("11011011", 4),
                Arguments.of("101010", 5),
                Arguments.of("0010101001", 7)
        );
    }

    @DisplayName("Return the number of non-empty substrings that have the same number of 0's and 1's")
    @ParameterizedTest(name = "test #{index}: string \"{0}\", expected substrings \"{1}\"")
    @MethodSource({"useCases"})
    public void countBinarySubstrings(String s, int expected) {
        Assertions.assertEquals(expected, countBinarySubstrings.countBinarySubstrings(s));
    }

}
