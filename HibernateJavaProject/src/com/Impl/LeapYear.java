package com.Impl;

import java.time.Year;

public class LeapYear {
	public static void main(String[] args) {

		int n = 2012;
		Year y = Year.of(n);
		if (y.isLeap())
			System.out.printf("%d is Leap year", n);
		else
			System.out.printf("%d is not Leap year", n);
	}
}
