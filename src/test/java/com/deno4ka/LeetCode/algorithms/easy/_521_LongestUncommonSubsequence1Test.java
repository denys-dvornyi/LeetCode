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
	@ParameterizedTest(name = "test #{index}: word #1 [{0}], word #2 [{1}] -> expected subsequence length {2}")
	@MethodSource({"useCases"})
	public void findLUSlength(String word1, String word2, int expected) {
		Assertions.assertEquals(expected, longestUncommonSubsequence.findLUSlength(word1, word2));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("", "", -1),
				Arguments.of("aba", "cdc", 3),
				Arguments.of("aaa", "a", 3),
				Arguments.of("a", "aaa", 3),
				Arguments.of("aaa", "bbb", 3),
				Arguments.of("aefeaf", "", 6),
				Arguments.of("aefawfawfawfaw", "aefawfeawfwafwaef", 17),
				Arguments.of("horbxeemlgqpqbujbdagizcfairalg", "iwvtgyojrfhyzgyzeikqagpfjoaeen", 30),
				Arguments.of("tncvtnrlgisuqegfabgzktauvdlgnw", "hgkptzplsqbpelncxmxzbujipzthee", 30),
				Arguments.of("qibiuzdonfnvgjnfoywucjbivmbxnx", "djttbvwzngbdsevgqlduegvzimnlki", 30)
		);
	}

}
