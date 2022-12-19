package com.inheritance;

import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
//		new B(5);

		int a = 5;
		int b = 2;
		int total = a + (a > 6 ? ++b : --b);// 6
		System.out.println(total);

	}
}
