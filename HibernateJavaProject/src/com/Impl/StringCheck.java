package com.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCheck {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>(Arrays.asList("mahesh", "ravi", "sriman", "shan"));
		for (String s : li) {
			if (s.contains("mahesh")) {
				System.out.println(s);
			}
		}

		li.stream().filter(t -> t.contains("ravi")).forEach(t -> System.out.println(t));
	}
}
