package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _561_ArrayPartition1Test {

    private final _561_ArrayPartition1 arrayPartition1 = new _561_ArrayPartition1();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 3, 2}, 4)
        );
    }

    @DisplayName("Find the largest possible pairs sum")
    @ParameterizedTest(name = "test #{index}: array \"{0}\" -> expect {1}")
    @MethodSource({"useCases"})
    public void arrayPairSum(int[] nums, int expected) {
        Assertions.assertEquals(expected, arrayPartition1.arrayPairSum(nums));
    }

}
