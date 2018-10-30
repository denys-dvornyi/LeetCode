package com.deno4ka.LeetCode.algorithms.easy;

//Given an array and a value, remove all instances of that value in place and return the new length.
//Do not allocate extra space for another array, you must do this in place with constant memory.
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//Example:
//Given input array nums = [3,2,2,3], val = 3
//Your function should return length = 2, with the first two elements of nums being 2.

public class _27_remove_element {

    public _27_remove_element() {
        removeElement(new int[] {3,2,2,3,3,3,4,5,3}, 2);
    }

    private int removeElement(int[] nums, int val) {
        int newLength = nums.length;
        for (int i = 0; i < newLength;) {
            if (nums[i] == val) {
                for (int j = i; j < newLength - 1; j++) {
                    nums[j] = nums[j+1];
                }
                newLength--;
            }
            if (nums[i] != val) {
                i++;
            }
        }
//        for testing:
//        for (int num : nums) {
//            System.out.print(num + ",");
//        }
//        System.out.println("new length = " + newLength);
        return newLength;
    }

}