package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _674_LongestContinuousIncreasingSubsequenceTest {

	private final _674_LongestContinuousIncreasingSubsequence longestContinuousIncreasingSubsequence = new _674_LongestContinuousIncreasingSubsequence();

	@DisplayName("Return the length of the longest continuous increasing subsequence")
	@ParameterizedTest(name = "test #{index}: nums \"{0}\", expected length \"{1}\"")
	@MethodSource({"useCases"})
	public void findLengthOfLCIS(int[] nums, int expected) {
		Assertions.assertEquals(expected, longestContinuousIncreasingSubsequence.findLengthOfLCIS(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{1, 3, 5, 4, 7}, 3),
				Arguments.of(new int[]{2, 2, 2, 2, 2}, 1)
		);
	}

}
