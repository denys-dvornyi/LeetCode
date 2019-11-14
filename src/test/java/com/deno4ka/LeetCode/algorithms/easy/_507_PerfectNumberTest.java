package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _507_PerfectNumberTest {

	private _507_PerfectNumber perfectNumber = new _507_PerfectNumber();

	@DisplayName("Detect Perfect Number")
	@ParameterizedTest(name = "test #{index}: perfect number {0} -> expected {1}")
	@MethodSource({"useCases"})
	public void fib(int num, boolean expected) {
		assertEquals(expected, perfectNumber.checkPerfectNumber(num));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(4, false),
				Arguments.of(6, true),
				Arguments.of(7, false),
				Arguments.of(28, true)
		);
	}

}
