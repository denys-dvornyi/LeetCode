package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _860_LemonadeChangeTest {

    private final _860_LemonadeChange lemonadeChange = new _860_LemonadeChange();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[]{5, 5, 5, 10, 20}, true),
                Arguments.of(new int[]{5, 5, 5, 10, 5, 5, 5, 10, 20}, true),
                Arguments.of(new int[]{5, 5, 5, 20}, true),
                Arguments.of(new int[]{5, 5, 20}, false),
                Arguments.of(new int[]{5, 20}, false),
                Arguments.of(new int[]{10, 20}, false),
                Arguments.of(new int[]{5, 5, 10, 10, 20}, false),
                Arguments.of(new int[]{5, 5, 10}, true),
                Arguments.of(new int[]{5, 10}, true),
                Arguments.of(new int[]{10, 10}, false),
                Arguments.of(new int[]{5}, true),
                Arguments.of(new int[]{10}, false),
                Arguments.of(new int[]{20}, false)
        );
    }

    @DisplayName("Return true if you can provide every customer with correct change, or false otherwise")
    @ParameterizedTest(name = "test #{index}: bills \"{0}\", expected \"{1}\"")
    @MethodSource({"useCases"})
    public void lemonadeChange(int[] bills, boolean expected) {
        Assertions.assertEquals(expected, lemonadeChange.lemonadeChange(bills));
    }

}
