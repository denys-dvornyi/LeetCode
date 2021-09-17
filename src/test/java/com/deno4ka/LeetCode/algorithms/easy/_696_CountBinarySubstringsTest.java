package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _696_CountBinarySubstringsTest {

	private final _696_CountBinarySubstrings countBinarySubstrings = new _696_CountBinarySubstrings();

	@DisplayName("Return the number of non-empty substrings that have the same number of 0's and 1's")
	@ParameterizedTest(name = "test #{index}: string \"{0}\", expected substrings \"{1}\"")
	@MethodSource({"useCases"})
	public void countBinarySubstrings(String s, int expected) {
		Assertions.assertEquals(expected, countBinarySubstrings.countBinarySubstrings(s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("00110011", 6),
				Arguments.of("10101", 4),
				Arguments.of("11011011", 4),
				Arguments.of("001010100", 6)
		);
	}

}
