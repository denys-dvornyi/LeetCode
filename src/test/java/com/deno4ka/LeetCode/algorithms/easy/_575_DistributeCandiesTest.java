package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _575_DistributeCandiesTest {

	private final _575_DistributeCandies distributeCandies = new _575_DistributeCandies();

	@DisplayName("Distribute candies equally in number to brother and sister")
	@ParameterizedTest(name = "test #{index}: candies {0} -> expected {2}")
	@MethodSource({"useCases"})
	public void distributeCandies(int[] candies, int expected) {
		Assertions.assertEquals(expected, distributeCandies.distributeCandies(candies));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {1, 1, 2, 2, 3, 3}, 3),
				Arguments.of(new int[] {1, 1, 2, 3}, 2),
				Arguments.of(new int[] {1, 1, 1, 1}, 1),
				Arguments.of(new int[] {1, 1, 2, 2, 1, 1}, 2)
		);
	}

}
