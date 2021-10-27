package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _747_LargestNumberAtLeastTwiceOfOthersTest {

	private final _747_LargestNumberAtLeastTwiceOfOthers largestNumberAtLeastTwiceOfOthers = new _747_LargestNumberAtLeastTwiceOfOthers();

	@DisplayName("Return the index of the largest element, or return -1 otherwise")
	@ParameterizedTest(name = "test #{index}: nums \"{0}\", index \"{1}\"")
	@MethodSource({"useCases"})
	public void dominantIndex(int[] nums, int expected) {
		Assertions.assertEquals(expected, largestNumberAtLeastTwiceOfOthers.dominantIndex(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{3, 6, 1, 0}, 1),
				Arguments.of(new int[]{1, 2, 3, 4}, -1),
				Arguments.of(new int[]{10, 2, 3, 4}, 0),
				Arguments.of(new int[]{10, 2, 3, 40}, 3),
				Arguments.of(new int[]{0,0,3,2}, -1),
				Arguments.of(new int[]{1}, 0)
		);
	}

}
