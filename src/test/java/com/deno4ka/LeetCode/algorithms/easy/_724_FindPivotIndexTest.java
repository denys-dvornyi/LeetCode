package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _724_FindPivotIndexTest {

    private final _724_FindPivotIndex pivotIndex = new _724_FindPivotIndex();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 7, 3, 6, 5, 6}, 3),
                Arguments.of(new int[]{1, 2, 3}, -1),
                Arguments.of(new int[]{2, 1, -1}, 0),
                Arguments.of(new int[]{0}, 0)
        );
    }

    @DisplayName("Return the leftmost pivot index. If no such index exists, return `-1`")
    @ParameterizedTest(name = "test #{index}: array \"{0}\", expected pivot index \"{1}\"")
    @MethodSource({"useCases"})
    public void pivotIndex(int[] nums, int expected) {
        Assertions.assertEquals(expected, pivotIndex.pivotIndex(nums));
    }

}
