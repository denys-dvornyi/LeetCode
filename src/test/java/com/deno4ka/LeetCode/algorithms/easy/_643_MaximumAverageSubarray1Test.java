package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _643_MaximumAverageSubarray1Test {

	private _643_MaximumAverageSubarray1 maximumAverageSubarray1 = new _643_MaximumAverageSubarray1();

	@DisplayName("Find the contiguous subarray of given length k that has the maximum average value")
	@ParameterizedTest(name = "test #{index}: array \"{0}\", length \"{1}\" expected average \"{2}\"")
	@MethodSource({"useCases"})
	public void findMaxAverage(int[] nums, int k, boolean expected) {
		Assertions.assertEquals(expected, maximumAverageSubarray1.findMaxAverage(nums, k));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {1,12,-5,-6,50,3}, 4, 12.75),
				Arguments.of(new int[] {0,0,0,0}, 3, 0.0),
				Arguments.of(new int[] {1,2,3,4}, 2, 3.5),
				Arguments.of(new int[] {-2,-1,0,1,2}, 3, 1.0),
				Arguments.of(new int[] {10,0,-10,0,10,0,-10}, 5, 2.0)
		);
	}

}
