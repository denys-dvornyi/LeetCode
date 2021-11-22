package com.deno4ka.LeetCode.algorithms.easy;

/*
You have a RecentCounter class which counts the number of recent requests within a certain time frame.
Implement the RecentCounter class:
RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds,
and returns the number of requests that has happened in the past 3000 milliseconds (including the new request).
Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.

Example 1:
Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

Explanation
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3

Constraints:
1 <= t <= 109
Each test case will call ping with strictly increasing values of t.
At most 104 calls will be made to ping.
*/

import java.util.LinkedList;
import java.util.Queue;

public class _933_NumberOfRecentCalls {

	public Integer[] getNumberOfRecentCalls(String[] commands, Integer[] pings) {
		RecentCounter recentCounter = null;
		Integer[] result = new Integer[pings.length];
		for (int i = 0; i < commands.length; i++) {
			switch(commands[i]) {
				case "RecentCounter": recentCounter = new RecentCounter(); result[i] = null; break;
				case "ping": if (recentCounter != null) result[i] = recentCounter.ping(pings[i]); break;
			}
		}
		return result;
	}

	class RecentCounter {

		private static final int PAST_MILLIS = 3_000;
		private final int[] calls = new int[10_000];
		private int callCursor = 0;
		private int startRange = 0;

//		Queue<Integer> queue = new LinkedList<>();

		public RecentCounter() {}

//		Runtime: 51 ms, faster than 21.75% & Memory Usage: 48 MB, less than 38.03%
		public int ping(int t) {
			int result = 0;
			calls[callCursor++] = t;
			int range = t - PAST_MILLIS;
			for (int i = startRange; i < callCursor; i++) {
				if (calls[i] < range) {
					startRange++;
				} else {
					result++;
				}
			}
			return result;
		}

//		best from leet.code -> Runtime: 43 ms, faster than 25.03% & Memory Usage: 71.8 MB, less than 5.20%
//		public int ping(int t) {
//			queue.add(t);
//			while (queue.peek() < t - 3000){
//				queue.poll();
//			}
//			return queue.size();
//		}

	}

}
