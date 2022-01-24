package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _1047_RemoveAllAdjacentDuplicatesInStringTest {

	private final _1047_RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString = new _1047_RemoveAllAdjacentDuplicatesInString();

	@DisplayName("Return the final string after all such duplicate removals have been made")
	@ParameterizedTest(name = "test #{index}: string \"{0}\", expected \"{1}\"")
	@MethodSource({"useCases"})
	public void removeDuplicates(String s, String expected) {
		Assertions.assertEquals(expected, removeAllAdjacentDuplicatesInString.removeDuplicates(s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("abbaca", "ca"),
				Arguments.of("azxxzy", "ay"),
				Arguments.of("abccbefggfh", "aeh"),
				Arguments.of("abccbefggfhddhe", "a")
		);
	}

}
