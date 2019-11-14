package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _504_Base7 {

	private _506_RelativeRanks relativeRanks = new _506_RelativeRanks();

	@DisplayName("return base 7 string representation")
	@ParameterizedTest(name = "test #{index}: integer {0} -> expected base7 {1}")
	@MethodSource({"useCases"})
	public void fib(int[] nums, String[] expected) {
		assertArrayEquals(expected, relativeRanks.findRelativeRanks(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(100, "202"),
				Arguments.of(-7, "-10")
		);
	}

}
