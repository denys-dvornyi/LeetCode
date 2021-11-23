package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _942_DIStringMatchTest {

	private final _942_DIStringMatch diStringMatch = new _942_DIStringMatch();

	@DisplayName("Reconstruct the permutation perm and return it")
	@ParameterizedTest(name = "test #{index}: string \"{0}\", reconstructed array \"{1}\"")
	@MethodSource({"useCases"})
	public void diStringMatch(String s, int[] expected) {
		Assertions.assertArrayEquals(expected, diStringMatch.diStringMatch(s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("IDID", new int[]{0,4,1,3,2}),
				Arguments.of("DIDI", new int[]{1,0,1,0,1}),
				Arguments.of("DDI", new int[]{3,2,0,1}),
				Arguments.of("III", new int[]{0,1,2,3}),
				Arguments.of("DDD", new int[]{3,2,1,0})
		);
	}

}
