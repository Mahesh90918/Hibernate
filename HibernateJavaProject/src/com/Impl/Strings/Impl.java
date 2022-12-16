package com.Impl.Strings;

public class Impl {
	public static void main(String[] args) {
		String s = "mahesh";
		s = s.concat(" unukuru ");// variable needed
		s = s + "mahesh";
		System.out.println(s);

		StringBuffer sb = new StringBuffer("mahesh");
		sb.append(" unukuru");// variable Not needed
//	    sb+"unukuru"; // not taken
		System.out.println(sb);
	}
}
