package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _844_BackspaceStringCompareTest {

	private final _844_BackspaceStringCompare backspaceStringCompare = new _844_BackspaceStringCompare();

	@DisplayName("Return true if they are equal when both are typed into empty text editors")
	@ParameterizedTest(name = "test #{index}: first \"{0}\", second \"{1}\", isEqual \"{2}\"")
	@MethodSource({"useCases"})
	public void backspaceCompare(String s, String t, boolean expected) {
		Assertions.assertEquals(expected, backspaceStringCompare.backspaceCompare(s, t));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("ab#c", "ad#c", true),
				Arguments.of("ab##", "c#d#", true),
				Arguments.of("a##c", "#a#c", true),
				Arguments.of("a#c", "b", false),
				Arguments.of("xywrrmp", "xywrrmu#p", true),
				Arguments.of("xywrrmp", "xywrrm#p", false),
				Arguments.of("bxj##tw", "bxj###tw", false),
				Arguments.of("y#fo##f", "y#fx#o##f", true)
		);
	}

}
