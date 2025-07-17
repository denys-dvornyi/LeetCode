package com.deno4ka.LeetCode.algorithms.easy;

/*
Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
Note: n is positive and will fit within the range of a 32-bit signed integer (n < 231).

Example 1:
Input: 3
Output: 3

Example 2:
Input: 11
Output: 0

Explanation:
The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
*/

public class _400_NthDigit {

    public _400_NthDigit() {
        long start = System.nanoTime();
        System.out.println(findNthDigit(3)); //3
        System.out.println(findNthDigit(11)); //0
        System.out.println(findNthDigit(100_000_000)); //8
        System.out.println(findNthDigit(1000_000_000)); //1
        System.out.println(findNthDigit(2_147_483_647)); //2
        long end = System.nanoTime();
        System.out.println(String.format("duration: %.2f", (float) (end - start) / 1000_000_000));
    }

    // my best result (0.38s local) (70 test / 716ms on leetcode)
    public int findNthDigit(int n) {
        long counter = 0;
        int number = 1;
        int addDigit = 9;
        int digitsInNumber = 1;
        while (counter <= n) {
            if (number > addDigit) {
                addDigit = addDigit * 10 + 9;
                digitsInNumber++;
            }
            if (counter + digitsInNumber < n) {
                counter += digitsInNumber;
                number++;
            } else {
                StringBuilder numberAsString = new StringBuilder();
                numberAsString.append(number);
                for (int i = 0; i < numberAsString.length(); i++) {
                    counter++;
                    if (counter == n) {
                        return Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
                    }
                }
            }
        }
        return -1;
    }

    // best from leetcode (3ms) -> BLACK MAGIC :)
//	public int findNthDigit(int n) {
//		int length = 1;
//		int start =1;
//		long digitnumber = 9;
//		while(n > digitnumber * length){
//			n-=(int)digitnumber*length;
//			start *=10;
//			length++;
//			digitnumber *=10;
//
//		}
//		int number = (n-1)/length;
//		start+=number;
//		return String.valueOf(start).charAt((n-1)%length)-'0';
//	}

    // Time Limit Exceeded (2.93s)
//	public int findNthDigit(int n) {
//		long counter = 0;
//		int number = 1;
//		while (counter <= n) {
//			int tmp = number;
//			int digitsInNumber = 1;
//			while (tmp > 9) {
//				tmp /= 10;
//				digitsInNumber++;
//			}
//			if (counter + digitsInNumber < n) {
//				counter += digitsInNumber;
//				number++;
//			} else {
//				StringBuilder numberAsString = new StringBuilder();
//				numberAsString.append(number);
//				for (int i = 0; i < numberAsString.length(); i++) {
//					counter++;
//					if (counter == n) {
//						return Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
//					}
//				}
//			}
//		}
//		return -1;
//	}

    // Time Limit Exceeded (8.1s)
//	public int findNthDigit(int n) {
//		long counter = 0;
//		int number = 1;
//		StringBuilder numberAsString = new StringBuilder();
//		while (counter <= n) {
//			numberAsString.setLength(0);
//			numberAsString.append(number);
//			if (counter + numberAsString.length() < n) {
//				counter += numberAsString.length();
//				number++;
//			} else {
//				for (int i = 0; i < numberAsString.length(); i++) {
//					counter++;
//					if (counter == n) {
//						return Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
//					}
//				}
//				number++;
//			}
//		}
//		return -1;
//	}

    //  Time Limit Exceeded (12.11s)
//	public int findNthDigit(int n) {
//		long counter = 0;
//		int number = 1;
//		while (counter <= n) {
//			String numberAsString = String.valueOf(number);
//			if (counter + numberAsString.length() < n) {
//				counter += numberAsString.length();
//				number++;
//			} else {
//				for (char digitChar : numberAsString.toCharArray()) {
//					counter++;
//					if (counter == n) {
//						return Integer.parseInt(String.valueOf(digitChar));
//					}
//				}
//				number++;
//			}
//		}
//		return -1;
//	}

    // Memory Limit Exceeded
//	public int findNthDigit(int n) {
//		StringBuilder sb = new StringBuilder();
//		int counter = 1;
//		while (sb.length() < n) {
//			sb.append(counter++);
//		}
//		return Integer.parseInt(String.valueOf(sb.charAt(n - 1)));
//	}

}