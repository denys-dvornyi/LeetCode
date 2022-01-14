package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _1021_RemoveOutermostParenthesesTest {

	private final _1021_RemoveOutermostParentheses removeOutermostParentheses = new _1021_RemoveOutermostParentheses();

	@DisplayName("Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s")
	@ParameterizedTest(name = "test #{index}: s \"{0}\", expected \"{1}\"")
	@MethodSource({"useCases"})
	public void removeOuterParentheses(String s, String expected) {
		Assertions.assertEquals(expected, removeOutermostParentheses.removeOuterParentheses(s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("(()())(())", "()()()"),
				Arguments.of("(()())(())(()(()))", "()()()()(())"),
				Arguments.of("()()", "")
		);
	}

}
