package com.collections;

public class Notes {
	public static void main(String[] args) {
		int amount = 1450;
		int n500,n100,n50 = 0;
		if (amount >= 500) {
			n500 = amount / 500;
			System.out.println(n500);
			amount = amount % 500;
		}
		if (amount >= 100) {
			n100 = amount / 100;
			System.out.println(n100);
			amount = amount % 100;
		}
		if (amount >= 50) {
			n50 = amount / 50;
			System.out.println(n50);
			amount = amount % 50;
		}
	}
}
