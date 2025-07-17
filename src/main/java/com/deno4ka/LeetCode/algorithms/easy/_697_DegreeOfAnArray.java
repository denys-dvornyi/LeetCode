package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Example 1:
Input: nums = [1,2,2,3,1]
Output: 2
Explanation:
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.

Example 2:
Input: nums = [1,2,2,3,1,4,2]
Output: 6
Explanation:
The degree is 3 because the element 2 is repeated 3 times.
So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.

Constraints:
nums.length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.
*/

public class _697_DegreeOfAnArray {

    //	Runtime: 45 ms, faster than 14.21% & Memory Usage: 40.8 MB, less than 99.86%
    public int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        final int MAX_ELEMENTS = 50_000;
        int degree = 0;
        int[] numFrequency = new int[MAX_ELEMENTS];
        for (int num : nums) {
            numFrequency[num]++;
            degree = Math.max(degree, numFrequency[num]);
        }
        int[] mostFrequentNums = new int[MAX_ELEMENTS / degree];
        int mostFrequentNumsCursor = 0;
        for (int j = 0; j < numFrequency.length; j++) {
            if (degree == numFrequency[j]) {
                mostFrequentNums[mostFrequentNumsCursor] = j;
                mostFrequentNumsCursor++;
            }
        }
        int minSubarrayLength = nums.length;
        for (int k = 0; k < mostFrequentNumsCursor; k++) {
            int freqNum = mostFrequentNums[k];
            int first = -1;
            int last = -1;
            for (int m = 0; m < nums.length; m++) {
                if (freqNum == nums[m]) {
                    if (first == -1) {
                        first = m;
                        last = m;
                    } else {
                        last = m;
                    }
                }
            }
            minSubarrayLength = Math.min(minSubarrayLength, last - first + 1);
        }
        return minSubarrayLength;
    }

//	fastest from leet.code (2ms)
//	public int findShortestSubArray(int[] nums) {
//
//		int maxVal = 0;
//		for (int num : nums) {
//			maxVal = Math.max(num, maxVal);
//		}
//		maxVal++;
//		int[] freq = new int[maxVal];
//		Integer[] firstNumsIndex = new Integer[maxVal];
//		int[] lastNumsIndex = new int[maxVal];
//		int maxFreq = 0;
//
//		for(int i=0;i<nums.length;i++)
//		{
//			int x=nums[i];
//			if(firstNumsIndex[x]==null)
//				firstNumsIndex[x]=i;
//			maxFreq=Math.max(maxFreq,++freq[x]);
//			lastNumsIndex[x]=i;
//		}
//		int ans=nums.length;
//		for(int x=0;x<maxVal;x++)
//		{
//			if(freq[x]==maxFreq)
//				ans=Math.min(ans,lastNumsIndex[x]-firstNumsIndex[x]+1);
//
//		}
//		return ans;
//	}

//  map version from leet.code (17ms)
//	public int findShortestSubArray(int[] nums) {
//		Map<Integer, Integer> freq = new HashMap<>();
//		Map<Integer, Integer> first = new HashMap<>();
//		Map<Integer, Integer> last = new HashMap<>();
//
//		for (int i = 0; i < nums.length; i++) {
//			int x = nums[i];
//			if (!first.containsKey(x)) {
//				first.put(x, i);
//			}
//			last.put(x, i);
//			freq.put(x, freq.getOrDefault(x, 0) + 1);
//		}
//		int ans = Integer.MAX_VALUE;
//		int max = Collections.max(freq.values());
//
//		for (int i = 0; i < nums.length; i++) {
//			int x = nums[i];
//			int f = freq.get(x);
//			if (f == max && first.get(x) == i) {
//				int dif = last.get(x) - first.get(x) + 1;
//				if (ans > dif) {
//					ans = dif;
//				}
//			}
//		}
//		return ans;
//	}

}
