package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _728_SelfDividingNumbersTest {

    private final _728_SelfDividingNumbers selfDividingNumbers = new _728_SelfDividingNumbers();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(1, 22, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22)),
                Arguments.of(47, 85, Arrays.asList(48, 55, 66, 77))
        );
    }

    @DisplayName("Return a list of all the self-dividing numbers in the range [left, right]")
    @ParameterizedTest(name = "test #{index}: left \"{0}\", right \"{1}\", expected numbers \"{2}\"")
    @MethodSource({"useCases"})
    public void selfDividingNumbers(int left, int right, List<Integer> expected) {
        Assertions.assertEquals(expected, selfDividingNumbers.selfDividingNumbers(left, right));
    }

}
