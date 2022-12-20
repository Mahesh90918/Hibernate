package com.Impl.Strings;

public class StringExamples1 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();// default 16
		System.out.println(s.capacity());// 16 capacity
		s.append("mahesh");
		System.out.println(s.capacity());// 16 capacity
		s.append("java is a platform independent");// length 30
		System.out.println(s.capacity());// oldcapacity*2+4=16*2+4=36 or 30+16=36
		StringBuffer s1 = new StringBuffer("java is a platform independent");
		System.out.println(s1.length());// 30

	}
}
