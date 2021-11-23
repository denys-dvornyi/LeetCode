package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _953_VerifyingAnAlienDictionaryTest {

	private final _953_VerifyingAnAlienDictionary verifyingAnAlienDictionary = new _953_VerifyingAnAlienDictionary();

	@DisplayName("Return true if and only if the given words are sorted lexicographically in this alien language")
	@ParameterizedTest(name = "test #{index}: words \"{0}\", order \"{1}\", is alien sorted \"{2}\"")
	@MethodSource({"useCases"})
	public void isAlienSorted(String[] words, String order, boolean expected) {
		Assertions.assertEquals(expected, verifyingAnAlienDictionary.isAlienSorted(words, order));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz", true),
				Arguments.of(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz", false),
				Arguments.of(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz", false)

		);
	}

}
