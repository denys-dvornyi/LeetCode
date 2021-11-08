package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _824_GoatLatinTest {

	private final _824_GoatLatin goatLatin = new _824_GoatLatin();

	@DisplayName("Return the final sentence representing the conversion from sentence to Goat Latin")
	@ParameterizedTest(name = "test #{index}: sentence \"{0}\", expected \"{1}\"")
	@MethodSource({"useCases"})
	public void toGoatLatin(String sentence, String expected) {
		Assertions.assertEquals(expected, goatLatin.toGoatLatin(sentence));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("I speak Goat Latin", "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"),
				Arguments.of("The quick brown fox jumped over the lazy dog", "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa")
		);
	}

}
