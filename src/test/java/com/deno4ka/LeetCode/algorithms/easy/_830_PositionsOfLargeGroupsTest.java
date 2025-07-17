package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class _830_PositionsOfLargeGroupsTest {

    private final _830_PositionsOfLargeGroups positionsOfLargeGroups = new _830_PositionsOfLargeGroups();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of("aaa", List.of(List.of(0, 2))),
                Arguments.of("abbxxxxzzy", List.of(List.of(3, 6))),
                Arguments.of("abcdddeeeeaabbbcd", List.of(List.of(3, 5), List.of(6, 9), List.of(12, 14))),
                Arguments.of("aba", List.of())
        );
    }

    @DisplayName("Return the intervals of every large group sorted in increasing order by start index")
    @ParameterizedTest(name = "test #{index}: letters \"{0}\", expected \"{1}\"")
    @MethodSource({"useCases"})
    public void largeGroupPositions(String s, List<List<Integer>> expected) {
        Assertions.assertEquals(expected, positionsOfLargeGroups.largeGroupPositions(s));
    }

}
