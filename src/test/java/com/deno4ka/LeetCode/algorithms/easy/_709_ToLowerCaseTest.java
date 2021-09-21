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
		Assertions.assertEquals(expected, toLowerCase.toLowerCase(s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("Hello", "hello"),
				Arguments.of("here", "here"),
				Arguments.of("LOVELY", "lovely"),
				Arguments.of("al&phaBET", "al&phabet")
		);
	}

}
