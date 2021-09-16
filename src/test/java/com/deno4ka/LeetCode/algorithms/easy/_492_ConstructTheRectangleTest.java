package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _492_ConstructTheRectangleTest {

	private final _492_ConstructTheRectangle constructTheRectangle = new _492_ConstructTheRectangle();

	@DisplayName("Construct the Rectangle")
	@ParameterizedTest(name = "test #{index}: area {0} -> expected {1}")
	@MethodSource({"useCases"})
	public void constructRectangle(int area, int[] expected) {
		assertArrayEquals(expected, constructTheRectangle.constructRectangle(area));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(1, new int[] {1,1}),
				Arguments.of(2, new int[] {2,1}),
				Arguments.of(3, new int[] {3,1}),
				Arguments.of(4, new int[] {2,2}),
				Arguments.of(5, new int[] {5,1}),
				Arguments.of(6, new int[] {3,2}),
				Arguments.of(7, new int[] {7,1}),
				Arguments.of(8, new int[] {4,2}),
				Arguments.of(9, new int[] {3,3})
		);
	}

}
