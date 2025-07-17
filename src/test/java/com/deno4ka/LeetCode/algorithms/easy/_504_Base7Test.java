package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _504_Base7Test {

    private final _504_Base7 base7 = new _504_Base7();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(9, "12"),
                Arguments.of(49, "100"),
                Arguments.of(100, "202"),
                Arguments.of(-7, "-10")
        );
    }

    @DisplayName("return base 7 string representation")
    @ParameterizedTest(name = "test #{index}: integer {0} -> expected base7 {1}")
    @MethodSource({"useCases"})
    public void convertToBase7(int num, String expected) {
        Assertions.assertEquals(expected, base7.convertToBase7(num));
    }

}
