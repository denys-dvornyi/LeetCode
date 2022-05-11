package com.deno4ka;

import static java.util.Comparator.comparing;
import static org.testng.Assert.assertEquals;

public class Main {

    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, CloneNotSupportedException {

    }

    private static void epamTask() {
        String number = "123456";
        long sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.valueOf(String.valueOf(number.charAt(i)));
        }
        long result = sum * Integer.valueOf(String.valueOf(number.charAt(number.length() - 1)));
        System.out.println(result);
    }

}
