package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _521_LongestUncommonSubsequence1Test {

	private _521_LongestUncommonSubsequence1 longestUncommonSubsequence = new _521_LongestUncommonSubsequence1();

	@DisplayName("Longest Uncommon Subsequence")
	@ParameterizedTest(name = "test #{index}: word1 {0}, word2 {1} -> expected subsequence length {2}")
	@MethodSource({"useCases"})
	public void findLUSlength(String word1, String word2, int expected) {
		Assertions.assertEquals(expected, longestUncommonSubsequence.findLUSlength(word1, word2));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("aba", "cdc", 3)
		);
	}

}
