package learn.java.javacode.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetLearn {
	public static void main(String[] args) {
//		Выводит данные в том порядке в которм вставлены были FIFO
//		не допускает повторений
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
