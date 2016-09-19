package learn.java.home.Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListLearn {
	public static void main(String[] args) {
		LinkedList<String> linkedListStrings = new LinkedList<>();
		linkedListStrings.add("January");
		linkedListStrings.add("February");
		linkedListStrings.add("January");
		linkedListStrings.add("March");
		linkedListStrings.add("April");
		linkedListStrings.add("May");
		System.out.println(linkedListStrings);
		
		linkedListStrings.removeFirst();
		System.out.println(linkedListStrings);
		
		linkedListStrings.add(2, null);
		System.out.println(linkedListStrings);
		
		linkedListStrings.addFirst("December");
		System.out.println(linkedListStrings);
		
		System.out.println(linkedListStrings.getLast());
		
		System.out.println(linkedListStrings.size());
		
		linkedListStrings.pollFirst();
		System.out.println(linkedListStrings);
		
		linkedListStrings.remove(null);
		System.out.println(linkedListStrings);
		
		linkedListStrings.removeFirstOccurrence("May");
		System.out.println(linkedListStrings);
		
		List<String> lionk = linkedListStrings.subList(0, 2);
		System.out.println(lionk);
	}
}
