package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _557_ReverseWordsInAString3Test {

	private final _557_ReverseWordsInAString3 reverseWordsInAString3 = new _557_ReverseWordsInAString3();

	@DisplayName("Кeverse the order of characters in each word")
	@ParameterizedTest(name = "test #{index}: Attendance record {0} -> expected {2}")
	@MethodSource({"useCases"})
	public void reverseWords(String s, String expected) {
		Assertions.assertEquals(expected, reverseWordsInAString3.reverseWords(s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc")
		);
	}

}
