package com.deno4ka;

import com.deno4ka.LeetCode.algorithms.easy.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        First_non_repeated_character_in_the_string firstNonRepeatedCharacterInTheString = new First_non_repeated_character_in_the_string();
//        TACAssetExport tacAssetExport = new TACAssetExport();

//        _14_Longest_Common_Prefix longestCommonPrefix = new _14_Longest_Common_Prefix();
//        _21_Merge_Two_Sorted_Lists mergeTwoSortedLists = new _21_Merge_Two_Sorted_Lists();
//        _26_remove_duplicates_from_sorted_array removeDuplicatesFromSortedArray = new _26_remove_duplicates_from_sorted_array();
//        _27_remove_element removeElement = new _27_remove_element();
//        _28_implement_str_str implementStrStr = new _28_implement_str_str();
//        _35_search_insert_position searchInsertPosition = new _35_search_insert_position();
//        _38_count_and_say countAndSay = new _38_count_and_say();
//        _53_maximum_subarray maximumSubarray = new _53_maximum_subarray();
//        _58_length_of_last_word lengthOfLastWord = new _58_length_of_last_word();
//        _66_plus_one plusOne = new _66_plus_one();
//        _67_add_binary addBinary = new _67_add_binary();
//        _69_sqrt_x sqrtX = new _69_sqrt_x();
//        _70_climbing_stairs climbingStairs = new _70_climbing_stairs();
//        _83_remove_duplicates_from_sorted_list removeDuplicatesFromSortedList = new _83_remove_duplicates_from_sorted_list();
//        _88_merge_sorted_array mergeSortedArray = new _88_merge_sorted_array();
//        _100_same_tree sameTree = new _100_same_tree();
//        _101_symmetric_tree symmetricTree = new _101_symmetric_tree();
//        _104_maximum_depth_of_binary_tree maximumDepthOfBinaryTree = new _104_maximum_depth_of_binary_tree();
//        _107_binary_tree_level_order_traversal_II binaryTreeLevelOrderTraversalIi = new _107_binary_tree_level_order_traversal_II();
//        _108_convert_sorted_array_to_binary_search_tree convertSortedArrayToBinarySearchTree = new _108_convert_sorted_array_to_binary_search_tree();
//        _110_balanced_binary_tree balancedBinaryTree = new _110_balanced_binary_tree();
//        _111_minimum_depth_of_binary_tree minimumDepthOfBinaryTree = new _111_minimum_depth_of_binary_tree();
//        _112_path_sum pathSum = new _112_path_sum();
//        _118_pascals_triangle pascalsTriangle = new _118_pascals_triangle();
//        _119_pascals_triangle_2 pascalsTriangle2 = new _119_pascals_triangle_2();
//        _121_best_time_to_buy_and_sell_stock bestTimeToBuyAndSellStock = new _121_best_time_to_buy_and_sell_stock();
//        _122_best_time_to_buy_and_sell_stock_2 bestTimeToBuyAndSellStock2 = new _122_best_time_to_buy_and_sell_stock_2();
//        _125_valid_palindrome validPalindrome = new _125_valid_palindrome();
//        _136_single_number singleNumber = new _136_single_number();
//        _141_linked_list_cycle linkedListCycle = new _141_linked_list_cycle();
//        _155_min_stack minStack = new _155_min_stack();
//        _160_intersection_of_two_linked_lists intersectionOfTwoLinkedLists = new _160_intersection_of_two_linked_lists();
//        _167_two_sum_2_input_array_is_sorted twoSum2InputArrayIsSorted = new _167_two_sum_2_input_array_is_sorted();
//        _168_excel_sheet_column_title excelSheetColumnTitle = new _168_excel_sheet_column_title();
//        _169_majority_element majorityElement = new _169_majority_element();
//        _171_excel_sheet_column_number excelSheetColumnNumber = new _171_excel_sheet_column_number();
//        _172_factorial_trailing_zeroes factorialTrailingZeroes = new _172_factorial_trailing_zeroes();
//        _189_rotate_array combineTwoTables = new _189_rotate_array();
//        _190_reverse_bits reverseBits = new _190_reverse_bits();
//        _191_number_of_1_bits numberOf1Bits = new _191_number_of_1_bits();
//        _198_house_robber houseRobber = new _198_house_robber();
//        _202_happy_number happyNumber = new _202_happy_number();
//        _203_remove_linked_list_elements removeLinkedListElements = new _203_remove_linked_list_elements();
//        _204_count_primes countPrimes = new _204_count_primes();
//        _205_isomorphic_strings isomorphicStrings = new _205_isomorphic_strings();
//        _206_reverse_linked_list reverseLinkedList = new _206_reverse_linked_list();
//        _217_contains_duplicate containsDuplicate = new _217_contains_duplicate();
//        _219_contains_duplicate_2 containsDuplicate2 = new _219_contains_duplicate_2();
//        _225_implement_stack_using_queues implementStackUsingQueues = new _225_implement_stack_using_queues();
//        _226_invert_binary_tree invertBinaryTree = new _226_invert_binary_tree();
//        _231_power_of_two powerOfTwo = new _231_power_of_two();
//        _232_implement_queue_using_stacks implementQueueUsingStacks = new _232_implement_queue_using_stacks();
//        _234_palindrome_linked_list palindromeLinkedList = new _234_palindrome_linked_list();
//        _235_lowest_common_ancestor_of_a_binary_search_tree lowestCommonAncestorOfABinarySearchTree = new _235_lowest_common_ancestor_of_a_binary_search_tree();
//        _237_delete_node_in_a_linked_list deleteNodeInALinkedList = new _237_delete_node_in_a_linked_list();
//        _242_valid_anagram validAnagram = new _242_valid_anagram();
//        _257_binary_tree_paths binaryTreePaths = new _257_binary_tree_paths();
//        _258_add_digits addDigits = new _258_add_digits();
//        _263_ugly_number uglyNumber = new _263_ugly_number();
//        _268_missing_number missingNumber = new _268_missing_number();
//        _278_first_bad_version firstBadVersion = new _278_first_bad_version();
//        _283_move_zeroes moveZeroes = new _283_move_zeroes();
//        _290_word_pattern wordPattern = new _290_word_pattern();
//        _292_nim_game nimGame = new _292_nim_game();
//        _303_range_sum_query_immutable rangeSumQueryImmutable = new _303_range_sum_query_immutable();
//        _326_power_of_three powerOfThree = new _326_power_of_three();
//        _342_power_of_four powerOfFour = new _342_power_of_four();
//        _344_reverse_string reverseString = new _344_reverse_string();
//        _345_reverse_vowels_of_a_string reverseVowelsOfAString = new _345_reverse_vowels_of_a_string();
//        _349_intersection_of_two_arrays intersectionOfTwoArrays = new _349_intersection_of_two_arrays();
//        _350_intersection_of_two_arrays_2 intersectionOfTwoArrays2 = new _350_intersection_of_two_arrays_2();
//        _367_valid_perfect_square validPerfectSquare = new _367_valid_perfect_square();
//        _371_sum_of_two_integers sumOfTwoIntegers = new _371_sum_of_two_integers();
//        _374_guess_number_higher_or_lower guessNumberHigherOrLower = new _374_guess_number_higher_or_lower();
//        _383_ransom_note ransomNote = new _383_ransom_note();
//        _387_first_unique_character_in_a_string firstUniqueCharacterInAString = new _387_first_unique_character_in_a_string();
//        _389_find_the_difference findTheDifference = new _389_find_the_difference();
//        _400_nth_digit nthDigit = new _400_nth_digit();
//        _401_binary_watch binaryWatch = new _401_binary_watch();
//        _404_sum_of_left_leaves sumOfLeftLeaves = new _404_sum_of_left_leaves();
//        _405_convert_a_number_to_hexadecimal convertANumberToHexadecimal = new _405_convert_a_number_to_hexadecimal();
//        _409_longest_palindrome longestPalindrome = new _409_longest_palindrome();
//        _412_fizz_buzz fizzBuzz = new _412_fizz_buzz();
//        _414_third_maximum_number thirdMaximumNumber = new _414_third_maximum_number();
        _415_add_strings addStrings = new _415_add_strings();

    }

}