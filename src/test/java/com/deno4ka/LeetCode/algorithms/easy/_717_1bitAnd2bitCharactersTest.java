package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _717_1bitAnd2bitCharactersTest {

	private final _717_1bitAnd2bitCharacters bitCharacters = new _717_1bitAnd2bitCharacters();

	@DisplayName("Return true if the last character must be a one-bit character")
	@ParameterizedTest(name = "test #{index}: array \"{0}\", expected result \"{1}\"")
	@MethodSource({"useCases"})
	public void isOneBitCharacter(int[] bits, boolean expected) {
		Assertions.assertEquals(expected, bitCharacters.isOneBitCharacter(bits));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{1, 0, 0}, true),
				Arguments.of(new int[]{1, 1, 1, 0}, false),
				Arguments.of(new int[]{}, false),
				Arguments.of(new int[]{0}, true),
				Arguments.of(new int[]{0, 0}, true),
				Arguments.of(new int[]{1, 0}, false),
				Arguments.of(new int[]{0, 1, 0}, false),
				Arguments.of(new int[]{0, 1, 0, 0}, true),
				Arguments.of(new int[]{0, 1, 1, 0}, true),
				Arguments.of(new int[]{1, 1, 1, 1}, false)
		);
	}

}
