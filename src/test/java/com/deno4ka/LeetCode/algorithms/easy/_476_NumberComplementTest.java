package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _476_NumberComplementTest {

	private final _476_NumberComplement numberComplementImpl = new _476_NumberComplement();

	@DisplayName("Output its complement number")
	@ParameterizedTest(name = "test #{index}: number {0} -> expected complement {1}")
	@MethodSource({"useCases"})
	public void findComplement(int number, int expected) {
		assertEquals(expected, numberComplementImpl.findComplement(number));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(5, 2),
				Arguments.of(1, 0)
		);
	}

}
