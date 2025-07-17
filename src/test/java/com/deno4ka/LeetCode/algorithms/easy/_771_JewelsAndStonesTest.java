package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _771_JewelsAndStonesTest {

    private final _771_JewelsAndStones jewelsAndStones = new _771_JewelsAndStones();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of("aA", "aAAbbbb", 3),
                Arguments.of("z", "ZZ", 0)
        );
    }

    @DisplayName("Return how many of the stones you have are also jewels")
    @ParameterizedTest(name = "test #{index}: jewels \"{0}\", stones \"{1}\", jewels in stones \"{2}\"")
    @MethodSource({"useCases"})
    public void numJewelsInStones(String jewels, String stones, int expected) {
        Assertions.assertEquals(expected, jewelsAndStones.numJewelsInStones(jewels, stones));
    }

}
