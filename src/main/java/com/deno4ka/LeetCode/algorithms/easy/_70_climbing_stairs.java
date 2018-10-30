package com.deno4ka.LeetCode.algorithms.easy;

//You are climbing a stair case. It takes n steps to reach to the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Note: Given n will be a positive integer.

public class _70_climbing_stairs {

    public _70_climbing_stairs() {
//        System.out.println(climbStairs(0));
//        System.out.println(climbStairs(1));
//        System.out.println(climbStairs(2));
//        System.out.println(climbStairs(3));
//        System.out.println(climbStairs(4));
//        System.out.println(climbStairs(5));
//        System.out.println(climbStairs(6));
//        System.out.println(climbStairs(7));
//        System.out.println(climbStairs(8));
        System.out.println(climbStairs(44));
        System.out.println(climbStairs(45));
        System.out.println(climbStairs(46));
    }

    private int climbStairs(int n) {
        // recursion is too long!!!
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//        if (n == 2) return 2;
//        else {
//            return climbStairs(n-1) + climbStairs(n-2);
//        }
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 2;
        else {
            int count = 3;
            int last = 2, beforelast = 1;
            int result = 0;
            while (count <= n) {
                result = last + beforelast;
                beforelast = last;
                last = result;
                count++;
            }
            return result;
        }
    }

}