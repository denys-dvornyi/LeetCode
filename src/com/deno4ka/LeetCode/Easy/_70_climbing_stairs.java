package com.deno4ka.LeetCode.Easy;

//You are climbing a stair case. It takes n steps to reach to the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Note: Given n will be a positive integer.

public class _70_climbing_stairs {

    public _70_climbing_stairs() {
        System.out.println(climbStairs(0));
    }

    private int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        else {
            int result = 0;

            return result;
        }
    }

}