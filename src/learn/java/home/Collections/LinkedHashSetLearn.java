package learn.java.home.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetLearn {
	public static void main(String[] args) {
//		Выводит данные в том пор�?дке в которм в�?тавлены были FIFO
//		не допу�?кает повторений
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("A");
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add("D");
		linkedHashSet.add("A");
		linkedHashSet.add("F");
		linkedHashSet.add("G");
		System.out.println(linkedHashSet);
	}
}
