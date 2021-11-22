package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _933_NumberOfRecentCallsTest {

	private final _933_NumberOfRecentCalls numberOfRecentCalls = new _933_NumberOfRecentCalls();

	@DisplayName("Return the number of requests that have happened in the inclusive range [t - 3000, t]")
	@ParameterizedTest(name = "test #{index}: commands \"{0}\", pings \"{1}\", number of recent calls \"{2}\"")
	@MethodSource({"useCases"})
	public void getNumberOfRecentCalls(String[] commands, Integer[] pings, Integer[] expected) {
		Assertions.assertArrayEquals(expected, numberOfRecentCalls.getNumberOfRecentCalls(commands, pings));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new String[]{"RecentCounter", "ping", "ping", "ping", "ping"}, new Integer[]{null, 1, 100, 3001, 3002}, 3)
		);
	}

}
