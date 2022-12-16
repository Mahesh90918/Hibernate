package com.Sarada;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number");
		int a = sc.nextInt();
		System.out.print("Enter Second number");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Symbol");
		String symbol = sc.nextLine();
		switch (symbol) {
		case "+":
			System.out.println("Adding OutPut :" + (a + b));
			break;
		case "-":
			System.out.println("SubStraction OutPut :" + (a - b));
			break;
		case "*":
			System.out.println("MULTIPLICATION OutPut :" + (a * b));
			break;
		case "/":
			System.out.println("DIVISON OutPut :" + (a / b));
			break;
		case "%":
			System.out.println("MODULO OutPut :" + (a % b));
			break;

		default:
			System.out.println("please Enter Valid Number");
			break;
		}
	}
}
