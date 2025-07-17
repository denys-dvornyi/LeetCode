package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _852_PeakIndexInAMountainArrayTest {

    private final _852_PeakIndexInAMountainArray peakIndexInAMountainArray = new _852_PeakIndexInAMountainArray();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0}, 1),
                Arguments.of(new int[]{0, 2, 1, 0}, 1),
                Arguments.of(new int[]{0, 10, 5, 2}, 1),
                Arguments.of(new int[]{3, 4, 5, 1}, 2),
                Arguments.of(new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19}, 2)
        );
    }

    @DisplayName("Return the peak index of the mountain array")
    @ParameterizedTest(name = "test #{index}: mountain \"{0}\", peak \"{1}\"")
    @MethodSource({"useCases"})
    public void peakIndexInMountainArray(int[] arr, int expected) {
        Assertions.assertEquals(expected, peakIndexInAMountainArray.peakIndexInMountainArray(arr));
    }

}
