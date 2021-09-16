package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _594_LongestHarmoniousSubsequenceTest {

	private final _594_LongestHarmoniousSubsequence longestHarmoniousSubsequence = new _594_LongestHarmoniousSubsequence();

	@DisplayName("Find the length of its longest harmonious subsequence among all its possible subsequences")
	@ParameterizedTest(name = "test #{index}: array {0} -> expected {1}")
	@MethodSource({"useCases"})
	public void findLHS(int[] arr, int expected) {
		Assertions.assertEquals(expected, longestHarmoniousSubsequence.findLHS(arr));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {1, 3, 2, 2, 5, 2, 3, 7}, 5),
				Arguments.of(new int[] {1, 2, 3, 4}, 2),
				Arguments.of(new int[] {1, 1, 1, 1}, 0),
				Arguments.of(new int[] {1, 2, 1, 3, 0, 0, 2, 2, 1, 3, 3}, 6)
		);
	}

}
