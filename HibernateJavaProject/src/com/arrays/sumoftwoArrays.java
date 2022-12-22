package com.arrays;

public class sumoftwoArrays {
	public static void main(String[] args) {
		int arr1[] = { 9, 8, 7 };
		int arr2[] = { 1, 2, 3, 4 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] + arr2[j] == 10) {
					System.out.println(arr1[i] + "+" + arr2[j] + "=" + (arr1[i] + arr2[j]));
				}
			}
		}
	}
}
