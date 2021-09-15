package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _657_RobotReturnToOriginTest {

	private _657_RobotReturnToOrigin robotReturnToOrigin = new _657_RobotReturnToOrigin();

	@DisplayName("Return `true` if the robot returns to the origin after it finishes all of its moves, or `false` otherwise.")
	@ParameterizedTest(name = "test #{index}: moves \"{0}\", expected result \"{1}\"")
	@MethodSource({"useCases"})
	public void judgeCircle(String moves, boolean expected) {
		Assertions.assertEquals(expected, robotReturnToOrigin.judgeCircle(moves));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("UD", true),
				Arguments.of("LL", false),
				Arguments.of("RRDD", false),
				Arguments.of("LDRRLRUULR", false)
		);
	}

}
