package com.inheritance;

public class B extends A{
	public B() {
		System.out.println("b");
		
	}

	protected B(int i) {
		this();
		System.out.println(i);
	}@Override
	public void mahesh() {
		// TODO Auto-generated method stub
		super.mahesh();
	}
}
