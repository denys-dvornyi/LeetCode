package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _643_MaximumAverageSubarray1Test {

    private final _643_MaximumAverageSubarray1 maximumAverageSubarray1 = new _643_MaximumAverageSubarray1();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75),
                Arguments.of(new int[]{0, 0, 0, 0}, 3, 0.0),
                Arguments.of(new int[]{1, 2, 3, 4}, 2, 3.5),
                Arguments.of(new int[]{-2, -1, 0, 1, 2}, 3, 1.0),
                Arguments.of(new int[]{10, 0, -10, 0, 10, 0, -10}, 5, 2.0),
                Arguments.of(new int[]{
                        -6662, 5432, -8558, -8935, 8731, -3083, 4115, 9931, -4006, -3284,
                        -3024, 1714, -2825, -2374, -2750, -959, 6516, 9356, 8040, -2169,
                        -9490, -3068, 6299, 7823, -9767, 5751, -7897, 6680, -1293, -3486,
                        -6785, 6337, -9158, -4183, 6240, -2846, -2588, -5458, -9576, -1501,
                        -908, -5477, 7596, -8863, -4088, 7922, 8231, -4928, 7636, -3994,
                        -243, -1327, 8425, -3468, -4218, -364, 4257, 5690, 1035, 6217,
                        8880, 4127, -6299, -1831, 2854, -4498, -6983, -677, 2216, -1938,
                        3348, 4099, 3591, 9076, 942, 4571, -4200, 7271, -6920, -1886,
                        662, 7844, 3658, -6562, -2106, -296, -3280, 8909, -8352, -9413,
                        3513, 1352, -8825}, 90, 37.25556)
        );
    }

    @DisplayName("Find the contiguous subarray of given length k that has the maximum average value")
    @ParameterizedTest(name = "test #{index}: array \"{0}\", length \"{1}\" expected average \"{2}\"")
    @MethodSource({"useCases"})
    public void findMaxAverage(int[] nums, int k, double expected) {
        Assertions.assertEquals(expected, maximumAverageSubarray1.findMaxAverage(nums, k));
    }

}
