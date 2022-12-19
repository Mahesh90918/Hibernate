package com.inheritance;

public class B extends A{
	public B() {
		System.out.println("b");
		
	}

	public B(int i) {
		this();
		System.out.println(i);
	}
}
