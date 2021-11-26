package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class _989_AddToArrayFormOfIntegerTest {

	private final _989_AddToArrayFormOfInteger addToArrayFormOfInteger = new _989_AddToArrayFormOfInteger();

	@DisplayName("Return the array-form of the integer num + k")
	@ParameterizedTest(name = "test #{index}: num \"{0}\", integer \"{1}\", expected list \"{2}\"")
	@MethodSource({"useCases"})
	public void addToArrayForm(int[] num, int k, List<Integer> expected) {
		Assertions.assertEquals(expected, addToArrayFormOfInteger.addToArrayForm(num, k));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{1,2,0,0}, 34, List.of(new int[]{1,2,3,4})),
				Arguments.of(new int[]{2,7,4}, 181, List.of(new int[]{4,5,5})),
				Arguments.of(new int[]{2,1,5}, 806, List.of(new int[]{1,0,2,1})),
				Arguments.of(new int[]{9,9,9,9,9,9,9,9,9,9}, 1, List.of(new int[]{1,0,0,0,0,0,0,0,0,0,0}))
		);
	}

}
