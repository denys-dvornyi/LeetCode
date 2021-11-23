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
				Arguments.of("I", new int[]{0,1}),
				Arguments.of("D", new int[]{1,0}),

				Arguments.of("II", new int[]{0,1,2}),
				Arguments.of("ID", new int[]{0,2,1}),
				Arguments.of("DI", new int[]{2,0,1}),
				Arguments.of("DD", new int[]{2,1,0}),

				Arguments.of("III", new int[]{0,1,2,3}),

				Arguments.of("IID", new int[]{0,1,3,2}),
				Arguments.of("IDI", new int[]{0,3,1,2}),
				Arguments.of("DII", new int[]{3,0,1,2}),

				Arguments.of("IDD", new int[]{0,3,2,1}),
				Arguments.of("DID", new int[]{3,0,2,1}),
				Arguments.of("DDI", new int[]{3,2,0,1}),

				Arguments.of("DDD", new int[]{3,2,1,0}),

				Arguments.of("IDID", new int[]{0,4,1,3,2}),
				Arguments.of("IDDI", new int[]{0,4,3,1,2}),
				Arguments.of("DIDI", new int[]{4,0,3,1,2}),

				Arguments.of("IIIII", new int[]{0,1,2,3,4,5}),
				Arguments.of("DIDID", new int[]{5,0,4,1,3,2}),
				Arguments.of("DDDDD", new int[]{5,4,3,2,1,0})
		);
	}

}
