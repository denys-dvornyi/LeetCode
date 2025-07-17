package com.deno4ka.LeetCode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 * <p>
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */

public class _169_MajorityElement {

    public _169_MajorityElement() {
        System.out.println(majorityElement(new int[]{3, 2, 3}) + " - 3");
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}) + " - 2");
    }

    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else {
            Map<Integer, Integer> elements = new HashMap<>();
            for (int num : nums) {
                if (elements.containsKey(num)) {
                    elements.put(num, elements.get(num) + 1);
                } else {
                    elements.put(num, 1);
                }
            }
//			Map.Entry<Integer, Integer> maxElement = null;
//			for (Map.Entry<Integer, Integer> el : elements.entrySet()) {
//				if (maxElement == null) {
//					maxElement = el;
//				} else {
//					if (maxElement.getValue().intValue() < el.getValue().intValue()) {
//						maxElement = el;
//					}
//				}
//			}
//			return maxElement.getKey().intValue();
            return elements.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        }
    }

}

// best from leet.code
//public int majorityElement(int[] nums) {
//	if(nums.length == 1) {
//		return nums[0];
//	}
//	Arrays.sort(nums);
//	return nums[nums.length / 2];
//}