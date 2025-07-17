package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _888_FairCandySwapTest {

    private final _888_FairCandySwap fairCandySwap = new _888_FairCandySwap();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 1}, new int[]{2, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{1, 2}, new int[]{2, 3}, new int[]{1, 2}),
                Arguments.of(new int[]{1, 2, 5}, new int[]{2, 4}, new int[]{5, 4})
        );
    }

    @DisplayName("Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, " +
            "and answer[1] is the number of candies in the box that Bob must exchange")
    @ParameterizedTest(name = "test #{index}: aliceSizes 1 \"{0}\", bobSizes 2 \"{1}\", fair candy swap \"{2}\"")
    @MethodSource({"useCases"})
    public void fairCandySwap(int[] aliceSizes, int[] bobSizes, int[] expected) {
        Assertions.assertArrayEquals(expected, fairCandySwap.fairCandySwap(aliceSizes, bobSizes));
    }

}
