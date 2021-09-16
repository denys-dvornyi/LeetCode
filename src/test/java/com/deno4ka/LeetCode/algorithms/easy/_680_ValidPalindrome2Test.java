package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _680_ValidPalindrome2Test {

	private final _680_ValidPalindrome2 validPalindrome2 = new _680_ValidPalindrome2();

	@DisplayName("Return true if the s can be palindrome after deleting at most one character from it")
	@ParameterizedTest(name = "test #{index}: string \"{0}\", expected result \"{1}\"")
	@MethodSource({"useCases"})
	public void validPalindrome(String s, boolean expected) {
		Assertions.assertEquals(expected, validPalindrome2.validPalindrome(s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("aba", true),
				Arguments.of("abca", true),
				Arguments.of("acba", true),
				Arguments.of("abc", false),
				Arguments.of("zabccba", true),
				Arguments.of("abccbax", true),
				Arguments.of("yabccbay", false)
		);
	}

}
