package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _1002_FindCommonCharactersTest {

	private final _1002_FindCommonCharacters findCommonCharacters = new _1002_FindCommonCharacters();

	@DisplayName("Return an array of all characters that show up in all strings within the words (including duplicates) (in any order)")
	@ParameterizedTest(name = "test #{index}: words \"{0}\", common chars \"{1}\"")
	@MethodSource({"useCases"})
	public void commonChars(String[] words, List<String> expected) {
		Assertions.assertEquals(expected, findCommonCharacters.commonChars(words));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new String[]{"bella","label","roller"}, new ArrayList<>(Arrays.asList("e","l","l"))),
				Arguments.of(new String[]{"cool","lock","cook"}, new ArrayList<>(Arrays.asList("c","o")))
		);
	}

}
