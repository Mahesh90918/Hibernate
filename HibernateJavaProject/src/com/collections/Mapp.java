package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapp {
	public static void main(String[] args) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 1);
		m.put(2, 2);
		m.put(3, 3);
		m.put(4, 4);
		m.put(5, 1);
		m.put(6, 2);
		m.put(7, 3);
		Set<Entry<Integer, Integer>> set = m.entrySet();
		for (Entry<Integer, Integer> entry : set) {
			System.out.print(entry);
			if (entry.getKey() != set.size()) {
				System.out.print(",");
			}
		}
	}
}
