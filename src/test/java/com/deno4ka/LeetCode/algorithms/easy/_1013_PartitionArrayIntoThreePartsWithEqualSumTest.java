package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _1013_PartitionArrayIntoThreePartsWithEqualSumTest {

    private final _1013_PartitionArrayIntoThreePartsWithEqualSum partitionArrayIntoThreePartsWithEqualSum = new _1013_PartitionArrayIntoThreePartsWithEqualSum();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}, true),
                Arguments.of(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}, false),
                Arguments.of(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}, true),
                Arguments.of(new int[]{-1, 1, 3, 0}, false),
                Arguments.of(new int[]{-1, -1, 3, -4}, true),
                Arguments.of(new int[]{-1, -1, -1, 1, 3, -4}, true),
                Arguments.of(new int[]{1, 2, 3}, false),
                Arguments.of(new int[]{8, 8, 8}, true),
                Arguments.of(new int[]{-7, -7, -7}, true),
                Arguments.of(new int[]{2, 1, 1, 2}, true),
                Arguments.of(new int[]{1, 1, 1, 1}, false),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, false),
                Arguments.of(new int[]{1, 1, 2, 1, 1}, true)
        );
    }

    @DisplayName("Return true if we can partition the array into three non-empty parts with equal sums")
    @ParameterizedTest(name = "test #{index}: array \"{0}\", can be split into three parts \"{1}\"")
    @MethodSource({"useCases"})
    public void canThreePartsEqualSum(int[] arr, boolean expected) {
        Assertions.assertEquals(expected, partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(arr));
    }

}
