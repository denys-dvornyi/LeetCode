package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _520_DetectCapitalTest {

	private _520_DetectCapital detectCapital = new _520_DetectCapital();

	@DisplayName("Detect Capital")
	@ParameterizedTest(name = "test #{index}: word {0} -> expected {1}")
	@MethodSource({"useCases"})
	public void detectCapitalUse(String word, boolean expected) {
		Assertions.assertEquals(expected, detectCapital.detectCapitalUse(word));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("USA", true),
				Arguments.of("Google", true),
				Arguments.of("leetcode", true),
				Arguments.of("A", true),
				Arguments.of("Ab", true),
				Arguments.of("z", true),
				Arguments.of("zA", false),
				Arguments.of("FlaG", false),
				Arguments.of("TrackEnsure", false)
		);
	}

}
