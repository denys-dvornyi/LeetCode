package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _997_FindTheTownJudgeTest {

    private final _997_FindTheTownJudge findTheTownJudge = new _997_FindTheTownJudge();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(2, new int[][]{{1, 2}}, 2),
                Arguments.of(3, new int[][]{{1, 3}, {2, 3}}, 3),
                Arguments.of(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}, -1),
                Arguments.of(3, new int[][]{{1, 2}, {2, 3}}, -1),
                Arguments.of(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}, 3)
        );
    }

    @DisplayName("Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise")
    @ParameterizedTest(name = "test #{index}: number of citizens \"{0}\", trusts \"{1}\", judge label \"{2}\"")
    @MethodSource({"useCases"})
    public void findJudge(int n, int[][] trust, int expected) {
        Assertions.assertEquals(expected, findTheTownJudge.findJudge(n, trust));
    }

}
