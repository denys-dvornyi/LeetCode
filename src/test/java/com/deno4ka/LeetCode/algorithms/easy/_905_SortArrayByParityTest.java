package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _905_SortArrayByParityTest {

	private final _905_SortArrayByParity sortArrayByParity = new _905_SortArrayByParity();

	@DisplayName("Return any array that satisfies this condition")
	@ParameterizedTest(name = "test #{index}: nums \"{0}\", is monotonic \"{1}\"")
	@MethodSource({"useCases"})
	public void sortArrayByParity(int[] nums, int[] expected) {
		Assertions.assertArrayEquals(expected, sortArrayByParity.sortArrayByParity(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {3,1,2,4}, new int[] {2,4,1,3}),
				Arguments.of(new int[] {0,3,6,1,5,2,9,4}, new int[] {0,6,2,4,9,5,1,3}),
				Arguments.of(new int[] {0}, new int[] {0}),
				Arguments.of(new int[] {1,2}, new int[] {2,1}),
				Arguments.of(new int[] {1,2,1,2}, new int[] {2,2,1,1})
		);
	}

}
