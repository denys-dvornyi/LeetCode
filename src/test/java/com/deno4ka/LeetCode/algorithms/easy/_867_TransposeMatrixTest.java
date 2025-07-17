package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _867_TransposeMatrixTest {

    private final _867_TransposeMatrix transposeMatrix = new _867_TransposeMatrix();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2}}, new int[][]{{1}, {2}}),
                Arguments.of(new int[][]{{1}, {2}}, new int[][]{{1, 2}}),
                Arguments.of(new int[][]{{1, 2}, {3, 4}}, new int[][]{{1, 3}, {2, 4}}),
                Arguments.of(new int[][]{{1, 3}, {2, 4}}, new int[][]{{1, 2}, {3, 4}}),
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}),
                Arguments.of(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{1, 4}, {2, 5}, {3, 6}}),
                Arguments.of(new int[][]{{1, 4}, {2, 5}, {3, 6}}, new int[][]{{1, 2, 3}, {4, 5, 6}})
        );
    }

    @DisplayName("Return the transpose of matrix")
    @ParameterizedTest(name = "test #{index}: matrix \"{0}\", expected \"{1}\"")
    @MethodSource({"useCases"})
    public void transpose(int[][] matrix, int[][] expected) {
        Assertions.assertArrayEquals(expected, transposeMatrix.transpose(matrix));
    }

}
