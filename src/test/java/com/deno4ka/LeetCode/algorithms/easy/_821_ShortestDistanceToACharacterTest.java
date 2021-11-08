package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _821_ShortestDistanceToACharacterTest {

	private final _821_ShortestDistanceToACharacter shortestDistanceToACharacter = new _821_ShortestDistanceToACharacter();

	@DisplayName("Return an array of integers `answer` where `answer`.length == s.length " +
			"and `answer`[i] is the distance from index i to the closest occurrence of character c in s")
	@ParameterizedTest(name = "test #{index}: string \"{0}\", character \"{1}\", expected \"{2}\"")
	@MethodSource({"useCases"})
	public void shortestToChar(String s, char c, int[] expected) {
		Assertions.assertArrayEquals(expected, shortestDistanceToACharacter.shortestToChar(s, c));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("f", "f", new int[]{0}),
				Arguments.of("ccc", "c", new int[]{0, 0, 0}),
				Arguments.of("cdc", "d", new int[]{1, 0, 1}),
				Arguments.of("aaab", "b", new int[]{3, 2, 1, 0}),
				Arguments.of("bccc", "b", new int[]{0, 1, 2, 3}),
				Arguments.of("xyxyx", "x", new int[]{0, 1, 0, 1, 0}),
				Arguments.of("xyxyx", "y", new int[]{1, 0, 1, 0, 1}),
				Arguments.of("cbcccbc", "b", new int[]{1, 0, 1, 2, 1, 0, 1}),
				Arguments.of("loveleetcode", "e", new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0})
		);
	}

}
