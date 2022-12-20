package com.inheritance;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
//		new B(5);

		int a = 5;
		int b = 2;
		int total = a + (a > 6 ? ++b : --b);// 6
		System.out.println(total);
		var m = 10;
		var name = "String";// local Variables only
		var fee = "12345";
		var fee1 = 112345.90;
		var v=new String();
		var vv1=new int[]{1,2,3,5,66,9};
		ArrayList<Integer> al=new ArrayList<>();
		al.add(m);

	}
}
