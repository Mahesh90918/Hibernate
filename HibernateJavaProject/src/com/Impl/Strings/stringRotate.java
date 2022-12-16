package com.Impl.Strings;

public class stringRotate {

	// function that rotates s towards left by d
	static String leftrotate(String str, int d) {
		String ans = str.substring(d) + str.substring(0, d);
		return ans;
	}

	// function that rotates s towards right by d
	static String rightrotate(String str, int d) {
		return leftrotate(str, str.length() - d);
	}

	// Driver code
	public static void main(String args[]) {
//		String str1 = "GeeksforGeeks";
//		System.out.println(leftrotate(str1, 2));
//
//		String str2 = "GeeksforGeeks";
//		System.out.println(rightrotate(str2, 2));
//
//		System.out.println(leftrotate("god", 1));
//		System.out.println(rightrotate("odg", 1));
		String s = "dog ogd god";
		String[] te = { s + s };
		for (String st : te) {
			System.out.println(leftrotate(st, te.length).equals("dog dog dog"));
			System.out.println(st);
		}

	}
}
