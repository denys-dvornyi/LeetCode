package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _925_LongPressedNameTest {

    private final _925_LongPressedName longPressedName = new _925_LongPressedName();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of("alex", "aaleex", true),
                Arguments.of("saeed", "ssaaedd", false),
                Arguments.of("leelee", "lleeelee", true),
                Arguments.of("laiden", "laiden", true),
                Arguments.of("aaabcd", "aaaabcd", true),
                Arguments.of("aaabcd", "aaabccd", true),
                Arguments.of("abcd", "abcddd", true),
                Arguments.of("abcd", "bbcd", false),
                Arguments.of("abcd", "abcdz", false)
        );
    }

    @DisplayName("Return `true` if it is possible that it was your friends name, with some characters (possibly none) being long pressed")
    @ParameterizedTest(name = "test #{index}: name \"{0}\", typed \"{1}\", is long pressed name \"{2}\"")
    @MethodSource({"useCases"})
    public void isLongPressedName(String name, String typed, boolean expected) {
        Assertions.assertEquals(expected, longPressedName.isLongPressedName(name, typed));
    }

}
