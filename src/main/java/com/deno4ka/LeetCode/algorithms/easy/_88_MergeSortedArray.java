package com.deno4ka.LeetCode.algorithms.easy;

/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 Note:
    You may assume that nums1 has enough space (size that is greater or equal to m + n)
    to hold additional elements from nums2.
 The number of elements initialized in nums1 and nums2 are m and n respectively.
*/

public class _88_MergeSortedArray {

    public _88_MergeSortedArray() {
        int[] nums1 = new int[] {2,4,6,8,10,0,0,0,0,0};
        int[] nums2 = new int[] {1,3,5,7,9};
        printArray(nums1);
        printArray(nums2);
        merge(nums1, 5, nums2, nums2.length);
        printArray(nums1);
    }

    private void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 != null && n != 0) {
            int[] tmp = new int[m + n];
            int pos1 = 0, pos2 = 0;
            boolean secondEnd = false, firstEnd = false;
            for (int i = 0; i < tmp.length; i ++) {
                if (nums1[pos1] <= nums2[pos2]) {
                    if (pos1 == m - 1) {
                        if (firstEnd) {
                            tmp[i] = nums2[pos2];
                            pos2++;
                        } else {
                            tmp[i] = nums1[pos1];
                            firstEnd = true;
                        }
                    } else if (pos1 < m - 1) {
                        tmp[i] = nums1[pos1];
                        pos1++;
                    } else {
                        tmp[i] = nums2[pos2];
                        pos2++;
                    }
                } else {
                    if (pos2 == n - 1) {
                        if (secondEnd) {
                            tmp[i] = nums1[pos1];
                            pos1++;
                        } else {
                            tmp[i] = nums2[pos2];
                            secondEnd = true;
                        }
                    } else if (pos2 < n -1) {
                        tmp[i] = nums2[pos2];
                        pos2++;
                    } else {
                        tmp[i] = nums1[pos1];
                        pos1++;
                    }
                }
            }
            for (int j = 0; j < tmp.length; j++) {
                nums1[j] = tmp[j];
            }
        }
    }

    private void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.println();
    }

}