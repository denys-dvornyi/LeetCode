package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _509_FibonacciNumberTest {

	private _509_FibonacciNumber fibonacciNumber = new _509_FibonacciNumber();

	@DisplayName("Fibonacci numbers")
	@ParameterizedTest(name = "test #{index}: fibonacci number {0} -> expected {1}")
	@MethodSource({"useCases"})
	public void fib(int num, int expected) {
		assertEquals(expected, fibonacciNumber.fib(num));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(
						0, 0,
						1, 1,
						2, 1,
						3, 2,
						4, 3,
						5, 5,
						6, 8,
						7, 13,
						8, 21,
						9, 34,
						10, 55
				)
		);
	}

}
