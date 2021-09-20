package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _697_DegreeOfAnArrayTest {

	private final _697_DegreeOfAnArray degreeOfAnArray = new _697_DegreeOfAnArray();

	@DisplayName("Find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums")
	@ParameterizedTest(name = "test #{index}: array \"{0}\", expected degree \"{1}\"")
	@MethodSource({"useCases"})
	public void findShortestSubArray(int[] nums, int expected) {
		Assertions.assertEquals(expected, degreeOfAnArray.findShortestSubArray(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{1, 2, 2, 3, 1}, 2),
				Arguments.of(new int[]{1, 2, 2, 3, 1, 4, 2}, 6),
				Arguments.of(new int[]{0}, 1),
				Arguments.of(new int[]{0, 1}, 1),
				Arguments.of(new int[]{3, 3}, 2),
				Arguments.of(new int[]{1, 3, 3, 2, 1, 2}, 2),
				Arguments.of(new int[]{4, 4, 4}, 3),
				Arguments.of(new int[]{1, 4, 4, 4, 1, 1}, 3)
		);
	}

}
