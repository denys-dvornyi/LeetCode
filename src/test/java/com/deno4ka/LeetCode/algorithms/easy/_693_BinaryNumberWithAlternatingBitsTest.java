package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _693_BinaryNumberWithAlternatingBitsTest {

    private final _693_BinaryNumberWithAlternatingBits alternatingBits = new _693_BinaryNumberWithAlternatingBits();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(5, true),  // 101
                Arguments.of(7, false), // 111
                Arguments.of(11, false),// 1011
                Arguments.of(10, true), // 1010
                Arguments.of(3, false)  // 11
        );
    }

    @DisplayName("Check whether it has alternating bits")
    @ParameterizedTest(name = "test #{index}: number \"{0}\", expected is alternating \"{1}\"")
    @MethodSource({"useCases"})
    public void hasAlternatingBits(int n, boolean expected) {
        Assertions.assertEquals(expected, alternatingBits.hasAlternatingBits(n));
    }

}
