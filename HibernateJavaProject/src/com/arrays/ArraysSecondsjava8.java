package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysSecondsjava8 {
	public static void main(String[] args) {
		List list = Arrays.asList(1, 2,10, 10, 10,11,11, 2, 9, 7, 6, 5, 4, 3);
		Integer i = (Integer) list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst()
				.get();
		System.out.println(i);
		System.out.println("=================================");
		List list1 = Arrays.asList(1, 2,10, 10, 10,11,11,11, 2, 9, 7, 6, 5, 4, 3);
		Integer i1 = (Integer)list1.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
	System.out.println(i1);
	}
}
