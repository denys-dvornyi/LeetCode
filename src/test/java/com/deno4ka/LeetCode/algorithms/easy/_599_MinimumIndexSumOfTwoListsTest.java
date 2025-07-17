package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class _599_MinimumIndexSumOfTwoListsTest {

    private final _599_MinimumIndexSumOfTwoLists minimumIndexSumOfTwoLists = new _599_MinimumIndexSumOfTwoLists();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                        new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}, new String[]{"Shogun"}),
                Arguments.of(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                        new String[]{"KFC", "Shogun", "Burger King"}, new String[]{"Shogun"}),
                Arguments.of(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                        new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"}, new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"}),
                Arguments.of(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                        new String[]{"KNN", "KFC", "Burger King", "Tapioca Express", "Shogun"}, new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"}),
                Arguments.of(new String[]{"KFC"}, new String[]{"KFC"}, new String[]{"KFC"}),
                Arguments.of(new String[]{"S", "TEXP", "BK", "KFC"}, new String[]{"KFC", "BK", "S"}, new String[]{"S"})
        );
    }

    @DisplayName("Find out common interest with the least list index sum")
    @ParameterizedTest(name = "test #{index}: \"{0}\", \"{1}\" expected array \"{2}\"")
    @MethodSource({"useCases"})
    public void findRestaurant(String[] list1, String[] list2, String[] expected) {
        Arrays.sort(expected);
        String[] restaurants = minimumIndexSumOfTwoLists.findRestaurant(list1, list2);
        Arrays.sort(restaurants);
        Assertions.assertArrayEquals(expected, restaurants);
    }

}
