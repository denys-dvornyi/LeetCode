package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _509_FibonacciNumberTest {

	private final _509_FibonacciNumber fibonacciNumber = new _509_FibonacciNumber();

	@DisplayName("Fibonacci numbers")
	@ParameterizedTest(name = "test #{index}: fibonacci number {0} -> expected {1}")
	@MethodSource({"useCases"})
	public void fibonacciNumber(int num, int expected) {
		assertEquals(expected, fibonacciNumber.fib(num));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(0, 0),
				Arguments.of(1, 1),
				Arguments.of(2, 1),
				Arguments.of(3, 2),
				Arguments.of(4, 3),
				Arguments.of(5, 5),
				Arguments.of(6, 8),
				Arguments.of(7, 13),
				Arguments.of(8, 21),
				Arguments.of(9, 34),
				Arguments.of(10, 55)
		);
	}

}
