package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _682_BaseballGameTest {

	private final _682_BaseballGame baseballGame = new _682_BaseballGame();

	@DisplayName("Return the sum of all the scores on the record")
	@ParameterizedTest(name = "test #{index}: scores \"{0}\", expected sum \"{1}\"")
	@MethodSource({"useCases"})
	public void calPoints(String[] ops, int expected) {
		Assertions.assertEquals(expected, baseballGame.calPoints(ops));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new String[]{"1"}, 1),
				Arguments.of(new String[]{"5","2","C","D","+"}, 30),
				Arguments.of(new String[]{"5","-2","4","C","D","9","+","+"}, 27)
		);
	}

}
