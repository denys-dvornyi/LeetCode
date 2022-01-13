package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _1018_BinaryPrefixDivisibleBy5Test {

	private final _1018_BinaryPrefixDivisibleBy5 binaryPrefixDivisibleBy5 = new _1018_BinaryPrefixDivisibleBy5();

	@DisplayName("Return an array of booleans answer where answer[i] is true if xi is divisible by 5")
	@ParameterizedTest(name = "test #{index}: nums \"{0}\", expected \"{1}\"")
	@MethodSource({"useCases"})
	public void prefixesDivBy5(int[] nums, List<Boolean> expected) {
		Assertions.assertEquals(expected, binaryPrefixDivisibleBy5.prefixesDivBy5(nums));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
//				Arguments.of(new int[]{0,1,1}, Arrays.asList(true,false,false)),
//				Arguments.of(new int[]{1,1,1}, Arrays.asList(false,false,false)),
//				Arguments.of(new int[]{1,0,1}, Arrays.asList(false,false,true)),
//				Arguments.of(new int[]{0,1,1,1,1,1}, Arrays.asList(true,false,false,false,true,false)),
//				Arguments.of(new int[]{1,1,1,0,1}, Arrays.asList(false,false,false,false,false)),
//				Arguments.of(new int[]{1,1,0,0,0,1,0,0,1}, Arrays.asList(false,false,false,false,false,false,false,false,false)),
				Arguments.of(new int[]{1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0},
						Arrays.asList(false,false,true,false,false,false,false,false,false,false,true,true,true,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,false,true,false,false,true,true,true,true,true,true,true,false,false,true,false,false,false,false,true,true))
		);
	}

}
