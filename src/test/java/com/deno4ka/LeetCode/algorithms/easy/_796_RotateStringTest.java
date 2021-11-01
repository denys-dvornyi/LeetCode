package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _796_RotateStringTest {

	private final _796_RotateString rotateString = new _796_RotateString();

	@DisplayName("Return true if and only if s can become goal after some number of shifts on s")
	@ParameterizedTest(name = "test #{index}: jewels \"{0}\", stones \"{1}\", jewels in stones \"{2}\"")
	@MethodSource({"useCases"})
	public void rotateString(String s, String goal, boolean expected) {
		Assertions.assertEquals(expected, rotateString.rotateString(s, goal));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("abcde", "cdeab", true),
				Arguments.of("abcde", "abced", false),
				Arguments.of("w", "w", true),
				Arguments.of("w", "g", false),
				Arguments.of("g", "w", false),
				Arguments.of("bbc", "bcb", true),
				Arguments.of("aa", "a", false),
				Arguments.of("a", "aa", true),
				Arguments.of("a", "ba", true),
				Arguments.of("a", "bac", true)
		);
	}

}
