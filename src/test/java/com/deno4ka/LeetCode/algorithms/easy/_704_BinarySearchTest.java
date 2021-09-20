package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _704_BinarySearchTest {

	private final _704_BinarySearch binarySearch = new _704_BinarySearch();

	@DisplayName("Search target in nums. If target exists, then return its index. Otherwise, return `-1`")
	@ParameterizedTest(name = "test #{index}: nums \"{0}\", target \"{1}\", expected index \"{2}\"")
	@MethodSource({"useCases"})
	public void search(int[] nums, int target, int expected) {
		Assertions.assertEquals(expected, binarySearch.search(nums, target));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
				Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1),
				Arguments.of(new int[]{-3, -1, 0, 3, 5, 9, 12, 17}, 17, 7)
		);
	}

}
