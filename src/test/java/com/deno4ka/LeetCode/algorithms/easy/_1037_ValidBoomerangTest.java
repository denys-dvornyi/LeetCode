package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _1037_ValidBoomerangTest {

    private final _1037_ValidBoomerang validBoomerang = new _1037_ValidBoomerang();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 1}, {2, 3}, {3, 2}}, true),
                Arguments.of(new int[][]{{1, 1}, {2, 2}, {3, 3}}, false),
                Arguments.of(new int[][]{{4, 4}, {4, 4}, {5, 5}}, false),
                Arguments.of(new int[][]{{6, 6}, {4, 4}, {4, 4}}, false),
                Arguments.of(new int[][]{{4, 4}, {7, 7}, {4, 4}}, false),
                Arguments.of(new int[][]{{4, 4}, {4, 4}, {4, 4}}, false),
                Arguments.of(new int[][]{{8, 1}, {8, 2}, {8, 3}}, false),
                Arguments.of(new int[][]{{1, 9}, {2, 9}, {3, 9}}, false)
        );
    }

    @DisplayName("Return true if these points are a boomerang")
    @ParameterizedTest(name = "test #{index}: points \"{0}\", expected \"{1}\"")
    @MethodSource({"useCases"})
    public void isBoomerang(int[][] points, boolean expected) {
        Assertions.assertEquals(expected, validBoomerang.isBoomerang(points));
    }

}
