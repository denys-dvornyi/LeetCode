package com.deno4ka.LeetCode.algorithms.easy;

/*
There are 1000 buckets, one and only one of them contains poison, the rest are filled with water.
They all look the same. If a pig drinks that poison it will die within 15 minutes.
What is the minimum amount of pigs you need to figure out which bucket contains the poison within one hour.

Answer this question, and write an algorithm for the follow-up general case.
Follow-up:
If there are n buckets and a pig drinking poison will die within m minutes,
how many pigs (x) you need to figure out the "poison" bucket within p minutes?
There is exact one bucket with poison.
*/

public class _458_PoorPigs {

    public _458_PoorPigs() {
        System.out.println(poorPigs(1, 1, 1)); // 0
        System.out.println(poorPigs(1000, 15, 60)); // 5
        System.out.println(poorPigs(1000, 12, 60)); // 4
        System.out.println(poorPigs(4, 1, 2)); // 2
        System.out.println(poorPigs(25, 15, 60)); // 2
    }

    // using logarithm
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int result = 0;
        int tries = minutesToTest / minutesToDie + 1; // find pig's life states (dead or alive)
        // 'tries' logarithm from 'N' must be =< buckets
        while (Math.pow(tries, result) < buckets) {
            result++;
        }
        return result;
    }

}