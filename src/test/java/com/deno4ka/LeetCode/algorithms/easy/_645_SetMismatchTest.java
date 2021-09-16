package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _645_SetMismatchTest {

	private final _645_SetMismatch setMismatch = new _645_SetMismatch();

	@DisplayName("Find the number occurs twice and then find the number that is missing")
	@ParameterizedTest(name = "test #{index}: array \"{0}\", expected result \"{1}\"")
	@MethodSource({"useCases"})
	public void findErrorNums(int[] nums, int[] expected) {
		Assertions.assertArrayEquals(expected, setMismatch.findErrorNums(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {1, 1}, new int[] {1, 2}),
				Arguments.of(new int[] {3, 2, 2}, new int[] {2, 1}),
				Arguments.of(new int[] {1}, new int[2]),
				Arguments.of(new int[] {2, 2}, new int[] {2, 1}),
				Arguments.of(new int[] {1, 2, 2, 4}, new int[] {2, 3}),
				Arguments.of(new int[] {1, 2, 3, 3}, new int[] {3, 4}),
				Arguments.of(new int[] {1, 2, 4, 4}, new int[] {4, 3})
				);
	}

}
