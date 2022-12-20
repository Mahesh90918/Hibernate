package com.Impl.Strings;

public class StringExamples {
	public static void main(String[] args) {
		StringBuffer Sb = new StringBuffer();
		long StartingTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			Sb.append("Welcome");
		}
		System.out.println("ExecuteTime :" + (System.currentTimeMillis() - StartingTime));
		StringBuilder Sb1 = new StringBuilder();
		StartingTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			Sb1.append("Welcome");
		}
		System.out.println("ExecuteTime :" + (System.currentTimeMillis() - StartingTime));
	}
}
