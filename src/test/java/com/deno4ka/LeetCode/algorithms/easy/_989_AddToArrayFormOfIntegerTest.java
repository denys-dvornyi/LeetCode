package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
				Arguments.of(new int[]{1,2,0,0}, 34, Arrays.stream(new int[]{1,2,3,4}).boxed().collect(Collectors.toList())),
				Arguments.of(new int[]{2,7,4}, 181, Arrays.stream(new int[]{4,5,5}).boxed().collect(Collectors.toList())),
				Arguments.of(new int[]{2,1,5}, 806, Arrays.stream(new int[]{1,0,2,1}).boxed().collect(Collectors.toList())),
				Arguments.of(new int[]{9,9,9,9,9,9,9,9,9,9}, 1, Arrays.stream(new int[]{1,0,0,0,0,0,0,0,0,0,0}).boxed().collect(Collectors.toList()))
		);
	}

}
