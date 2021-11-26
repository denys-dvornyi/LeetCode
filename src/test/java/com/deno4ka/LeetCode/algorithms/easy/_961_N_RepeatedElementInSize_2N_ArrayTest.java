package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _961_N_RepeatedElementInSize_2N_ArrayTest {

	private final _961_N_RepeatedElementInSize_2N_Array nRepeatedElementInSize2NArray = new _961_N_RepeatedElementInSize_2N_Array();

	@DisplayName("Return the element that is repeated n times")
	@ParameterizedTest(name = "test #{index}: nums \"{0}\", expected element \"{1}\"")
	@MethodSource({"useCases"})
	public void isAlienSorted(int[] nums, int expected) {
		Assertions.assertEquals(expected, nRepeatedElementInSize2NArray.repeatedNTimes(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{1,2,3,3}, 3),
				Arguments.of(new int[]{2,1,2,5,3,2}, 2),
				Arguments.of(new int[]{5,1,5,2,5,3,5,4}, 5)

		);
	}

}
