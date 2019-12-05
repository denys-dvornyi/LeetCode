package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _541_ReverseString2Test {

	private _541_ReverseString2 reverseString2 = new _541_ReverseString2();

	@DisplayName("Reverse the first k characters for every 2k characters counting from the start of the string")
	@ParameterizedTest(name = "test #{index}: String {0}, k {1} -> expected {2}")
	@MethodSource({"useCases"})
	public void reverseStr(String s, int k, String expected) {
		Assertions.assertEquals(expected, reverseString2.reverseStr(s, k));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("abcdefg", 2, "bacdfeg")
		);
	}

}
