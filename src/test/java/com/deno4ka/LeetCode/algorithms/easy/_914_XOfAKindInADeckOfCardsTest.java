package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _914_XOfAKindInADeckOfCardsTest {

	private final _914_XOfAKindInADeckOfCards xOfAKindInADeckOfCards = new _914_XOfAKindInADeckOfCards();

	@DisplayName("Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where: " +
			"each group has exactly X cards")
	@ParameterizedTest(name = "test #{index}: deck \"{0}\", is possible \"{1}\"")
	@MethodSource({"useCases"})
	public void hasGroupsSizeX(int[] deck, boolean expected) {
		Assertions.assertEquals(expected, xOfAKindInADeckOfCards.hasGroupsSizeX(deck));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {1,2,3,4,4,3,2,1}, true),
				Arguments.of(new int[] {1,1,1,2,2,2,3,3}, false),
				Arguments.of(new int[] {1}, false),
				Arguments.of(new int[] {1,1}, true),
				Arguments.of(new int[] {1,1,2,2,2,2}, true)
		);
	}

}
