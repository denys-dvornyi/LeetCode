package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _868_BinaryGapTest {

	private final _868_BinaryGap binaryGap = new _868_BinaryGap();

	@DisplayName("Return the longest distance between any two adjacent 1's in the binary representation of n")
	@ParameterizedTest(name = "test #{index}: number \"{0}\", expected \"{1}\"")
	@MethodSource({"useCases"})
	public void binaryGap(int n, int expected) {
		Assertions.assertEquals(expected, binaryGap.binaryGap(n));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[][] { {1,2} }, new int[][] { {1},{2} } )
		);
	}

}
