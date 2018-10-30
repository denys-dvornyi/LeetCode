package com.deno4ka.LeetCode.algorithms.easy;

//The count-and-say sequence is the sequence of integers with the first five terms as following:
//1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.
//Given an integer n, generate the nth term of the count-and-say sequence.
//Note: Each term of the sequence of integers will be represented as a string.
//Example 1:
//Input: 1
//Output: "1"
//Example 2:
//Input: 4
//Output: "1211"
// Input: 5
//Output: "111221"
// Input: 6
//Output: "312211"
// Input: 7
//Output: "13112221"

public class _38_count_and_say {

    public _38_count_and_say() {
//        System.out.println(countAndSay(1)); //"1"
//        System.out.println(countAndSay(2)); //"11"
//        System.out.println(countAndSay(3)); //"21"
//        System.out.println(countAndSay(4)); //"1211"
//        System.out.println(countAndSay(5)); //"111221"
//        System.out.println(countAndSay(6)); //"312211"
//        System.out.println(countAndSay(7)); //"13112221"
        System.out.println(countAndSay(8)); //"1113213211"
    }

    public String countAndSay(int n) {
        if (n == 0) return "";
        if (n == 1) return "1";
        StringBuilder result = new StringBuilder("1");
        int count = 0;
        char last = '0';
        for (int i = 1; i < n; i++) {
            char[] tmpRes = result.toString().toCharArray();
            result = new StringBuilder();
            for (int j = 0; j < tmpRes.length; j++) {
                if (count == 0) {
                    last = tmpRes[j];
                    count++;
                } else if (last == tmpRes[j]) {
                    count++;
                } else if (last != tmpRes[j]) {
                    result.append(String.valueOf(count)).append(last);
                    count = 1;
                    last = tmpRes[j];
                }
            }
            if (count != 0) {
                result.append(String.valueOf(count)).append(last);
                count = 0;
            }
        }
        return result.toString();
    }

}