package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _581_ShortestUnsortedContinuousSubarrayTest {

	private _581_ShortestUnsortedContinuousSubarray shortestUnsortedContinuousSubarray = new _581_ShortestUnsortedContinuousSubarray();

	@DisplayName("Find the shortest subarray")
	@ParameterizedTest(name = "test #{index}: array {0} -> expected {2}")
	@MethodSource({"useCases"})
	public void findUnsortedSubarray(int[] arr, int expected) {
		Assertions.assertEquals(expected, shortestUnsortedContinuousSubarray.findUnsortedSubarray(arr));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {2, 6, 4, 8, 10, 9, 15}, 5)
		);
	}

}
