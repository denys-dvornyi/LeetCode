package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _709_ToLowerCaseTest {

	private final _709_ToLowerCase toLowerCase = new _709_ToLowerCase();

	@DisplayName("Return the string after replacing every uppercase letter with the same lowercase letter")
	@ParameterizedTest(name = "test #{index}: string \"{0}\", expected string \"{1}\"")
	@MethodSource({"useCases"})
	public void toLowerCase(String s, String expected) {
		Assertions.assertEquals(expected, toLowerCase(s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
				Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1),
				Arguments.of(new int[]{-3, -1, 0, 3, 5, 9, 12, 17}, 17, 7),
				Arguments.of(new int[]{-99, -3, -1, 0, 3, 5, 9, 12, 17, 101}, -99, 0)
		);
	}

}
