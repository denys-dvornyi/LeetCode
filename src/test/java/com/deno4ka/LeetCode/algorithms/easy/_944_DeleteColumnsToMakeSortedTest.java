package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _944_DeleteColumnsToMakeSortedTest {

	private final _944_DeleteColumnsToMakeSorted deleteColumnsToMakeSorted = new _944_DeleteColumnsToMakeSorted();

	@DisplayName("Return the number of columns that you will delete")
	@ParameterizedTest(name = "test #{index}: strings \"{0}\", number of columns to delete \"{1}\"")
	@MethodSource({"useCases"})
	public void minDeletionSize(String[] strs, int expected) {
		Assertions.assertEquals(expected, deleteColumnsToMakeSorted.minDeletionSize(strs));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new String[]{"cba","daf","ghi"}, 1),
				Arguments.of(new String[]{"a","b"}, 0),
				Arguments.of(new String[]{"zyx","wvu","tsr"}, 3),
				Arguments.of(new String[]{"zyx"}, 0)
		);
	}

}
