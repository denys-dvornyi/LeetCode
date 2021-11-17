package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _896_MonotonicArrayTest {

	private final _896_MonotonicArray monotonicArray = new _896_MonotonicArray();

	@DisplayName("Return true if the given array is monotonic, or false otherwise")
	@ParameterizedTest(name = "test #{index}: nums \"{0}\", is monotonic \"{1}\"")
	@MethodSource({"useCases"})
	public void isMonotonic(int[] nums, boolean expected) {
		Assertions.assertEquals(expected, monotonicArray.isMonotonic(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {-555}, true),
				Arguments.of(new int[] {-888, 777}, true),
				Arguments.of(new int[] {333, -444}, true),
				Arguments.of(new int[] {1,2,2,3}, true),
				Arguments.of(new int[] {6,5,4,4}, true),
				Arguments.of(new int[] {1,3,2}, false),
				Arguments.of(new int[] {1,2,4,5}, true),
				Arguments.of(new int[] {1,1,1}, true),
				Arguments.of(new int[] {-999,0,999}, true),
				Arguments.of(new int[] {0,-1,-2,-3,-4}, true),
				Arguments.of(new int[] {-4,-3,-2,-1,0}, true),
				Arguments.of(new int[] {1,0,1}, false),
				Arguments.of(new int[] {1,0,0,0,0,0,0,0,0,0,0,0,1}, false),
				Arguments.of(new int[] {-1,0,-1}, false)
		);
	}

}
