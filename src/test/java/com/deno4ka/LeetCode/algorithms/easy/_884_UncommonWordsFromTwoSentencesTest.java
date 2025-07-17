package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _884_UncommonWordsFromTwoSentencesTest {

    private final _884_UncommonWordsFromTwoSentences uncommonWordsFromTwoSentences = new _884_UncommonWordsFromTwoSentences();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of("this apple is sweet", "this apple is sour", new String[]{"sweet", "sour"}),
                Arguments.of("apple apple", "banana", new String[]{"banana"}),
                Arguments.of("my name is chicken mac naggets", "very well дубовый table",
                        new String[]{"my", "name", "is", "chicken", "mac", "naggets", "very", "well", "дубовый", "table"})
        );
    }

    @DisplayName("Return a list of all the uncommon words")
    @ParameterizedTest(name = "test #{index}: sentence 1 \"{0}\", sentence 2 \"{1}\", uncommon words \"{2}\"")
    @MethodSource({"useCases"})
    public void uncommonFromSentences(String s1, String s2, String[] expected) {
        Assertions.assertArrayEquals(expected, uncommonWordsFromTwoSentences.uncommonFromSentences(s1, s2));
    }

}
