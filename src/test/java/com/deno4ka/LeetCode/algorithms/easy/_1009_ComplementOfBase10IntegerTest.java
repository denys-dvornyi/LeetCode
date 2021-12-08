package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _1009_ComplementOfBase10IntegerTest {

	private final _1009_ComplementOfBase10Integer complementOfBase10Integer = new _1009_ComplementOfBase10Integer();

	@DisplayName("Given an integer n, return its complement")
	@ParameterizedTest(name = "test #{index}: integer \"{0}\", complement \"{1}\"")
	@MethodSource({"useCases"})
	public void bitwiseComplement(int n, int expected) {
		Assertions.assertEquals(expected, complementOfBase10Integer.bitwiseComplement(n));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(5, 2),
				Arguments.of(7, 0),
				Arguments.of(10, 5)
		);
	}

}
