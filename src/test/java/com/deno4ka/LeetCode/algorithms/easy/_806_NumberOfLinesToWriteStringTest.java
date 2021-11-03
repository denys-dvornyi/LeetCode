package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _806_NumberOfLinesToWriteStringTest {

	private final _806_NumberOfLinesToWriteString numberOfLinesToWriteString = new _806_NumberOfLinesToWriteString();

	@DisplayName("Return an array result of length 2 where: result[0] is the total number of lines, result[1] is the width of the last line in pixels")
	@ParameterizedTest(name = "test #{index}: widths \"{0}\", string \"{1}\", expected \"{2}\"")
	@MethodSource({"useCases"})
	public void numberOfLines(int[] widths, String s, int[] expected) {
		Assertions.assertArrayEquals(expected, numberOfLinesToWriteString.numberOfLines(widths, s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz", new int[]{3,60}),
				Arguments.of(new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa", new int[]{2,4}),
				Arguments.of(new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, "a", new int[]{1,1}),
				Arguments.of(new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, "abc", new int[]{1,3}),
				Arguments.of(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26}, "abc", new int[]{1,6})
		);
	}

}
