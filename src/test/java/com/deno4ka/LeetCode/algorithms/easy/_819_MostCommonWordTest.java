package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _819_MostCommonWordTest {

	private final _819_MostCommonWord mostCommonWord = new _819_MostCommonWord();

	@DisplayName("Return the most frequent word that is not banned")
	@ParameterizedTest(name = "test #{index}: paragraph \"{0}\", banned \"{1}\", expected \"{2}\"")
	@MethodSource({"useCases"})
	public void mostCommonWord(String paragraph, String[] banned, String expected) {
		Assertions.assertEquals(expected, mostCommonWord.mostCommonWord(paragraph, banned));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}, "ball"),
				Arguments.of("a.", new String[] {}, "a")
		);
	}

}
