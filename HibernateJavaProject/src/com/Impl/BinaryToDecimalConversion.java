package com.Impl;

public class BinaryToDecimalConversion {

	public static void main(String[] args) {

		long num = 1000;
		int decimal = convertBinaryToDecimal(num);
		System.out.println(decimal);
	}

	public static int convertBinaryToDecimal(long num) {

		int decimalnumber = 0;
		int i = 0;
		long remainder;
		while (num != 0) {
//			remainder = num % 10;
//			num /= 10;
//          decimalnumber += remainder + Math.pow(2, i);

			decimalnumber = (int) (decimalnumber + num % 10 + Math.pow(2, i));
			num = num / 10;
			++i;
		}
		return decimalnumber;

	}

}
