package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _804_UniqueMorseCodeWordsTest {

	private final _804_UniqueMorseCodeWords uniqueMorseCodeWords = new _804_UniqueMorseCodeWords();

	@DisplayName("Return the number of different transformations among all words we have")
	@ParameterizedTest(name = "test #{index}: words \"{0}\", transformations \"{1}\"")
	@MethodSource({"useCases"})
	public void uniqueMorseRepresentations(String[] words, int expected) {
		Assertions.assertEquals(expected, uniqueMorseCodeWords.uniqueMorseRepresentations(words));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new String[] {"gin","zen","gig","msg"}, 2),
				Arguments.of(new String[] {"a"}, 1)
		);
	}

}
