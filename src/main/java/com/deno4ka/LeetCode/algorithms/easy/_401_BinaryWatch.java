package com.deno4ka.LeetCode.algorithms.easy;

/*
A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
Each LED represents a zero or one, with the least significant bit on the right.
For example, the above binary watch reads "3:25".
Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

Example:
Input: n = 1
Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]

Note:
The order of output does not matter.
The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _401_BinaryWatch {

    private HashMap<Integer, ArrayList<String>> hoursMap;
    private HashMap<Integer, ArrayList<String>> minutesMap;

    public _401_BinaryWatch() {
        System.out.println(readBinaryWatch(1)); // ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
    }

    // (2ms/88.14%)
    public List<String> readBinaryWatch(int num) {
        List<String> binaryWatch = new ArrayList<>();
        if (num < 0 || num > 8) {
            return binaryWatch;
        } else {
            hoursMap = generateHoursMap();
            minutesMap = generateMinutesMap();
            int hours = num;
            int minutes = 0;
            while (hours >= 0) {
                if (hours < 4 && minutes < 6) {
                    binaryWatch.addAll(getTime(hours, minutes));
                }
                hours--;
                minutes++;
            }
            return binaryWatch;
        }
    }

    private ArrayList<String> getTime(int hours, int minutes) {
        ArrayList<String> time = new ArrayList<>();
        ArrayList<String> hoursArr = hoursMap.get(hours);
        ArrayList<String> minutesArr = minutesMap.get(minutes);
        for (String hour : hoursArr) {
            for (String minute : minutesArr) {
                time.add(hour + ":" + minute);
            }
        }
        return time;
    }

    private HashMap<Integer, ArrayList<String>> generateHoursMap() {
        HashMap<Integer, ArrayList<String>> hoursMap = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            String binaryString = Integer.toBinaryString(i);
            int bitCounter = 0;
            int bitIndex = binaryString.indexOf('1');
            while (bitIndex >= 0) {
                bitCounter++;
                bitIndex = binaryString.indexOf('1', bitIndex + 1);
            }
            if (!hoursMap.containsKey(bitCounter)) {
                ArrayList<String> numbers = new ArrayList<>();
                numbers.add(String.valueOf(i));
                hoursMap.put(bitCounter, numbers);
            } else {
                ArrayList<String> numbers = hoursMap.get(bitCounter);
                numbers.add(String.valueOf(i));
                hoursMap.put(bitCounter, numbers);
            }
        }
        return hoursMap;
    }

    private HashMap<Integer, ArrayList<String>> generateMinutesMap() {
        HashMap<Integer, ArrayList<String>> minutesMap = new HashMap<>();
        for (int i = 0; i < 60; i++) {
            String binaryString = Integer.toBinaryString(i);
            int bitCounter = 0;
            int bitIndex = binaryString.indexOf('1');
            while (bitIndex >= 0) {
                bitCounter++;
                bitIndex = binaryString.indexOf('1', bitIndex + 1);
            }
            if (!minutesMap.containsKey(bitCounter)) {
                ArrayList<String> numbers = new ArrayList<>();
                if (i < 10) {
                    numbers.add("0" + i);
                } else {
                    numbers.add(String.valueOf(i));
                }
                minutesMap.put(bitCounter, numbers);
            } else {
                ArrayList<String> numbers = minutesMap.get(bitCounter);
                if (i < 10) {
                    numbers.add("0" + i);
                } else {
                    numbers.add(String.valueOf(i));
                }
                minutesMap.put(bitCounter, numbers);
            }
        }
        return minutesMap;
    }

}