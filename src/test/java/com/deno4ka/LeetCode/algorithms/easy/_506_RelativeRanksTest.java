package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _506_RelativeRanksTest {

	private final _506_RelativeRanks relativeRanks = new _506_RelativeRanks();

	@DisplayName("find people with the top three highest scores")
	@ParameterizedTest(name = "test #{index}: nums {0} -> expected {1}")
	@MethodSource({"useCases"})
	public void findRelativeRanks(int[] nums, String[] expected) {
		assertArrayEquals(expected, relativeRanks.findRelativeRanks(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {5, 4, 3, 2, 1}, new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}),
				Arguments.of(new int[] {10, 3, 8, 9, 4}, new String[]{"Gold Medal","5","Bronze Medal","Silver Medal","4"})
		);
	}

}
