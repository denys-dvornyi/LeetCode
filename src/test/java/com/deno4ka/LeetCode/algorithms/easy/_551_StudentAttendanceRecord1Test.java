package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _551_StudentAttendanceRecord1Test {

	private final _551_StudentAttendanceRecord1 studentAttendanceRecord1 = new _551_StudentAttendanceRecord1();

	@DisplayName("Return whether the student could be rewarded")
	@ParameterizedTest(name = "test #{index}: Attendance record {0} -> expected {2}")
	@MethodSource({"useCases"})
	public void checkRecord(String s, boolean expected) {
		Assertions.assertEquals(expected, studentAttendanceRecord1.checkRecord(s));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("PPALLP", true),
				Arguments.of("PPALLL", false)
		);
	}

}
