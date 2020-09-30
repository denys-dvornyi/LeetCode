package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _598_RangeAddition2Test {

	private _598_RangeAddition2 rangeAddition2 = new _598_RangeAddition2();

	@DisplayName("Range Addition II")
	@ParameterizedTest(name = "test #{index}: matrix to reshape \"{0}\", rows {1}, columns {2} -> expected matrix \"{3}\"")
	@MethodSource({"useCases"})
	public void arrayPairSum(int m, int n, int[][] ops, int expected) {
		Assertions.assertEquals(expected, rangeAddition2.maxCount(m, n, ops));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(3, 3, new int[][] {{2,2}, {3,3}}, 4)
		);
	}

}
