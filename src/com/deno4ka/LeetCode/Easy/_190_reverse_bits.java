package com.deno4ka.LeetCode.Easy;

/*
Reverse bits of a given 32 bits unsigned integer.

Example:
Input: 43261596
Output: 964176192
Explanation: 43261596 represented in binary as 00000010 10010100 00011110 10011100,
     return 964176192 represented in binary as 00111001 01111000 00101001 01000000.

Explanation: 2147483648 == -2147483648 represented in binary as 10000000 00000000 00000000 00000000,
     return                          1 represented in binary as 00000000 00000000 00000000 00000001.

Follow up:
If this function is called many times, how would you optimize it?
*/

public class _190_reverse_bits {

	public _190_reverse_bits() {
//		System.out.println(reverseBits(43261596) + " = 964176192"); // 964176192
//		int vInt = Integer.parseUnsignedInt("2147483648");
//		System.out.println(vInt);
		System.out.println(reverseBits(  Integer.parseUnsignedInt("2147483648")) + " = 1"); // 1
		System.out.println(reverseBits(  Integer.parseUnsignedInt("2147483649")) + " = -2147483647"); // -2147483647
	}

	// you need treat n as an unsigned value

	// from leet.code
//	public int reverseBits(int n) {
//		int result = 0;
//		for (int i = 0; i < 32; i++)
//		{
//			result = ((result << 1) | ((n >> i) & 1));
//		}
//		return result;
//	}

	// v 2.0 'cheat' version
	public int reverseBits(int n) {
		return Integer.reverse(n);
	}

	// v 1.0 my version
//	public int reverseBits(int n) {
//		return Integer.reverse(n);
//		if (n == 0) {
//			return 0;
//		} else {
//			int[] bits = new int[32];
//			int invertedValue = 0;
//			bits[0] = 0;
//			long twoIn31 = (long)Math.pow(2, 31);
//			long invertedBitValue = 1;
//			long bitValue = twoIn31;
//			int i = 0;
//			if (n < 0) {
//				n = (int)(2147483648L + n);
//				bits[0] = 1;
//				bitValue /= 2;
//				invertedValue += bits[i] * invertedBitValue;
//				invertedBitValue *= 2;
//				i++;
//			}
//			for (; i < bits.length; i++) {
//				if (n >= bitValue) {
//					n -= bitValue;
//					bits[i] = 1;
//				} else {
//					bits[i] = 0;
//				}
//				bitValue /= 2;
//				invertedValue += bits[i] * invertedBitValue;
//				invertedBitValue *= 2;
//			}
//			return invertedValue;
//		}
//	}

}