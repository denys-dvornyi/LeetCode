package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _605_CanPlaceFlowersTest {

    private final _605_CanPlaceFlowers canPlaceFlowers = new _605_CanPlaceFlowers();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[]{0}, 0, true),
                Arguments.of(new int[]{0}, 1, true),
                Arguments.of(new int[]{1}, 0, true),
                Arguments.of(new int[]{1}, 1, false),
                Arguments.of(new int[]{0, 0}, 1, true),
                Arguments.of(new int[]{0, 0}, 2, false),
                Arguments.of(new int[]{0, 0, 0}, 1, true),
                Arguments.of(new int[]{0, 0, 0}, 2, true),
                Arguments.of(new int[]{0, 0, 0}, 3, false),
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 1, true),
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 2, false),
                Arguments.of(new int[]{0, 1, 0, 0, 1, 0}, 0, true),
                Arguments.of(new int[]{0, 1, 0, 0, 1, 0}, 1, false),
                Arguments.of(new int[]{0, 1, 0, 0, 1, 0, 0}, 1, true),
                Arguments.of(new int[]{0, 1, 0, 0, 1, 0, 0}, 2, false),
                Arguments.of(new int[]{0, 0, 1, 0, 0, 1, 0, 0}, 2, true),
                Arguments.of(new int[]{0, 0, 1, 0, 0, 1, 0, 0}, 3, false),
                Arguments.of(new int[]{0, 0, 0, 1, 0, 0, 1, 0, 0}, 3, false),
                Arguments.of(new int[]{0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, 3, false),
                Arguments.of(new int[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, 3, true),
                Arguments.of(new int[]{0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0}, 3, true),
                Arguments.of(new int[]{0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0}, 4, true),
                Arguments.of(new int[]{0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0}, 5, true),
                Arguments.of(new int[]{0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0}, 6, true)
        );
    }

    @DisplayName("Find flowers without violating the no-adjacent-flowers rule")
    @ParameterizedTest(name = "test #{index}: \"{0}\", \"{1}\" expected \"{2}\"")
    @MethodSource({"useCases"})
    public void canPlaceFlowers(int[] flowerbed, int n, boolean expected) {
        Assertions.assertEquals(expected, canPlaceFlowers.canPlaceFlowers(flowerbed, n));
    }

}
