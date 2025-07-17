package com.deno4ka.LeetCode.algorithms.easy;

/*
Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum.
If there is a choice tie between answers, output all of them with no order requirement.
You could assume there always exists an answer.

Example 1:
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".

Example 2:
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).

Example 3:
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Burger King","Tapioca Express","Shogun"]
Output: ["KFC","Burger King","Tapioca Express","Shogun"]

Example 4:
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KNN","KFC","Burger King","Tapioca Express","Shogun"]
Output: ["KFC","Burger King","Tapioca Express","Shogun"]

Example 5:
Input: list1 = ["KFC"], list2 = ["KFC"]
Output: ["KFC"]

Constraints:
1 <= list1.length, list2.length <= 1000
1 <= list1[i].length, list2[i].length <= 30
list1[i] and list2[i] consist of spaces ' ' and English letters.
All the stings of list1 are unique.
All the stings of list2 are unique.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _599_MinimumIndexSumOfTwoLists {

    // Runtime: 86 ms, faster than 14.08% & Memory Usage: 39.9 MB, less than 5.26%
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer, List<String>> result = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    result.computeIfAbsent(i + j, _k -> new ArrayList<>());
                    result.get(i + j).add(list1[i]);
                }
            }
        }
        int minSum = Integer.MAX_VALUE;
        for (Integer key : result.keySet()) {
            if (minSum > key) {
                minSum = key;
            }
        }
        return result.get(minSum).toArray(new String[]{});
    }

    // 7 ms
//	public String[] findRestaurant(String[] list1, String[] list2) {
//		List<String> res = new ArrayList<>();
//		int minSum = Integer.MAX_VALUE;
//		Map<String, Integer> map = new HashMap<>();
//		for(int i = 0; i < list1.length; i++){
//			map.put(list1[i], i);
//		}
//
//		for(int i = 0; i < list2.length; i++){
//			if(map.containsKey(list2[i])){
//				int sum = map.get(list2[i]) + i;
//				if(minSum > sum){
//					minSum = sum;
//					res.clear();
//					res.add(list2[i]);
//				}else if(minSum == sum){
//					res.add(list2[i]);
//				}
//			}
//		}
//		return res.toArray(new String[res.size()]);
//	}

}
