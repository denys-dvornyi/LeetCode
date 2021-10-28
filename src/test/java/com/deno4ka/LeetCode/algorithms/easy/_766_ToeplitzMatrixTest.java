package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _766_ToeplitzMatrixTest {

	private final _766_ToeplitzMatrix toeplitzMatrix = new _766_ToeplitzMatrix();

	@DisplayName("Return true if the matrix is Toeplitz. Otherwise, return false")
	@ParameterizedTest(name = "test #{index}: matrix \"{0}\", is Toeplitz \"{1}\"")
	@MethodSource({"useCases"})
	public void isToeplitzMatrix(int[][] matrix, boolean expected) {
		Assertions.assertEquals(expected, toeplitzMatrix.isToeplitzMatrix(matrix));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 1, 2, 3}, new int[]{9, 5, 1, 2}}, true),
				Arguments.of(new int[][]{new int[]{1, 2}, new int[]{2, 2}}, false)
		);
	}

}
