package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _922_SortArrayByParity2Test {

	private final _922_SortArrayByParity2 sortArrayByParity2 = new _922_SortArrayByParity2();

	@DisplayName("Return sorted array so that whenever nums[i] is odd, `i` is odd, and whenever nums[i] is even, `i` is even")
	@ParameterizedTest(name = "test #{index}: nums \"{0}\", sorted nums \"{1}\"")
	@MethodSource({"useCases"})
	public void sortArrayByParityII(int[] nums, int[] expected) {
		Assertions.assertEquals(expected, sortArrayByParity2.sortArrayByParityII(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{4,2,5,7}, new int[]{4,5,2,7}),
				Arguments.of(new int[]{2,3}, new int[]{2,3})
		);
	}

}
