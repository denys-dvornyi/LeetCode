package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _492_ConstructTheRectangleTest {

	private _492_ConstructTheRectangle constructTheRectangle = new _492_ConstructTheRectangle();

	@DisplayName("Construct the Rectangle")
	@ParameterizedTest(name = "test #{index}: area {0} -> expected {1}")
	@MethodSource({"useCases"})
	public void findMaxConsecutiveOnes(int area, int[] expected) {
		assertArrayEquals(expected, constructTheRectangle.constructRectangle(area));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(4, new int[] {2,2})
		);
	}

}
