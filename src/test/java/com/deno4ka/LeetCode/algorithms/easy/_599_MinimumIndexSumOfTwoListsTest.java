package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _599_MinimumIndexSumOfTwoListsTest {

	private _599_MinimumIndexSumOfTwoLists minimumIndexSumOfTwoLists = new _599_MinimumIndexSumOfTwoLists();

	@DisplayName("Range Addition II")
	@ParameterizedTest(name = "test #{index}: matrix to reshape \"{0}\", rows {1}, columns {2} -> expected matrix \"{3}\"")
	@MethodSource({"useCases"})
	public void arrayPairSum(String[] list1, String[] list2, String[] expected) {
		Assertions.assertArrayEquals(expected, minimumIndexSumOfTwoLists.findRestaurant(list1, list2));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
						new String[] {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}, new String[] {"Shogun"}),
				Arguments.of(new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
						new String[] {"KFC","Shogun","Burger King"}, new String[] {"Shogun"}),
				Arguments.of(new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
						new String[] {"KFC","Burger King","Tapioca Express","Shogun"}, new String[] {"KFC","Burger King","Tapioca Express","Shogun"}),
				Arguments.of(new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
						new String[] {"KNN","KFC","Burger King","Tapioca Express","Shogun"}, new String[] {"KFC","Burger King","Tapioca Express","Shogun"}),
				Arguments.of(new String[] {"KFC"}, new String[] {"KFC"}, new String[] {"KFC"})
		);
	}

}
