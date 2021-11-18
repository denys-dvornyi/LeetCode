package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _917_ReverseOnlyLettersTest {

	private final _917_ReverseOnlyLetters reverseOnlyLetters = new _917_ReverseOnlyLetters();

	@DisplayName("Return s after reversing it")
	@ParameterizedTest(name = "test #{index}: string \"{0}\", reversed string \"{1}\"")
	@MethodSource({"useCases"})
	public void reverseOnlyLetters(String s, String expected) {
		Assertions.assertEquals(expected, reverseOnlyLetters.reverseOnlyLetters(s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("Z", "Z"),
				Arguments.of("!", "!"),
				Arguments.of("-a-", "-a-"),
				Arguments.of("a---", "a---"),
				Arguments.of("---b", "---b"),
				Arguments.of("-aa-", "-aa-"),
				Arguments.of("-ab-", "-ba-"),
				Arguments.of("ab--", "ba--"),
				Arguments.of("--ab", "--ba"),
				Arguments.of("--ab--", "--ba--"),
				Arguments.of("-a-b-", "-b-a-"),
				Arguments.of("-acb-", "-bca-"),
				Arguments.of("ab-cd", "dc-ba"),
				Arguments.of("aA-zZ", "Zz-Aa"),
				Arguments.of("a-bC-dEf-ghIj", "j-Ih-gfE-dCba"),
				Arguments.of("Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!")
		);
	}

}
