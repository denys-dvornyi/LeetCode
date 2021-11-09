package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _859_BuddyStringsTest {

	private final _859_BuddyStrings buddyStrings = new _859_BuddyStrings();

	@DisplayName("Return true if you can swap two letters in s so the result is equal to goal, otherwise, return false")
	@ParameterizedTest(name = "test #{index}: string \"{0}\", goal \"{1}\", isBuddy \"{2}\"")
	@MethodSource({"useCases"})
	public void buddyStrings(String s, String goal, boolean expected) {
		Assertions.assertEquals(expected, buddyStrings.buddyStrings(s, goal));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("ab", "ba", true),
				Arguments.of("ab", "ab", false),
				Arguments.of("aa", "aa", true),
				Arguments.of("aaaaaaabc", "aaaaaaacb", true)
		);
	}

}