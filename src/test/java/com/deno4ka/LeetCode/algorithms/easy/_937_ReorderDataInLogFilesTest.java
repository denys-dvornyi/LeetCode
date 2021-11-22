package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _937_ReorderDataInLogFilesTest {

	private final _937_ReorderDataInLogFiles reorderDataInLogFiles = new _937_ReorderDataInLogFiles();

	@DisplayName("Return the final order of the logs")
	@ParameterizedTest(name = "test #{index}: logs \"{0}\", ordered logs \"{1}\"")
	@MethodSource({"useCases"})
	public void reorderLogFiles(String[] logs, String[] expected) {
		Assertions.assertArrayEquals(expected, reorderDataInLogFiles.reorderLogFiles(logs));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"}, new String[]{"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"}),
				Arguments.of(new String[]{"dig1 8 1 5 1","let4 art can","dig2 3 6","let2 own kit dig","let3 art zero","let1 art can","let5 art can","dig3 1 2 3"},
							 new String[]{"let1 art can","let4 art can","let5 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6","dig3 1 2 3"}),
				Arguments.of(new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"}, new String[]{"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"})
		);
	}

}
