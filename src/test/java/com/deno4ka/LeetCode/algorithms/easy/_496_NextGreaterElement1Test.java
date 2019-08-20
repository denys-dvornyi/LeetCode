package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _496_NextGreaterElement1Test {

	private _496_NextGreaterElement1 nextGreaterElement1 = new _496_NextGreaterElement1();

	@DisplayName("Find all the next greater numbers for nums1's elements in the corresponding places of nums2")
	@ParameterizedTest(name = "test #{index}: nums1 {0}, nums2 {1}, -> expected {2}")
	@MethodSource({"useCases"})
	public void findMaxConsecutiveOnes(int[] nums1, int[] nums2, int[] expected) {
		assertArrayEquals(expected, nextGreaterElement1.nextGreaterElement(nums1, nums2));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[] {4,1,2}, new int[] {1,3,4,2}, new int[] {-1,3,-1}),
				Arguments.of(new int[] {2,4}, new int[] {1,2,3,4}, new int[] {3,-1})
		);
	}

}
