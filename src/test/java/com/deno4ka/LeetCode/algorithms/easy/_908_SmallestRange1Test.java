package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _908_SmallestRange1Test {

    private final _908_SmallestRange1 smallestRange1 = new _908_SmallestRange1();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[]{1}, 0, 0),
                Arguments.of(new int[]{0, 10}, 2, 6),
                Arguments.of(new int[]{1, 3, 6}, 3, 0),
                Arguments.of(new int[]{55, 55, 55}, 3, 0),
                Arguments.of(new int[]{55, 66, 77}, 11, 0),
                Arguments.of(new int[]{4103, 2214, 5569, 6335, 4244, 9485, 7545, 8323, 7841, 8858}, 391, 6489)
        );
    }

    @DisplayName("Return the minimum score of nums after applying the mentioned operation at most once for each index in it")
    @ParameterizedTest(name = "test #{index}: nums \"{0}\", variable \"{1}\", minimum score \"{2}\"")
    @MethodSource({"useCases"})
    public void smallestRangeI(int[] nums, int k, int expected) {
        Assertions.assertEquals(expected, smallestRange1.smallestRangeI(nums, k));
    }

}
