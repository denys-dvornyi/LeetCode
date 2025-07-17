package com.deno4ka.LeetCode.algorithms.easy;

// Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
// Do not allocate extra space for another array, you must do this in place with constant memory.
// For example,
// Given input array nums = [1,1,2],    // [1,2]
// Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

public class _26_RemoveDuplicatesFromSortedArray {

    public _26_RemoveDuplicatesFromSortedArray() {
        System.out.println("new size = " + removeDuplicates(new int[]{1, 1, 1, 2, 3, 3, 4, 5, 6, 6}));
    }

    private int removeDuplicates(int[] nums) {
        int uniqueNumber = -1, counter = 0;
        for (int num : nums) {
            if (counter == 0) {
                uniqueNumber = num;
                counter++;
            } else if (uniqueNumber != num) {
                uniqueNumber = num;
                nums[counter] = num;
                counter++;
            }
        }
//        for (int n : nums) {
//            System.out.print(n);
//        }
//        System.out.println();
        return counter;
    }

}