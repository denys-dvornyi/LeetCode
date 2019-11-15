package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _532_KDiffPairsInAnArrayTest {

	private _532_KDiffPairsInAnArray diffPairsInAnArray = new _532_KDiffPairsInAnArray();

	@DisplayName("Number of unique k-diff pairs in the array")
	@ParameterizedTest(name = "test #{index}: pairs {0}, k {1} -> expected {2}")
	@MethodSource({"useCases"})
	public void findLUSlength(int[] nums, int k, int expected) {
		Assertions.assertEquals(expected, diffPairsInAnArray.findPairs(nums, k));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {3, 1, 4, 1, 5}, 2, 2),
				Arguments.of(new int[] {1, 2, 3, 4, 5}, 1, 4),
				Arguments.of(new int[] {1, 3, 1, 5, 4}, 0, 1)
		);
	}

}
