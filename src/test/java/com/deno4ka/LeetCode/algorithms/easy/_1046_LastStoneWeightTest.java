package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _1046_LastStoneWeightTest {

	private final _1046_LastStoneWeight lastStoneWeight = new _1046_LastStoneWeight();

	@DisplayName("Return the smallest possible weight of the left stone. If there are no stones left, return 0")
	@ParameterizedTest(name = "test #{index}: stones \"{0}\", expected \"{1}\"")
	@MethodSource({"useCases"})
	public void lastStoneWeight(int[] stones, int expected) {
		Assertions.assertEquals(expected, lastStoneWeight.lastStoneWeight(stones));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] { 2,7,4,1,8,1 }, 1),
				Arguments.of(new int[] { 1 }, 1),
				Arguments.of(new int[] { 0 }, 0),
				Arguments.of(new int[] { 999 }, 999)
		);
	}

}
