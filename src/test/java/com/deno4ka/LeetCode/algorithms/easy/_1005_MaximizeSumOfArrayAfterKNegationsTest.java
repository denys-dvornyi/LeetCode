package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _1005_MaximizeSumOfArrayAfterKNegationsTest {

	private final _1005_MaximizeSumOfArrayAfterKNegations maximizeSumOfArrayAfterKNegations = new _1005_MaximizeSumOfArrayAfterKNegations();

	@DisplayName("Return the largest possible sum of the array after modifying it in this way")
	@ParameterizedTest(name = "test #{index}: nums \"{0}\", modifyings \"{1}\", largest sum \"{2}\"")
	@MethodSource({"useCases"})
	public void largestSumAfterKNegations(int[] nums, int k, int expected) {
		Assertions.assertEquals(expected, maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(nums, k));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{4, 2, 3}, 1, 5),
				Arguments.of(new int[]{3, -1, 0, 2}, 3, 6),
				Arguments.of(new int[]{2, -3, -1, 5, -4}, 2, 13),
				Arguments.of(new int[]{4, 2, 3}, 2, 9),
				Arguments.of(new int[]{4, 2, 3}, 3, 5),
				Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10_000, 55),
				Arguments.of(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 9_999, 0)
		);
	}

}
