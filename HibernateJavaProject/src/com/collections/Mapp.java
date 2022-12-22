package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapp {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("A", 1);
		m.put("a", 2);
		m.put("B", 1);
		m.put("b", 2);
		m.put("C", 1);
		m.put("c", 2);
		m.put("D", 1);

		Set<Entry<String, Integer>> set = m.entrySet();
		for (Entry<String, Integer> entry : set) {
//			System.out.print(entry);
//			if (entry.getKey() != set.size()) {
//				System.out.print(",");
//			}
		}
//		m.forEach((key, value) -> System.out.println(key + "=" + value));
//		m.entrySet().stream().forEach(t->System.out.print(t));
		Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		m1.put(1, 1);
		m1.put(2, 2);
		m1.put(3, 3);
		m1.put(4, 4);
		m1.put(5, 5);
		Set<Entry<Integer, Integer>> set1 = m1.entrySet();
		for (Entry<Integer, Integer> entry : set1) {
			System.out.print(entry);
			if (entry.getKey() != set1.size()) {
				System.out.print(",");
			}
		}
	}
}
