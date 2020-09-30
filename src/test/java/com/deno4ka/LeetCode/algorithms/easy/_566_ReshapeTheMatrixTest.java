package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _566_ReshapeTheMatrixTest {

	private _566_ReshapeTheMatrix reshapeTheMatrix = new _566_ReshapeTheMatrix();

	@DisplayName("Reshape the Matrix")
	@ParameterizedTest(name = "test #{index}: matrix to reshape \"{0}\", rows {1}, columns {2} -> expected matrix \"{3}\"")
	@MethodSource({"useCases"})
	public void arrayPairSum(int[][] nums, int r, int c, int[][] expected) {
		Assertions.assertArrayEquals(expected, reshapeTheMatrix.matrixReshape(nums, r, c));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[][] {{1,2}, {3,4}}, 1, 4, new int[][] {{1,2,3,4}}),
				Arguments.of(new int[][] {{1,2}, {3,4}}, 2, 4, new int[][] {{1,2}, {3,4}})
		);
	}

}
