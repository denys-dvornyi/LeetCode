package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _392_IsSubsequenceTest {

	private _392_IsSubsequence isSubsequence = new _392_IsSubsequence();

	@DisplayName("Is Subsequence")
	@ParameterizedTest(name = "test #{index}: #1 \"{0}\", #2 \"{1}\" -> expect {2}")
	@MethodSource({"useCases"})
	public void findLHS(String s, String t, boolean expected) {
		Assertions.assertEquals(expected, isSubsequence.isSubsequence(s, t));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("abc", "ahbgdc", true),
				Arguments.of("axc", "ahbgdc", false),
				Arguments.of("ace", "abcde", true),
				Arguments.of("aec", "abcde", false)
		);
	}

}
