package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _746_MinCostClimbingStairsTest {

	private final _746_MinCostClimbingStairs minCostClimbingStairs = new _746_MinCostClimbingStairs();

	@DisplayName("Return the minimum cost to reach the top of the floor")
	@ParameterizedTest(name = "test #{index}: letters \"{0}\", target \"{1}\", expected character \"{2}\"")
	@MethodSource({"useCases"})
	public void minCostClimbingStairs(int[] cost, int expected) {
		Assertions.assertEquals(expected, minCostClimbingStairs.minCostClimbingStairs(cost));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{10, 15, 20}, 15),
				Arguments.of(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}, 6)
		);
	}

}
