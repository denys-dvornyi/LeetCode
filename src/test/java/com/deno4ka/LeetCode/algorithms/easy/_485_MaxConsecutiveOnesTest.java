package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _485_MaxConsecutiveOnesTest {

	private _485_MaxConsecutiveOnes maxConsecutiveOnes = new _485_MaxConsecutiveOnes();

	@DisplayName("Maximum number of consecutive 1s in this array")
	@ParameterizedTest(name = "test #{index}: nums {0} -> expected {1}")
	@MethodSource({"useCases"})
	public void findMaxConsecutiveOnes(int[] nums, int expected) {
		assertEquals(expected, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {1,1,0,1,1,1}, 3),
				Arguments.of(new int[] {1,0,1,1,0,1}, 2)
		);
	}

}
