package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _941_ValidMountainArrayTest {

	private final _941_ValidMountainArray validMountainArray = new _941_ValidMountainArray();

	@DisplayName("Return true if and only if it is a valid mountain array")
	@ParameterizedTest(name = "test #{index}: arr \"{0}\", is valid mountain array \"{1}\"")
	@MethodSource({"useCases"})
	public void validMountainArray(int[] arr, boolean expected) {
		Assertions.assertEquals(expected, validMountainArray.validMountainArray(arr));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{2,1}, false),
				Arguments.of(new int[]{3,5,5}, false),
				Arguments.of(new int[]{0,3,2,1}, true)
		);
	}

}
