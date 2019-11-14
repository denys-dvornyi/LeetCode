package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _500_KeyboardRowTest {

	private _500_KeyboardRow keyboardRow = new _500_KeyboardRow();

	@DisplayName("Words of only one row's of American keyboard")
	@ParameterizedTest(name = "test #{index}: words {0} -> expected {1}")
	@MethodSource({"useCases"})
	public void findWords(String[] words, String[] expected) {
		assertArrayEquals(expected, keyboardRow.findWords(words));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new String[]{"Hello", "Alaska", "Dad", "Peace"}, new String[]{"Alaska", "Dad"}),
				Arguments.of(new String[]{"abdfs", "cccd", "a", "qwwewm"}, new String[]{"a"})
		);
	}

}
