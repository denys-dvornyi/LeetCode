package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _999_AvailableCapturesForRookTest {

    private final _999_AvailableCapturesForRook availableCapturesForRook = new _999_AvailableCapturesForRook();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new char[][]{
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'}}, 3),
                Arguments.of(new char[][]{
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                        {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
                        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'}}, 0),
                Arguments.of(new char[][]{
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'B', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'}}, 3)
        );
    }

    @DisplayName("Return the number of available captures for the white rook")
    @ParameterizedTest(name = "test #{index}: chessboard \"{0}\", number of rook captures \"{1}\"")
    @MethodSource({"useCases"})
    public void numRookCaptures(char[][] board, int expected) {
        Assertions.assertEquals(expected, availableCapturesForRook.numRookCaptures(board));
    }

}
