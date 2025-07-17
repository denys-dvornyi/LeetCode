package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _868_BinaryGapTest {

    private final _868_BinaryGap binaryGap = new _868_BinaryGap();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(22, 2),
                Arguments.of(5, 2),
                Arguments.of(6, 1),
                Arguments.of(8, 0),
                Arguments.of(1, 0)
        );
    }

    @DisplayName("Return the longest distance between any two adjacent 1's in the binary representation of n")
    @ParameterizedTest(name = "test #{index}: number \"{0}\", expected \"{1}\"")
    @MethodSource({"useCases"})
    public void binaryGap(int n, int expected) {
        Assertions.assertEquals(expected, binaryGap.binaryGap(n));
    }

}
