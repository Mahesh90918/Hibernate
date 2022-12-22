package com.arrays;

public class sum10 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 9, 8, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 9) {
					System.out.println(arr[i] + "+" + arr[j] + "=" + (arr[i] + arr[j]));
				}

			}
		}

	}

}
